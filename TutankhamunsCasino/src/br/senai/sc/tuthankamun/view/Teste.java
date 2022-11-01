package br.senai.sc.tuthankamun.view;

import br.senai.sc.tuthankamun.controller.HistoricoController;
import br.senai.sc.tuthankamun.controller.PerfilController;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HistoricoController controller = new HistoricoController();

        System.out.println("Informe o valor da aposta: ");
        double valor = sc.nextDouble();
        System.out.println("Resultado: ");
        double resultado = sc.nextDouble();
        System.out.println("Informe o id do usuário: ");
        String cpfPerfil = sc.next();

        controller.inserirHistorico(valor, resultado, cpfPerfil);


        System.out.println(controller.listarTodos());
        sc.close();
    }
}
