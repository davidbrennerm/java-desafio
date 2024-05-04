import br.com.alura.alurabank.banco.Calculobancario;
import br.com.alura.alurabank.banco.Clientes;

public class Alurabank {
    public static void main(String[] args){

        Clientes clientes = new Clientes(); // Criação do objeto listaDeClientes

        clientes.add("João Marcos", 0, 0, 3500.00);
        clientes.add("Maria Aparecida", 5, 1, 1500.00);
        clientes.add("David Brener", 0, 2, 5500.00);
        clientes.add("Jaqueline Oliveira", 9,3,5700.00);

        clientes.mensagemInicial();

        Calculobancario calculoConta = new Calculobancario(clientes.clientes);
        calculoConta.calculaValorEmConta();

    }
}
