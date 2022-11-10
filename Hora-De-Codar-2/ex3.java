
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe três numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int soma;

        if (c < a && a < b) {
            soma = a + b;
            System.out.println("A soma será: " + soma);
        }

        else if (b < a && a < c) {
            soma = a + c;
            System.out.println("A soma será: " + soma);
        }

        else if (a > c) {
            soma = a + b;
            System.out.println("A soma será: " + soma);
        }
        else {
            soma = b + c;
            System.out.println("A soma será: " + soma);
        }
      sc.close();
    }
}
