

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite três numeros:");
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("O numero maior é" + a );
        }
        else if (b > a && b > c) {
            System.out.println("O numero maior é " + b);
        }
        else if (c > a && c > b) {
            System.out.println("O numero maior é " + c);
        }
        sc.close();
    }
}