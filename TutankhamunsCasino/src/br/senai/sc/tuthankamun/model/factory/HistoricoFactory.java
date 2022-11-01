package br.senai.sc.tuthankamun.model.factory;

import br.senai.sc.tuthankamun.model.entities.Historico;

public class HistoricoFactory {
    public Historico getHistorico(double valorAposta, double valorResultado, String cpfPerfil) {
        return new Historico(valorAposta, valorResultado, cpfPerfil);
    }
}
