package br.senai.sc.tuthankamun.controller;

import br.senai.sc.tuthankamun.model.entities.Historico;
import br.senai.sc.tuthankamun.model.entities.Perfil;
import br.senai.sc.tuthankamun.model.service.PerfilService;

import java.util.Collection;

public class PerfilController {
    PerfilService perfilService = new PerfilService();
    Perfil model;

    public void cadastrar(String cpf, String nome, String email, String senha, Integer nivel, double saldo, Integer jogos, Integer vitorias) {
        Perfil perfilModel = new Perfil(cpf, nome, email, senha, nivel, saldo, jogos, vitorias);
        perfilService.cadastrar(perfilModel);
    }

    public Collection<Perfil> listarTodos() {
        return perfilService.listarTodos();
    }

    public Perfil validaLogin(String email, String senha) {
        PerfilService service = new PerfilService();
        model = service.selecionarPorEMAIL(email);

        return model.validaLogin(senha);
    }

}
