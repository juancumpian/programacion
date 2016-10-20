import java.util.Scanner;
public class Ejercicio19{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	int numero;
	
	System.out.println("dime un numero entero de máximo 5 cifras");
	numero = teclado.nextInt();
	
	if(numero > 0){
	
	   if(numero < 10){
		
		System.out.println("tiene una cifra");
		
	   }else if(numero < 100){
		 
		 System.out.println("tiene dos cifras");
		 
	   }else if(numero < 1000){
		
		 System.out.println("tiene tres cifras");
		 	 
	   }else if(numero < 10000){
		
		 System.out.println("tiene cuatro cifras");
		 	 
	   }else if(numero < 100000){
		 
		 System.out.println("tiene cinco cifra");
		 
	 }
	}else if(numero < 0){
		
		if(numero > -10){
		
		System.out.println("tiene una cifra");
		
	   }else if(numero > -100){
		 
		 System.out.println("tiene dos cifra");
		 
	   }else if(numero > -1000){
		
		 System.out.println("tiene tres cifra");
		 	 
	   }else if(numero > -10000){
		
		 System.out.println("tiene cuatro cifra");
		 	 
	   }else if(numero > -100000){
		 
		 System.out.println("tiene cinco cifra");
		 
	 }
		
	
}
	
	}
}
