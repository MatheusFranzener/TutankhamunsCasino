package br.senai.sc.tuthankamun.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jogo extends JFrame {
    private JPanel panel1;
    private JButton jogarButton;
    private JTextField textField1;
    private JLabel image1;
    private JLabel image2;
    private JLabel image3;
    private JLabel image4;
    private JLabel image5;
    private JLabel image6;
    private JButton voltarButton;
    private JLabel niquel1;
    private JLabel niquel2;
    private JLabel niquel3;
    private JLabel niquel4;

    public Jogo() {
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        criarMultiplicadores();
        pack();
        jogarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarNiquel();
            }
        });
    }

    private void criarMultiplicadores(){
        image1.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult5.png")));
        image2.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult6.png")));
        image3.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult.png")));
        image4.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult4.png")));
        image5.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult2.png")));
        image6.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult3.png")));
    }

    private void criarNiquel(){
        niquel1.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult.png")));
        niquel2.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult.png")));
        niquel3.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult.png")));
        niquel4.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult.png")));
    }


}
