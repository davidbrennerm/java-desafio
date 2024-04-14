import java.util.Scanner;

public class desafio{
    public static void main(String[] args){

        String nomeDaConta = "Jaqueline Oliveira";
        String tipoDeConta = "Corrente";
        int agencia = 0;
        int conta = 0;
        double saldoInicial = 2500.00;
        double saldoAtual;
        saldoAtual = saldoInicial;


        Scanner entradDeDados = new Scanner(System.in);
        System.out.println("Bem-vindos ao AluraBank, seu banco digital.");

        boolean validacaoDeConta = true;

        while (validacaoDeConta){
            System.out.println("Digite a sua agência sem traço e espaços: ");
            int entradaAgencia = entradDeDados.nextInt();
            System.out.println("Digite a sua conta sem traço e espaços: ");
            int entradaConta = entradDeDados.nextInt();

            if (entradaAgencia == agencia && entradaConta == conta) {
                System.out.println("Bem-vinda " + nomeDaConta + " ,escolha uma opção do menu para continuar:");
                break;
            } else {
                System.out.println("""
                    Cliente não encontrado (G062-810)
                    Caso você não seja nosso cliente, procure um de nossos gerentes e abra sua conta hoje mesmo!
                    """);
            }
        }

        boolean escolhaOpcoes = true;

        while (escolhaOpcoes){
            System.out.println("""
                ***** MENU *****
                1 - Extrato
                2 - Deposito
                3 - Saque
                4 - Transferência
                5 - Sair
                """);
            int escolhaMenu = entradDeDados.nextInt();

            if (escolhaMenu == 1) {
                System.out.println("O seu saldo atual é de " + saldoAtual);
            } else if (escolhaMenu == 2) {
                System.out.println("Quanto vcê deseja depositar?");
                double deposito = entradDeDados.nextDouble();
                saldoAtual = saldoAtual + deposito;
                System.out.println("Seu saldo atual é " + saldoAtual);
            } else if (escolhaMenu == 3) {
                System.out.println("Digite o valor de saque: ");
                double saque = entradDeDados.nextDouble();
                if (saque > saldoAtual) {
                    System.out.println("Você não tem saldo suficiente para realizar essa operação. Escolha a opção 2 e faça um deposito agora mesmo.");
                } else {
                    saldoAtual = saldoAtual - saque;
                    System.out.println("Saque realizado, o seu saldo atual é " + saldoAtual);
                }
            } else if (escolhaMenu == 4) {
                System.out.println("Digte o valor que deseja transferir");
                double transferir = entradDeDados.nextDouble();
                if (transferir > saldoAtual) {
                    System.out.println("Você não tem saldo suficiente para realizar essa operação. Escolha a opção 2 e faça um deposito agora mesmo.");
                } else {
                    saldoAtual = saldoAtual - transferir;
                    System.out.println("Valor transferido com sucesso, o seu saldo atual é " + saldoAtual);
                }
            } else if (escolhaMenu == 5){
                System.out.println("Obrigado por usar o AluraBank");
                break;
            } else {
                System.out.println("ERRO G062-810: OPÇÃO INVÁLIDA");
            }
        }
    }
}