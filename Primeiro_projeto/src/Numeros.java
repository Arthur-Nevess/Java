import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        System.out.println("Digite um número e veja se ele é positivo ou negativo");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num<0)
        {
            System.out.println("%d é negativo".formatted(num));
        }
        else if(num > 0)
        {
            System.out.println("%d é positivo".formatted(num));
        }
        else
        {
            System.out.println("Zero é café com leite");
        }
    }
    
}
