package br.senai.sc.tuthankamun.view;

import br.senai.sc.tuthankamun.controller.HistoricoController;
import br.senai.sc.tuthankamun.controller.PerfilController;
import br.senai.sc.tuthankamun.model.entities.Perfil;

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

    private Perfil perfil = Home.getUsuario();

    public Jogo() {
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        criarMultiplicadores();
        pack();

        jogarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valorAposta = Double.parseDouble(textField1.getText());
                if(perfil.getSaldo() < valorAposta) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                } else {
                    jogo(valorAposta);
                }
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Home menu = new Home(Home.getUsuario());
                menu.setVisible(true);
            }
        });
    }

    private void criarMultiplicadores() {
        image1.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult5.png")));
        image2.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult6.png")));
        image3.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult.png")));
        image4.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult4.png")));
        image5.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult2.png")));
        image6.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult3.png")));
    }

    private void jogo(double valor) {
        double simb1 = 52;
        double simb2 = 78;
        double simb3 = 90;
        double simb4 = 96;
        double simb5 = 99;
        double simb6 = 100;

        int num1 = (int) Math.ceil((Math.random() * 99 + 1));
        int num2 = (int) Math.ceil((Math.random() * 99 + 1));
        int num3 = (int) Math.ceil((Math.random() * 99 + 1));
        int num4 = (int) Math.ceil((Math.random() * 99 + 1));

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0;

        int[] numeros = {num1, num2, num3, num4};

        int contador = 1;
        for (int numero : numeros) {
            if (numero <= simb1) {
                c1++;
                switch (contador) {
                    case 1:
                        niquel1.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult5.png")));
                        break;
                    case 2:
                        niquel2.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult5.png")));
                        break;
                    case 3:
                        niquel3.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult5.png")));
                        break;
                    case 4:
                        niquel4.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult5.png")));
                        break;
                }
            } else if (numero <= simb2) {
                c2++;
                switch (contador) {
                    case 1:
                        niquel1.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult6.png")));
                        break;
                    case 2:
                        niquel2.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult6.png")));
                        break;
                    case 3:
                        niquel3.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult6.png")));
                        break;
                    case 4:
                        niquel4.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult6.png")));
                        break;
                }
            } else if (numero <= simb3) {
                c3++;
                switch (contador) {
                    case 1:
                        niquel1.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult.png")));
                        break;
                    case 2:
                        niquel2.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult.png")));
                        break;
                    case 3:
                        niquel3.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult.png")));
                        break;
                    case 4:
                        niquel4.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult.png")));
                        break;
                }
            } else if (numero <= simb4) {
                c4++;
                switch (contador) {
                    case 1:
                        niquel1.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult4.png")));
                        break;
                    case 2:
                        niquel2.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult4.png")));
                        break;
                    case 3:
                        niquel3.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult4.png")));
                        break;
                    case 4:
                        niquel4.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult4.png")));
                        break;
                }
            } else if (numero <= simb5) {
                c5++;
                switch (contador) {
                    case 1:
                        niquel1.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult2.png")));
                        break;
                    case 2:
                        niquel2.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult2.png")));
                        break;
                    case 3:
                        niquel3.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult2.png")));
                        break;
                    case 4:
                        niquel4.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult2.png")));
                        break;
                }
            } else {
                c6++;
                switch (contador) {
                    case 1:
                        niquel1.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult3.png")));
                        break;
                    case 2:
                        niquel2.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult3.png")));
                        break;
                    case 3:
                        niquel3.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult3.png")));
                        break;
                    case 4:
                        niquel4.setIcon(new ImageIcon(getClass().getResource("/br/senai/sc/tuthankamun/view/mult3.png")));
                        break;
                }
            }
            contador++;
        }

        int mult = 1;

        if (c1 == 4 || c2 == 4 || c3 == 4 || c4 == 4 || c5 == 4 || c6 == 4) {
            mult = 2;
        }

        PerfilController controller = new PerfilController();
        HistoricoController controller2 = new HistoricoController();

        if (c1 >= 3) {
            JOptionPane.showMessageDialog(null, 2 * mult + "x --> Parabéns você ganhou " + valor * 2 * mult + " crocoins.");
            perfil.setSaldo(perfil.getSaldo() + valor * 2 * mult);
            controller.subirNivel(1, perfil.getCpf());
            controller2.inserirHistorico(valor, valor * 2 * mult, perfil.getCpf());
            controller.aumentarJogos(1, 1, perfil.getCpf());
            controller.atualizarSaldo(valor * 2 * mult, perfil.getCpf());
        } else if (c2 >= 3) {
            JOptionPane.showMessageDialog(null, 4 * mult + "x --> Parabéns você ganhou " + valor * 4 * mult + " crocoins.");
            perfil.setSaldo(perfil.getSaldo() + valor * 4 * mult);
            controller.subirNivel(1, perfil.getCpf());
            controller2.inserirHistorico(valor, valor * 4 * mult, perfil.getCpf());
            controller.atualizarSaldo(valor * 4 * mult, perfil.getCpf());
            controller.aumentarJogos(1, 1, perfil.getCpf());
        } else if (c3 >= 3) {
            JOptionPane.showMessageDialog(null, 8 * mult + "x --> Parabéns você ganhou " + valor * 8 * mult + " crocoins.");
            perfil.setSaldo(perfil.getSaldo() + valor * 8 * mult);
            controller.subirNivel(1, perfil.getCpf());
            controller2.inserirHistorico(valor, valor * 8 * mult, perfil.getCpf());
            controller.atualizarSaldo(valor * 8 * mult, perfil.getCpf());
            controller.aumentarJogos(1, 1, perfil.getCpf());
        } else if (c4 >= 3) {
            JOptionPane.showMessageDialog(null, 16 * mult + "x --> Parabéns você ganhou " + valor * 16 * mult + " crocoins.");
            perfil.setSaldo(perfil.getSaldo() + valor * 16 * mult);
            controller.subirNivel(1, perfil.getCpf());
            controller2.inserirHistorico(valor, valor * 16 * mult, perfil.getCpf());
            controller.atualizarSaldo(valor * 16 * mult, perfil.getCpf());
            controller.aumentarJogos(1, 1, perfil.getCpf());
        } else if (c5 >= 3) {
            JOptionPane.showMessageDialog(null, 32 * mult + "x --> Parabéns você ganhou " + valor * 32 * mult + " crocoins.");
            perfil.setSaldo(perfil.getSaldo() + valor * 32 * mult);
            controller.subirNivel(1, perfil.getCpf());
            controller2.inserirHistorico(valor, valor * 32 * mult, perfil.getCpf());
            controller.atualizarSaldo(valor * 32 * mult, perfil.getCpf());
            controller.aumentarJogos(1, 1, perfil.getCpf());
        } else if (c6 >= 3) {
            JOptionPane.showMessageDialog(null, 64 * mult + "x --> Parabéns você ganhou " + valor * 64 * mult + " crocoins.");
            perfil.setSaldo(perfil.getSaldo() + valor * 64 * mult);
            controller.subirNivel(1, perfil.getCpf());
            controller2.inserirHistorico(valor, valor * 64 * mult, perfil.getCpf());
            controller.atualizarSaldo(valor * 64 * mult, perfil.getCpf());
            controller.aumentarJogos(1, 1, perfil.getCpf());
        } else {
            JOptionPane.showMessageDialog(null, "Você não ganhou nada! R$ - " + valor);
            perfil.setSaldo(perfil.getSaldo() - valor);
            controller.atualizarSaldo(-valor, perfil.getCpf());
            controller2.inserirHistorico(valor, 0, perfil.getCpf());
            controller.aumentarJogos(1, 0, perfil.getCpf());
        }
    }
}
