import java.util.Scanner;
public class ejercicio10{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
		int contador=0;
		int numero=0;
		int suma=0;
		
		while(numero >=0){
				
			System.out.println("dime un numero para hacer la media (pon uno negativo cuando quieras parar)");
			numero=teclado.nextInt();
			
			teclado.nextLine();
			
			if(numero >= 0){
			
				suma = suma + numero;
			
				contador++;	
			}
			
		}
		
		System.out.println("esta la media de los numeros que has metido: "+suma/contador);
	
	}
}
