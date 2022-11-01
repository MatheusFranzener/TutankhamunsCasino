package br.senai.sc.tuthankamun.model.entities;

public class Perfil {
    private String cpf;
    private String nome;
    private String email;
    private String senha;

    private Integer jogos;
    private Integer nivel;
    private Integer vitorias;
    private double saldo;

    private Historico historico;

    public Perfil(String cpf, String nome, String email, String senha, Integer nivel, double saldo, Integer jogos, Integer vitorias) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.jogos = jogos;
        this.nivel = nivel;
        this.vitorias = vitorias;
        this.saldo = saldo;
    }

    public Perfil() {}

    public Perfil validaLogin(String senha) {
        if (this.getSenha().equals(senha))
            return this;
        throw new RuntimeException("Senha incorreta!");
    }

    public void adicionarSaldo(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getJogos() {
        return jogos;
    }

    public void setJogos(Integer jogos) {
        this.jogos = jogos;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", jogos=" + jogos +
                ", nivel=" + nivel +
                ", vitorias=" + vitorias +
                ", saldo=" + saldo +
                '}';
    }
}
