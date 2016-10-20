import java.util.Scanner;
public class Ejercicio20{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
		
	 
    int n;
    boolean capicua = false;
    
    System.out.print("introduce un número entero de 5 cifras como máximo: ");
    n = teclado.nextInt();
    
        
    if (n < 10) {
      capicua = true;
    }
        
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        capicua = true;
      }
    }

    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        capicua = true;
      }
    }

    if ((n >= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua == true) {
      System.out.println("El número introducido es capicúa.");
    } else {
      System.out.println("El número introducido no es capicúa.");
}	
	
	}
}
