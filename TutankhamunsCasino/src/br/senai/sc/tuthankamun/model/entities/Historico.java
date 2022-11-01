package br.senai.sc.tuthankamun.model.entities;

public class Historico {
    private double valorAposta;
    private double valorResultado;
    private String cpfPerfil;

    public Historico(double valorAposta, double valorResultado, String cpfPerfil) {
        this.valorAposta = valorAposta;
        this.valorResultado = valorResultado;
        this.cpfPerfil = cpfPerfil;
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

    public String getCpfPerfil() {
        return cpfPerfil;
    }

    public void setCpfPerfil(String cpfPerfil) {
        this.cpfPerfil = cpfPerfil;
    }

    @Override
    public String toString() {
        return "Historico{" +
                "valorAposta=" + valorAposta +
                ", valorResultado=" + valorResultado +
                ", cpfPerfil='" + cpfPerfil + '\'' +
                '}';
    }
}
