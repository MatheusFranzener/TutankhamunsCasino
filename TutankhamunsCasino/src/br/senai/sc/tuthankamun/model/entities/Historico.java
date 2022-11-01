package br.senai.sc.tuthankamun.model.entities;

public class Historico {
    private double valorAposta;
    private double valorResultado;
    private Integer idPerfil;

    public Historico(double valorAposta, double valorResultado, Integer idPerfil) {
        this.valorAposta = valorAposta;
        this.valorResultado = valorResultado;
        this.idPerfil = idPerfil;
    }

    public Historico() {}

    public double getValorAposta() {
        return valorAposta;
    }

    public void setValorAposta(double valorAposta) {
        this.valorAposta = valorAposta;
    }

    public double getValorResultado() {
        return valorResultado;
    }

    public void setValorResultado(double valorResultado) {
        this.valorResultado = valorResultado;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }
}
