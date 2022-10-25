package br.senai.sc.tuthankamun.model.entities;

public class Historico {
    private double valorAposta;
    private double valorResultado;

    public Historico(double valorAposta, double valorResultado) {
        this.valorAposta = valorAposta;
        this.valorResultado = valorResultado;
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
}
