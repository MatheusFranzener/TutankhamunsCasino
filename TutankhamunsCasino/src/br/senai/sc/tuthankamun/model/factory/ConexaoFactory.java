package br.senai.sc.tuthankamun.model.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {
    private final String URL = "jdbc:mysql://localhost:3306/tutankhamun";
    private final String USER = "root";
    private final String PASSWORD = "root";

    public Connection conectaBD() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e){
            throw new RuntimeException("A conexão não pode ser realizada!");
        }
    }
}
