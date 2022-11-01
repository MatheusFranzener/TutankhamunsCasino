package br.senai.sc.tuthankamun.view;

import br.senai.sc.tuthankamun.controller.PerfilController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro extends JFrame {
    private JPanel panel1;
    private JTextField cpfInput;
    private JTextField nomeInput;
    private JTextField emailInput;
    private JPasswordField senhaInput;
    private JButton cadastrarButton;


    public Cadastro(){
        criarComponentes();

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cpfInput.getText().isEmpty() ||
                        nomeInput.getText().isEmpty() ||
                        emailInput.getText().isEmpty() ||
                        senhaInput.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Há campos vazios! \n" +
                                    "Preencha e tente novamente!");
                } else {
                    PerfilController controller = new PerfilController();
                    try {
                        controller.cadastrar(cpfInput.getText(),
                                nomeInput.getText(), emailInput.getText(),
                                senhaInput.getText(), 1, 0.0, 0, 0);
                        dispose();
                        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                        voltar();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, exception.getMessage());
                    }
                }
            }
        });
    }

    private void voltar() {
        Login login = new Login();
        login.setVisible(true);
    }

    private void criarComponentes() {
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }

}
