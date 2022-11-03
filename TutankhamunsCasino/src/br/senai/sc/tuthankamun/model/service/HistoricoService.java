package br.senai.sc.tuthankamun.model.service;

import br.senai.sc.tuthankamun.model.dao.HistoricoDAO;
import br.senai.sc.tuthankamun.model.entities.Historico;

import java.util.Collection;

public class HistoricoService {
    public void cadastrar(Historico historico) {
        HistoricoDAO historicoDAO = new HistoricoDAO();
        historicoDAO.inserirHistorico(historico);
    }

    public Collection<Historico> listarTodos(String cpf) {
        HistoricoDAO historicoDAO = new HistoricoDAO();
        return historicoDAO.listarTodos(cpf);
    }

}
