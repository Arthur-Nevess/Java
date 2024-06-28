import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número e veja o fatorial");
        int num = scanner.nextInt();
        int n2 = num;
        

        for (int i = 0; i < n2; i++) {
            if(n2 - (i + 1) != 0){
            num = num * (n2 - (i+1));
            }
        }
        System.out.println("O fatorial de %d é ".formatted(n2) + num);
    }
}
