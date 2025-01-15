import java.io.IOException;
import java.util.Scanner;

public class TesteOpcao {
    public void testa(int opcaoSelecionada) throws IOException, InterruptedException {
        Scanner valor = new Scanner(System.in);
        double numero = 0;
        TaxaDeCambio conv = new TaxaDeCambio();
        String endereco;
        double taxaConv;

        switch (opcaoSelecionada) {
            case 1:
                endereco = "https://v6.exchangerate-api.com/v6/077ac129727640d9768f99ff/pair/USD/ARS";
                System.out.println("Digite o valor em dólar a ser convertido em peso argentino");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 2:
                endereco = "https://v6.exchangerate-api.com/v6/a229771268478fd89e89cf2f/pair/ARS/USD";
                System.out.println("Digite o valor em peso argentino a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 3:
                endereco = "https://v6.exchangerate-api.com/v6/a229771268478fd89e89cf2f/pair/USD/BRL";
                System.out.println("Digite o valor em dólar a ser convertido em real");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 4:
                endereco = "https://v6.exchangerate-api.com/v6/a229771268478fd89e89cf2f/pair/BRL/USD";
                System.out.println("Digite o valor em real a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 5:
                endereco = "https://v6.exchangerate-api.com/v6/a229771268478fd89e89cf2f/pair/USD/COP";
                System.out.println("Digite o valor em dólar a ser convertido em peso colombiano");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 6:
                endereco = "https://v6.exchangerate-api.com/v6/a229771268478fd89e89cf2f/pair/COP/USD";
                System.out.println("Digite o valor em peso colombiano a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 7:
                break;
            default:
                System.out.println("Digite um número que corresponda a uma das opções acima");
                break;
        }
    }

}
