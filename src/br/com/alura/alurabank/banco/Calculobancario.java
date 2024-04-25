package br.com.alura.alurabank.banco;

import java.util.Scanner;

public class Calculobancario extends Dadosbancarios {

    Scanner escolhaMenu = new Scanner(System.in);

    public int escolhaOpcoes;
    private double saldoInicial = 2500.00;
    private double saldoAtual = saldoInicial;
    boolean menu = true;


    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void calculaValorEmConta(){
        while (menu){
            System.out.println("""
            ***** MENU *****
            1 - Extrato
            2 - Deposito
            3 - Saque
            4 - Transferência
            5 - Sair
            ****************
            """);
            this.escolhaOpcoes = Integer.parseInt(escolhaMenu.nextLine());

            if (escolhaOpcoes == 1) {
                System.out.println("O seu saldo atual é de " + getSaldoAtual());
            } else if (escolhaOpcoes == 2) {
                System.out.println("Quanto vcê deseja depositar?");
                double deposito = entradaDeDados.nextDouble();
                saldoAtual += deposito;
                System.out.println("Seu saldo atual é " + saldoAtual);
            } else if (escolhaOpcoes == 3) {
                System.out.println("Digite o valor que deseja sacar: ");
                double saque = entradaDeDados.nextDouble();
                if (saque > saldoAtual) {
                    System.out.println("Você não tem saldo suficiente para realizar essa operação. Escolha a opção 2 e faça um deposito agora mesmo.");
                } else {
                    saldoAtual = saldoAtual - saque;
                    System.out.println("Saque realizado, o seu saldo atual é " + saldoAtual);
                }
            } else if (escolhaOpcoes == 4) {
                System.out.println("Digte o valor que deseja transferir");
                double transferir = entradaDeDados.nextDouble();
                if (transferir > saldoAtual) {
                    System.out.println("Você não tem saldo suficiente para realizar essa operação. Escolha a opção 2 e faça um deposito agora mesmo.");
                } else {
                    saldoAtual = saldoAtual - transferir;
                    System.out.println("Valor transferido com sucesso, o seu saldo atual é " + saldoAtual);
                }
            }else if (escolhaOpcoes == 5){
                System.out.println("Obrigado por usar o AluraBank");
                break;
            } else {
                System.out.println("ERRO G062-810: OPÇÃO INVÁLIDA");
            }
        }
    }
}
