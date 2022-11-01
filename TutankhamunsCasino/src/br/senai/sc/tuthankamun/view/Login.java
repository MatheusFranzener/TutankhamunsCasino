package br.senai.sc.tuthankamun.view;

import br.senai.sc.tuthankamun.controller.PerfilController;
import br.senai.sc.tuthankamun.model.entities.Perfil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements Runnable {
    private JTextField emailTextField;
    private JPasswordField senhaPasswordField;
    private JCheckBox lembrarSenhaCheckBox;
    private JButton logarButton;
    private JPanel panel;
    private JButton nãoPossuiCadastroButton;

    public Login() {
        criarComponentes();
        logarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PerfilController controller = new PerfilController();
                try {
                    Perfil perfil = controller.validaLogin(emailTextField.getText(), senhaPasswordField.getText());
                    dispose();
                    Home home = new Home(perfil);
                    home.setVisible(true);
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });

        nãoPossuiCadastroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Cadastro cadastro = new Cadastro();
                cadastro.setVisible(true);
            }
        });
    }

    private void criarComponentes() {
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        Login programa = new Login();
        programa.run();
    }

    @Override
    public void run() {
        if (!isVisible()) {
            setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "A janela já está aberta");
        }
    }
}
