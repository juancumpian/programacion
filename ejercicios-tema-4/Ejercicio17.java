import java.util.Scanner;
public class Ejercicio17{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Dime un numero entero");
	numero = teclado.nextInt();
	
	
    System.out.println("La última cifra del número introducido es el " + (numero % 10));
	}
}
