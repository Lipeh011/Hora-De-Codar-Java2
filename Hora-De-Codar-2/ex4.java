
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe dez numeros:");
    int v1 = sc.nextInt();
    int v2 = sc.nextInt();
    int v3 = sc.nextInt();
    int v4 = sc.nextInt();
    int v5 = sc.nextInt();
    int v6 = sc.nextInt();
    int v7 = sc.nextInt();
    int v8 = sc.nextInt();
    int v9 = sc.nextInt();
    int v10 = sc.nextInt();
    int media;
    media = v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10 / 10;
    
    System.out.println("A media é " + media);
    sc.close();
    }
}