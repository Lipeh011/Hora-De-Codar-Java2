import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
		int v;
	    
		v = sc.nextInt();
		
	 if (v > 0) {
		 System.out.println("Numero é postivo: "+ v);	
	   }
	 else if (v == 0 ) {
		 System.out.println("O valor é zero: "+ v);
	 }
	 else if (v < 0) {
		 System.out.println("O valor é negativo: ");
	 }
	}
	
	

}

