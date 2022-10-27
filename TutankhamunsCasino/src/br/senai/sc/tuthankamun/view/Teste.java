package br.senai.sc.tuthankamun.view;

import br.senai.sc.tuthankamun.controller.PerfilController;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PerfilController controller = new PerfilController();

        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o email: ");
        String email = sc.nextLine();
        System.out.println("Digite a senha: ");
        String senha = sc.nextLine();

        controller.cadastrar(cpf, nome, email, senha, 0,0.0,0,0);

        System.out.println(controller.listarTodos());
        sc.close();
    }
}
