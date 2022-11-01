package br.senai.sc.tuthankamun.view;

import br.senai.sc.tuthankamun.controller.PerfilController;
import br.senai.sc.tuthankamun.model.entities.Perfil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    private JPanel panel1;
    private JButton jogarCaçaNíquelButton;
    private JButton verRankingButton;
    private JButton adicionarSaldoButton;
    private JButton visualizarPerfilButton;
    private JButton sairDoSistemaButton;
    private static Perfil usuario;

    public static Perfil getUsuario() {
        return usuario;
    }

    public Home(Perfil perfil) {
        usuario = perfil;
        criarComponentes();
    }

    private void criarComponentes(){
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();

        jogarCaçaNíquelButton.addActionListener(this);
        jogarCaçaNíquelButton.setActionCommand("jogarCaçaNíquel");

        verRankingButton.addActionListener(this);
        verRankingButton.setActionCommand("verRanking");

        adicionarSaldoButton.addActionListener(this);
        adicionarSaldoButton.setActionCommand("adicionarSaldo");

        visualizarPerfilButton.addActionListener(this);
        visualizarPerfilButton.setActionCommand("visualizarPerfil");

        sairDoSistemaButton.addActionListener(this);
        sairDoSistemaButton.setActionCommand("sairDoSistema");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "jogarCaçaNíquel":
                dispose();
                Jogo caçaNíquel = new Jogo();
                caçaNíquel.setVisible(true);
                break;
            case "verRanking":
                dispose();
                Ranking ranking = new Ranking();
                ranking.setVisible(true);
                break;
            case "adicionarSaldo":
                PerfilController controller = new PerfilController();
                controller.atualizarSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja adicionar ao seu saldo")), usuario.getCpf());
                break;
            case "visualizarPerfil":
                dispose();
                PerfilUsuario perfil = new PerfilUsuario();
                perfil.setVisible(true);
                break;
            case "sairDoSistema":
                dispose();
                Login login = new Login();
                login.setVisible(true);
                break;
        }
    }
}
