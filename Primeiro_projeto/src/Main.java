public class Main{
    public static void main(String[] args){
           //Espaço para variaveis
            byte idade;
            double peso;
            String nome;
            //Inicializando variaveis
            idade=21;
            peso=70.85;
            nome = "Arthur";
            String informações = """
                    O usuario é %s
                    Ele tem %d anos
                    e pesa %.2f KG
                    """.formatted(nome,idade,peso);
    
        System.out.println(informações);
    }
}