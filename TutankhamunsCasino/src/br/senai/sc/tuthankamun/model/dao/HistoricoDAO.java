package br.senai.sc.tuthankamun.model.dao;

import br.senai.sc.tuthankamun.model.entities.Historico;
import br.senai.sc.tuthankamun.model.entities.Perfil;
import br.senai.sc.tuthankamun.model.factory.ConexaoFactory;
import br.senai.sc.tuthankamun.model.factory.HistoricoFactory;
import br.senai.sc.tuthankamun.model.factory.PerfilFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class HistoricoDAO {
    private Connection historicoConnection;

    public HistoricoDAO() {
        this.historicoConnection = new ConexaoFactory().conectaBD();
    }

    public void inserirHistorico(Historico historico){
        String sql = "insert into historico (aposta, resultado, cpf_perfil) values (?, ?, ?)";

        try (PreparedStatement pstm = historicoConnection.prepareStatement(sql)) {
            pstm.setDouble(1, historico.getValorAposta());
            pstm.setDouble(2, historico.getValorResultado());
            pstm.setString(3, historico.getCpfPerfil());
            try {
                pstm.execute();
            } catch (SQLException e) {
                throw new RuntimeException("Erro na execução do comando SQL");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro na preparação do comando SQL (INSERT)");
        }
    }

    public Collection<Historico> listarTodos(String cpf) {
        Collection<Historico> historicoCollection = new ArrayList<>();
        String sql = "select aposta, resultado from historico where cpf_perfil = ?";

        try (PreparedStatement pstm = historicoConnection.prepareStatement(sql)) {
            pstm.setString(1, cpf);
            try (ResultSet resultSet = pstm.executeQuery()) {
                while (resultSet != null && resultSet.next()) {
                    historicoCollection.add(extrairObjeto(resultSet));
                }
            } catch (SQLException e) {
                throw new RuntimeException("Erro na execução do comando SQL");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro na preparação do comando SQL (SELECT)");
        }

        return historicoCollection;
    }

    private Historico extrairObjeto(ResultSet resultSet) {
        try {
            return new HistoricoFactory().getHistorico(
                    resultSet.getDouble("aposta"),
                    resultSet.getDouble("resultado")
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro na extração do objeto");
        }
    }


}
