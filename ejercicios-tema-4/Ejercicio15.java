import java.util.Scanner;
public class Ejercicio15{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	String caracter;
	String direccion;
	
	System.out.println("dime el caracter");
	caracter = teclado.nextLine();	
	
	if(caracter.length() > 1){
		System.out.println("dime un solo caracter");
	}
	
	System.out.println("dime la direccion de la piramide(arriba, abajo, izquierda, derecha)");
	direccion = teclado.nextLine();	
	
	switch(direccion){
		case "arriba":
		
		System.out.println("  "+caracter);
		System.out.println(" "+caracter+caracter+caracter);
		System.out.println(caracter+caracter+caracter+caracter+caracter);
		
		break;
		
		case "abajo":
	
		System.out.println(caracter+caracter+caracter+caracter+caracter);
		System.out.println(" "+caracter+caracter+caracter);
		System.out.println("  "+caracter);
		
		break;
	
		case "izquierda":
		System.out.println("  "+caracter);
		System.out.println(" "+caracter+caracter);
		System.out.println(caracter+caracter+caracter);
		System.out.println(" "+caracter+caracter);
		System.out.println("  "+caracter);
		
		break;
		
		case "derecha":
		System.out.println(caracter);
		System.out.println(caracter+caracter);
		System.out.println(caracter+caracter+caracter);
		System.out.println(caracter+caracter);
		System.out.println(caracter);
		break;
	  }
	}
 }
