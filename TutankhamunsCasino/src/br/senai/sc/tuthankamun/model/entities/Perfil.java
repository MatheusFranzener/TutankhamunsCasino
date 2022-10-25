package br.senai.sc.tuthankamun.model.entities;

public class Perfil {
    private Integer nivel;
    private Integer vitorias;
    private double saldo;

    private Historico historico;
    private Usuario usuario;

    public Perfil(Integer nivel, Integer vitorias, double saldo, Historico historico, Usuario usuario) {
        this.nivel = nivel;
        this.vitorias = vitorias;
        this.saldo = saldo;
        this.historico = historico;
        this.usuario = usuario;
    }

    public Perfil() {}

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
