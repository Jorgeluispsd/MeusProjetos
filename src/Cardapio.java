import java.util.Scanner;

public class Cardapio {
    public void mostrarCardapio() {
        System.out.println("Cardapio");
        System.out.println("1- Ovo chocolate ao leite" +
                "\n2- Ovo chocolate branco");
    }

    public void mostrarValores() {
        System.out.println("Valores");
        System.out.println("Peso" +
                "\n250g - R$20.0" +
                "\n350g - R$50.0" +
                "\n500g - R$80.0" +
                "\n750g - R$100.0" +
                "\n1kg - R$120.0");
        System.out.println("Cholate branco + R$10.0");
    }

    public void comprarItem() {
        Scanner teclado = new Scanner(System.in);
        float valor = 0;
        String tipo, peso;
        mostrarCardapio();
        System.out.println("Escolha o tipo de ovo (1 para chocolate ao leite, 2 para chocolate branco):");
        tipo = teclado.nextLine();

        // Verifica a escolha do tipo
        if (tipo.equals("1")) {
            System.out.println("Você escolheu: Ovo chocolate ao leite");
        } else if (tipo.equals("2")) {
            System.out.println("Você escolheu: Ovo chocolate branco");
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        // Solicita e recebe o peso
        mostrarValores();
        System.out.println("Digite o peso desejado (ex: 250g, 350g, 500g, 750g, 1kg):");
        peso = teclado.nextLine();

        // Determina o valor de acordo com o peso
        switch (peso) {
            case "250g":
                valor = 20;
                break;
            case "350g":
                valor = 50;
                break;
            case "500g":
                valor = 80;
                break;
            case "750g":
                valor = 100;
                break;
            case "1kg":
                valor = 120;
                break;
            default:
                System.out.println("Peso inválido!");
                return;
        }

        // Adiciona o custo extra se for chocolate branco
        if (tipo.equals("2")) {
            valor += 10;
        }

        // Exibe o valor total
        System.out.println("Valor total da compra: R$" + valor);
    }
}