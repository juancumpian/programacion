import java.util.Scanner;
public class ejercicio16{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
			
	boolean esta=true;
	int numero;
	int modulo;
	
	System.out.println("dime un numero y te dire si es primo");
	numero = teclado.nextInt();
	
	teclado.nextLine();
	
	for(int i=2;i<numero-1;i++){
		modulo = numero % i;
		if(modulo==0){
			esta=false;
		}
	}
		if(esta){
			System.out.println("el numero es primo");
		}else
			System.out.println("el numero no es primo");

  }
}
