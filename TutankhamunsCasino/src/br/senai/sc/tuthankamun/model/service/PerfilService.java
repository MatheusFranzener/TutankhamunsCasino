package br.senai.sc.tuthankamun.model.service;

import br.senai.sc.tuthankamun.model.dao.PerfilDAO;
import br.senai.sc.tuthankamun.model.entities.Perfil;

import java.util.Collection;

public class PerfilService {
    public void cadastrar(Perfil perfil) {
        PerfilDAO perfilDAO = new PerfilDAO();
        perfilDAO.cadastrar(perfil);
    }

    public Collection<Perfil> listarTodos() {
        PerfilDAO perfilDAO = new PerfilDAO();
        return perfilDAO.listarTodos();
    }
}
