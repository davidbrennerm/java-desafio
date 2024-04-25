package br.com.alura.alurabank.validacoes;

import br.com.alura.alurabank.banco.Dadosbancarios;

public class Validaconta extends Dadosbancarios implements validacao2FA {

    boolean validarConta = true; // criar o while da validacao de clientes

    @Override
    public int getvalidaConta() {
        if (getAgencia() == 0 && getConta() == 1) {
            System.out.println("Olá " + getNomeTitular() + ", escolha uma opção do menu para continuar:");
        } else {
            System.out.println("""
                    Cliente não encontrado (G062-810)
                    Caso você não seja nosso cliente, procure um de nossos gerentes e abra sua conta hoje mesmo!
                    """);
        }
        return 0;
    }
}
