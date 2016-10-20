import java.util.Scanner;
public class Ejercicio18{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	int numero;
	
	System.out.println("dime un numero entero de máximo 5 cifras");
	numero = teclado.nextInt();
	
	if(numero < 10){
		
		System.out.println("el primer numero es: "+(numero));
		
	 }else if(numero < 100){
		 
		 System.out.println("el primer numero es: "+(numero / 10));
		 
	 }else if(numero < 1000){
		
		 System.out.println("el primer numero es: "+(numero / 100));
		 	 
	 }else if(numero < 10000){
		
		 System.out.println("el primer numero es: "+(numero / 1000));
		 	 
	 }else if(numero < 100000){
		 
		 System.out.println("el primer numero es: "+(numero / 10000));
		 
	 }
	
	}
}
