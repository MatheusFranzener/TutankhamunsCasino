package br.senai.sc.tuthankamun.controller;

import br.senai.sc.tuthankamun.model.entities.Historico;
import br.senai.sc.tuthankamun.model.entities.Perfil;
import br.senai.sc.tuthankamun.model.service.HistoricoService;

import java.util.Collection;

public class HistoricoController {
    HistoricoService historicoService = new HistoricoService();

    public void inserirHistorico(double valorAposta, double valorResultado, String cpfPerfil) {
        Historico historicoModel = new Historico(valorAposta, valorResultado, cpfPerfil);
        historicoService.cadastrar(historicoModel);
    }

    public Collection<Historico> listarTodos(String cpf) {
        return historicoService.listarTodos(cpf);
    }

}
