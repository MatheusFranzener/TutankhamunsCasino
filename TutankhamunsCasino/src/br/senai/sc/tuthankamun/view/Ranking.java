package br.senai.sc.tuthankamun.view;

import br.senai.sc.tuthankamun.controller.PerfilController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ranking extends JFrame {
    private JPanel panel1;
    private JTable tabelaRanking;
    private JButton voltarButton;
    private static int lista;

    public Ranking(){
        criarComponentes();
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Home menu = new Home(Home.getUsuario());
                menu.setVisible(true);
            }
        });
    }

    private void criarComponentes(){
        PerfilController perfilController = new PerfilController();
        tabelaRanking.setModel(new DeafaultTableModelCollection(perfilController.listarTodos()));
        tabelaRanking.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }
}
