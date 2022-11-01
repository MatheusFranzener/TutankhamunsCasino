package br.senai.sc.tuthankamun.model.dao;

import br.senai.sc.tuthankamun.model.entities.Historico;
import br.senai.sc.tuthankamun.model.factory.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HistoricoDAO {
    private Connection historicoConnection;

    public HistoricoDAO() {
        this.historicoConnection = new ConexaoFactory().conectaBD();
    }

    public void inserirHistorico(Historico historico){
        String sql = "insert into historico (aposta, resultado, id_perfil) values (?, ?, ?)";

        try (PreparedStatement pstm = historicoConnection.prepareStatement(sql)) {
            pstm.setDouble(1, historico.getValorAposta());
            pstm.setDouble(2, historico.getValorResultado());
            pstm.setInt(3, historico.getIdPerfil());
            try {
                pstm.execute();
            } catch (SQLException e) {
                throw new RuntimeException("Erro na execução do comando SQL");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro na preparação do comando SQL (INSERT)");
        }
    }


}
