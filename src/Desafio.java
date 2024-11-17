import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nomeUsuario = "Amanda";
        String tipoDeConta = "Corrente";
        double saldo = 1562.00;
        int opcao = 0;


        System.out.println("**************************");

        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);

        System.out.println("****************************");

        String menu = """
                *** DIGITE SUA OPÇÃO ***
                1. Consultar saldo
                2. Transferencia de valor
                3. Receber valor
                4. Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("O saldo atualizado é de " + saldo);
            } else if (opcao == 2) {
                System.out.println("Quanto você deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("SALDO INSUFICIENTE");
                } else {
                    saldo -= valor;
                    System.out.println("Seu saldo atual é de " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido? ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Seu saldo atualizado é de " + saldo);
            }
        }


    }
}