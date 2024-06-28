import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite (1) para ver a area de um quadrado ou (2) para um circulo");
        int a = scanner.nextInt();

        switch(a){
            case 1:
            {
                System.out.println("""
                            8
                        __________
                        |         |
                     8  |         |  8
                        |         |
                        |_________|
                            8
                        """);
                int n = 8;
                int resultado = 8*8;

                System.out.println("A area do quadrado é " + resultado);
                break;
            }

            case 2:
            {
                 System.out.println("""
                          ___   
                        /  |4 \\
                       |   .   |
                        \\ ___ /
                    
                        """);
                

                        double r = 8.0;
                        double area =  3.14159 * r * r;
                
                        System.out.println("A área do círculo é " + area);
                        break;
            }
        }
    }
}
