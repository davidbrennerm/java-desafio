package br.com.alura.alurabank.validacoes;

import br.com.alura.alurabank.banco.Clientes;

import java.util.List;
import java.util.Scanner;


public class Validaconta implements validacao2FA{

    private final List<Clientes> listaClientes;
    private Clientes clienteValidado;

    public Clientes getClienteValidado() {
        return clienteValidado;
    }

    public Validaconta(List<Clientes> listaClientes){
        this.listaClientes = listaClientes;
    }

    @Override
    public boolean getvalidaConta() {
        Scanner entradaDeDados = new Scanner(System.in);
        while (true) {
            System.out.println("Digite a sua Agencia: ");
            int agenciaDigitada = Integer.parseInt(entradaDeDados.nextLine());
            System.out.println("Digite a sua conta: ");
            int contaDigitada = Integer.parseInt(entradaDeDados.nextLine());

            boolean clienteEncontrado = false;
            for (Clientes cliente : listaClientes) {
                if (cliente.getAgencia() == agenciaDigitada && cliente.getConta() == contaDigitada) {
                    System.out.println("Olá " + cliente.getNomeTitular() + ", escolha uma opção do menu para continuar:");
                    clienteValidado = cliente;
                    clienteEncontrado = true;
                    break;
                }
            }

            if (!clienteEncontrado) {
                System.out.println("""
                    Cliente não encontrado (G062-810)
                    Caso você não seja nosso cliente, procure um de nossos gerentes e abra sua conta hoje mesmo!
                    """);
                System.out.println("Deseja tentar novamente? (S/N): ");
                String resposta = entradaDeDados.nextLine();
                if (!resposta.equalsIgnoreCase("S")) {
                    System.out.println("Obrigado por usar o AluraBank!");
                    return false;
                }
            } else {
                return true;
            }
        }
    }
}