import java.util.Scanner;
public class ejercicio14{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
		
		int base=0;
		int exponente=0;
		int suma =1;
		
		System.out.println("dime la base");
		base=teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("dime el exponente");
		exponente=teclado.nextInt();
		
		teclado.nextLine();
		
		for(int i=0;i<exponente;i++){
				
				suma = suma*base;
				
		}
		
		System.out.println("el numero es: "+suma);
	}
}	
