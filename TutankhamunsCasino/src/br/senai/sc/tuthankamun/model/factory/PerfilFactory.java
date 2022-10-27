package br.senai.sc.tuthankamun.model.factory;

import br.senai.sc.tuthankamun.model.entities.Historico;
import br.senai.sc.tuthankamun.model.entities.Perfil;

public class PerfilFactory {
    public Perfil getPerfil(String cpf, String nome, String email, String senha, Integer nivel, double saldo, Integer jogos, Integer vitorias) {
        return new Perfil(cpf, nome, email, senha, nivel, saldo, jogos, vitorias);
    }
}
