package br.com.alura.alurabank.banco;

import java.util.Scanner;

public class Dadosbancarios {
    private String nomeTitular = "Jaqueline Oliveira";
    private String tipoConta = "corrente";
    private int agencia;
    private int conta;

    Scanner entradaDeDados = new Scanner(System.in);

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia() {
        System.out.println("Digite o número da agência: ");
        this.agencia = Integer.parseInt(entradaDeDados.nextLine());
    }

    public int getConta() {
        return conta;
    }

    public void setConta() {
        System.out.println("Digite o número da conta: ");
        this.conta = Integer.parseInt(entradaDeDados.nextLine());
    }

    public void mensagemInicial(){
        System.out.println("Bem-vindos ao AluraBank, seu banco digital.");
    }
}
