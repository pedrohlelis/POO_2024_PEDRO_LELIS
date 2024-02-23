import java.util.Scanner;

public class PrintsName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite seu nome: \n");
        String n = scan.next();
        System.out.printf("Hello World," + n);
        scan.close();
    }
}
