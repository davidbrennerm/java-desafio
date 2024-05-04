package br.com.alura.alurabank.banco;

import java.util.ArrayList;
import java.util.List;

public class Clientes {

    private String nomeTitular;
    private int agencia;
    private int conta;
    double saldoInicial;

    public List<Clientes> clientes = new ArrayList<>();

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void mensagemInicial(){
        System.out.println("Bem-vindos ao AluraBank, seu banco digital.");
    }

    public Clientes() {
    }

    public Clientes(String nomeTitular, int agencia, int conta, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldoInicial = saldoInicial;
        clientes.add(this);
    }

    public void add(String nomeTitular, int agencia, int conta, double saldoInicial) {
        clientes.add(new Clientes(nomeTitular, agencia, conta, saldoInicial));
    }
}
