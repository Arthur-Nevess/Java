import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int nota=0;
        int media=0;
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Dê uma nota ao filme:");
            Scanner scanner = new Scanner(System.in);
            nota = scanner.nextInt();
            media += nota;
        }
        System.err.println("A media do filme é: " + media/3);
    }
}
