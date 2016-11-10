import java.util.Scanner;
public class ejercicio15{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
		
		int base=0;
		int exponente=0;
		
		
		System.out.println("dime la base");
		base=teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("dime el exponente");
		exponente=teclado.nextInt();
		
		teclado.nextLine();
		
		int exponente2;
		
		for(int x=0;x<exponente;x++){
			
			int suma =1;
			exponente2=x;
			
			for(int i=0;i<exponente2+1;i++){
					
					suma = suma*base;
			}
			System.out.println("el numero es: "+suma);
		}	
			
			
	
}
}
