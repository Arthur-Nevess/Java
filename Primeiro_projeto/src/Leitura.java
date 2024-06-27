import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
       // System.out.println(filme + " sem duvidas é o melhor filme");

        System.out.println("Digite a data do filme ");
        int data = leitura.nextInt();
        System.out.println("O filme (%s) foi lançado em (%d)".formatted(filme,data));

        if ( data < 2020 ) {
            System.out.println("Filme velho do crl");
        }
        else {
            System.out.println("Muderno, tá potente");
        }
    }
}