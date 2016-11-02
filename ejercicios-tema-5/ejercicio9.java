import java.util.Scanner;
public class ejercicio9{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
		int numero;
		
		int contador=0;
		
		System.out.println("dime un numero entero para contar sus digitos");
		numero = teclado.nextInt();
		
		teclado.nextLine();
	
		while(numero>10){
		
			numero = numero / 10;
			
			
			contador++;
			
		}
		contador++;
		
		System.out.println("tiene "+contador+" digitos");
	}
}
