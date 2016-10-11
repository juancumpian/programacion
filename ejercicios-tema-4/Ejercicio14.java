import java.util.Scanner;
public class Ejercicio14{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
		
	int num;
	
	System.out.println("dime el umero");
	num = teclado.nextInt();
	
	if(num % 2 == 0){
		System.out.println("el numero es par");
	}
	
	if(num % 5 == 0){
		System.out.println("el numero es divisible entre 5");
	 }
	}
}
