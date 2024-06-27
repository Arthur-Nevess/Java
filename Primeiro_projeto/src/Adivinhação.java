import java.util.Random;
import java.util.Scanner;

public class Adivinhação {
    public static void main(String[] args) {
        System.out.println("""
                *****************
                ** Madame Zara **
                *****************
                """);

        Scanner scanner = new Scanner(System.in);
        int numSecreto = new Random().nextInt(100);
        int chute = 0 ; 
        int tentativas = 0 ;
        boolean acertou = false ;

        //Definindo nível
        System.out.println("""
                Em que nivel deseja jogar
                (1)FÁCIL
                (2)MÉDIO
                (3)DIFÍCIL
                """);
        int level = scanner.nextInt();

        switch (level) {
            case 1:
                tentativas = 15;
                break;

            case 2:
                tentativas=10;
                break;

            case 3:
                tentativas = 5;
                break;
            default:
                tentativas = 3;
                break;
        }

        for ( int i = 0 ; i < tentativas ; i++)
        {
            System.out.println("Chance %d de %d".formatted((i+1), tentativas));
            System.out.println("Digite um número entre o e 100");
            chute = scanner.nextInt();

            if(chute == numSecreto)
            {
                acertou = true;
                break;
            }

            else if(chute < numSecreto)
            {
                System.out.println("O número secreto é maior que (%d)".formatted(chute));
            }

            else if(chute > numSecreto)
            {
                System.out.println("O número secreto é menor que (%d)".formatted(chute));
               
            }

            else
            {
                System.out.println("Chute invalido");
                i--;
            }

        }

        if (acertou) {
            System.out.println("You win");
        }
        else{
            System.out.println("Game ouver");
            System.out.println("O número secreto era: " + numSecreto);
        }
    }
}
