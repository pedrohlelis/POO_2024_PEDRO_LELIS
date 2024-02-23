import java.util.Scanner;

public class HelloWorld {
        public static void main(String[] args) throws Exception
        {
            Scanner ler = new Scanner(System.in);
            System.out.printf("Digite seu nome:\n");
            String n = ler.next();
            System.out.printf("Seu nome: " + n);
            ler.close();
        }
}
