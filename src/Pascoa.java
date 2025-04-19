import java.util.Scanner;

public class Pascoa {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("     FELIZ PASCOA    ");
        System.out.println("---------------------");
        System.out.println("VENHA COMPRAR CONOSCO");
        System.out.println("---------------------");
        System.out.println("DESEJA ENCOMENDAR OVO?");
        System.out.println("---------------------");
        String encomendar;
        Cardapio cardapio = new Cardapio();
        Scanner teclado = new Scanner(System.in);
        encomendar = teclado.nextLine();
        if (encomendar.equals("sim")){
            cardapio.mostrarCardapio();
            cardapio.mostrarValores();
            System.out.println("Qual item você deseja comprar?");
            cardapio.comprarItem();
            System.out.println("ENCOMENDA REALIZADA");
        }
        else {
            System.out.println("ENCOMENDA CANCELADA");
            System.out.println("---------------------");
            System.out.println("     FELIZ PASCOA    ");
            System.out.println("---------------------");
        }
    }
}