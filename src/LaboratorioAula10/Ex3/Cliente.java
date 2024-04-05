package LaboratorioAula10.Ex3;

import LaboratorioAula09.Ex2.Conta;

public class Cliente {

    private String nome;
    private String sobrenome;
    private LaboratorioAula09.Ex2.Conta conta;

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LaboratorioAula09.Ex2.Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}