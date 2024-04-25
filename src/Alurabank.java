import br.com.alura.alurabank.banco.Calculobancario;
import br.com.alura.alurabank.banco.Dadosbancarios;
import br.com.alura.alurabank.validacoes.Validaconta;

public class Alurabank {
    public static void main(String[] args){

        Dadosbancarios dadosClientes = new Dadosbancarios();
        dadosClientes.mensagemInicial();
        dadosClientes.setAgencia();
        dadosClientes.setConta();

        Validaconta validacao2FA = new Validaconta();
        validacao2FA.getvalidaConta();

        Calculobancario calculoConta = new Calculobancario();
        calculoConta.calculaValorEmConta();


    }
}