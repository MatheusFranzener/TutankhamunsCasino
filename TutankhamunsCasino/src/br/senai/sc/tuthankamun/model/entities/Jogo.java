package br.senai.sc.tuthankamun.model.entities;

public class Jogo {
    private double valorAposta;
    private double valorJogo;

    public Jogo(double valorAposta, double valorJogo) {
        this.valorAposta = valorAposta;
        this.valorJogo = valorJogo;
    }

    public Jogo() {}

    public double getValorAposta() {
        return valorAposta;
    }

    public void setValorAposta(double valorAposta) {
        this.valorAposta = valorAposta;
    }

    public double getValorJogo() {
        return valorJogo;
    }

    public void setValorJogo(double valorJogo) {
        this.valorJogo = valorJogo;
    }
}
