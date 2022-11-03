package br.senai.sc.tuthankamun.view;

import br.senai.sc.tuthankamun.controller.HistoricoController;
import br.senai.sc.tuthankamun.controller.PerfilController;
import br.senai.sc.tuthankamun.model.entities.Perfil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerfilUsuario extends JFrame {
    private JPanel panel1;
    private JTable tabelaHistorico;
    private JTable tabelaPerfil;
    private JButton button1;
    private JLabel labelNome;
    private JLabel labelNivel;
    private JLabel labelSaldo;

    private Perfil perfil = Home.getUsuario();

    public PerfilUsuario(){
        criarComponentes();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Home menu = new Home(Home.getUsuario());
                menu.setVisible(true);
            }
        });
    }

    private void criarComponentes(){
        HistoricoController controller = new HistoricoController();
        PerfilController perfilController = new PerfilController();

        tabelaHistorico.setModel(new DefaultTableModelCollectionHistorico(controller.listarTodos(perfil.getCpf())));
        tabelaHistorico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        tabelaPerfil.setModel(new DeafaultModelCollectionPerfil(perfilController.listarDadosPerfil(perfil.getCpf())));
        tabelaPerfil.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        labelNome.setText(perfil.getNome());
        labelNivel.setText(String.valueOf(perfil.getNivel()));
        labelSaldo.setText(String.valueOf(perfil.getSaldo()));

        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }
}
