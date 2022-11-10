
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    
    double nota1, nota2, nota3, nota4;
    double media;
    
    nota1 = sc.nextDouble();
    nota2 = sc.nextDouble();
    nota3 = sc.nextDouble();
    nota4 = sc.nextDouble();
    
    media = (nota1 + nota2 + nota3 + nota4) / 4;    
    
    if (media >= 6.0) {
    	System.out.println("Parabéns você foi aprovadooo ! Sua nota foi: " + media);
    	
    }
    else {
    	System.out.println("Você foi reprovado. Sua nota foi  " + media);
    }
    sc.close();
    }
}