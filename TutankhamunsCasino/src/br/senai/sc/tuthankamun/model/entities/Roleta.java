package br.senai.sc.tuthankamun.model.entities;

public class Roleta {
    private Integer multiplicadores;

    public Roleta(Integer multiplicadores) {
        this.multiplicadores = multiplicadores;
    }

    public Roleta() {}

    public Integer getMultiplicadores() {
        return multiplicadores;
    }

    public void setMultiplicadores(Integer multiplicadores) {
        this.multiplicadores = multiplicadores;
    }
}
