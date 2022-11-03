package br.senai.sc.tuthankamun.model.service;

import br.senai.sc.tuthankamun.model.dao.HistoricoDAO;
import br.senai.sc.tuthankamun.model.dao.PerfilDAO;
import br.senai.sc.tuthankamun.model.entities.Historico;
import br.senai.sc.tuthankamun.model.entities.Perfil;

import java.util.Collection;
import java.util.List;

public class PerfilService {
    public void cadastrar(Perfil perfil) {
        PerfilDAO perfilDAO = new PerfilDAO();
        perfilDAO.cadastrar(perfil);
    }

    public Collection<Perfil> listarTodos() {
        PerfilDAO perfilDAO = new PerfilDAO();
        return perfilDAO.listarTodos();
    }

    public Perfil selecionarPorEMAIL(String email) {
        return new PerfilDAO().selecionarPorEMAIL(email);
    }

    public void atualizarSaldo(double valor, String cpf){
        PerfilDAO perfilDAO = new PerfilDAO();
        perfilDAO.atualizarSaldo(valor, cpf);
    }

    public List<Perfil> listarDadosPerfil(String cpf){
        PerfilDAO perfilDAO = new PerfilDAO();
        return perfilDAO.listarDadosPerfil(cpf);
    }
}
