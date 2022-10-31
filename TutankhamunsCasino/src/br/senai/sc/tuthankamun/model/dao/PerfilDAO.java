package br.senai.sc.tuthankamun.model.dao;

import br.senai.sc.tuthankamun.model.entities.Perfil;
import br.senai.sc.tuthankamun.model.factory.ConexaoFactory;
import br.senai.sc.tuthankamun.model.factory.PerfilFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class PerfilDAO {
    private Connection perfilConnection;

    public PerfilDAO() {
        this.perfilConnection = new ConexaoFactory().conectaBD();
    }

    public void cadastrar(Perfil perfil) {
        String sql = "insert into perfil (cpf, nome, email, senha, nivel, saldo, jogos, vitorias) values (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstm = perfilConnection.prepareStatement(sql)) {
            pstm.setString(1, perfil.getCpf());
            pstm.setString(2, perfil.getNome());
            pstm.setString(3, perfil.getEmail());
            pstm.setString(4, perfil.getSenha());
            pstm.setInt(5, perfil.getNivel());
            pstm.setDouble(6, perfil.getSaldo());
            pstm.setInt(7, perfil.getJogos());
            pstm.setInt(8, perfil.getVitorias());
            try {
                pstm.execute();
            } catch (SQLException e) {
                throw new RuntimeException("Erro na execução do comando SQL");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro na preparação do comando SQL (INSERT)");
        }
    }

    public Collection<Perfil> listarTodos() {
        Collection<Perfil> perfilCollection = new ArrayList<>();
        String sql = "select * from perfil";

        try (PreparedStatement pstm = perfilConnection.prepareStatement(sql)) {
            try (ResultSet resultSet = pstm.executeQuery()) {
                while (resultSet != null && resultSet.next()) {
                    perfilCollection.add(extrairObjeto(resultSet));
                }
            } catch (SQLException e) {
                throw new RuntimeException("Erro na execução do comando SQL");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro na preparação do comando SQL (SELECT)");
        }

        return perfilCollection;
    }

    public Perfil selecionarPorEMAIL(String email){
        String sql = "select * from perfil where email = ? limit 1";

        try(PreparedStatement prtm = perfilConnection.prepareStatement(sql)){
            prtm.setString(1, email);
            try (ResultSet resultSet = prtm.executeQuery()){
                if(resultSet.next()){
                    return extrairObjeto(resultSet);
                }
            } catch (Exception e){
                throw new RuntimeException("Erro na execução do comando SQL");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro na preparação do comando SQL");
        }

        throw new RuntimeException("E-mail não encontrado!");
    }

    private Perfil extrairObjeto(ResultSet resultSet) {
        try {
            return new PerfilFactory().getPerfil(
                    resultSet.getString("cpf"),
                    resultSet.getString("nome"),
                    resultSet.getString("email"),
                    resultSet.getString("senha"),
                    resultSet.getInt("nivel"),
                    resultSet.getDouble("saldo"),
                    resultSet.getInt("jogos"),
                    resultSet.getInt("vitorias")
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro na extração do objeto");
        }
    }
}
