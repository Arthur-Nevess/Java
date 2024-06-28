import java.util.Scanner;

public class Compara{
    public static void main(String[] args) {
        int n;
        int n2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        n = scanner.nextInt();

        System.out.println("Digite outro número para que eu faça comparações");
        n2 = scanner.nextInt();

        if (n == n2){
            System.out.println("Você digitou números iguais!");
        }
        else if(n > n2){
            System.out.println("O primeiro número é maior que o segundo");
        }
        else if(n2 > n){
            System.out.println("O segundo número é maior que o primeiro");
        }

    }
}