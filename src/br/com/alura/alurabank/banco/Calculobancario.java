package br.com.alura.alurabank.banco;

import br.com.alura.alurabank.validacoes.Validaconta;

import java.util.List;
import java.util.Scanner;

public class Calculobancario {

    Scanner escolhaMenu = new Scanner(System.in);

    public List<Clientes> listaDeClientes;

    public Calculobancario(List<Clientes> clientes) {
        this.listaDeClientes = clientes;
    }

    public void calculaValorEmConta() {

        Validaconta validacao2FA = new Validaconta(listaDeClientes);
        if (validacao2FA.getvalidaConta()) {
            Clientes clienteValidado = validacao2FA.getClienteValidado();

            double saldoAtual = clienteValidado.getSaldoInicial();


            while (true) {
                System.out.println("""
                        ***** MENU *****
                        1 - Extrato
                        2 - Depósito
                        3 - Saque
                        4 - Transferências
                        5 - Sair
                        ****************
                        """);
                int escolhaOpcoes = Integer.parseInt(escolhaMenu.nextLine());

                if (escolhaOpcoes == 1) {
                    System.out.println("O seu saldo atual é de " + saldoAtual);
                } else if (escolhaOpcoes == 2) {
                    System.out.println("Quanto valor você deseja depositar?");
                    double deposito = Double.parseDouble(escolhaMenu.nextLine());
                    saldoAtual += deposito;
                    System.out.println("Seu saldo atual é " + saldoAtual);
                } else if (escolhaOpcoes == 3) {
                    System.out.println("Digite o valor que você deseja sacar: ");
                    double saque = Double.parseDouble(escolhaMenu.nextLine());
                    if (saque > saldoAtual) {
                        System.out.println("Você não tem saldo suficiente para realizar essa operação. Escolha a opção 2 e faça um depósito agora mesmo");
                    } else {
                        saldoAtual -= saque;
                        System.out.println("Saque realizado, o seu saldo atual é " + saldoAtual);
                    }
                } else if (escolhaOpcoes == 4) {
                    System.out.println("Digite o valor que deseja transferir");
                    double transferir = Double.parseDouble(escolhaMenu.nextLine());
                    if (transferir > saldoAtual) {
                        System.out.println("Você não tem saldo suficiente para realizar essa operação. Escolha a opção 2 e faça um depósito agora mesmo.");
                    } else {
                        saldoAtual -= transferir;
                        System.out.println("Valor transferido com sucesso, o seu saldo atual é " + saldoAtual);
                    }
                } else if (escolhaOpcoes == 5) {
                    System.out.println("Obrigado por usar o AluraBank!");
                    break;
                } else {
                    System.out.println("ERRO G062-810: OPÇÃO INVÁLIDA");
                }
            }
        }
    }
}
