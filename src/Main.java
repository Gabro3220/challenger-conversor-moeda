import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        boolean continuar = true;


        while (continuar) {

            System.out.println("Escolha uma opção de conversão:");
            System.out.println("1 - Dólar para Peso Argentino");
            System.out.println("2 - Peso Argentino para Dólar");
            System.out.println("3 - Dólar para Real Brasileiro");
            System.out.println("4 - Real Brasileiro para Dólar");
            System.out.println("5 - Dólar para Peso Colombiano");
            System.out.println("6 - Peso Colombiano para Dólar");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");


            int opcao = leitura.nextInt();


            if (opcao < 1 || opcao > 7) {
                System.out.println("Opção inválida! Por favor, insira um número entre 1 e 7.");
                continue;
            }

            if (opcao == 7) {
                System.out.println("Você escolheu sair. Programa encerrado.");
                break;
            }


            TesteOpcao conversao = new TesteOpcao();
            conversao.testa(opcao);


            System.out.print("Deseja realizar outra conversão? (s/n): ");
            String resposta = leitura.next();
            continuar = resposta.equalsIgnoreCase("s");
        }


        leitura.close();
    }
}