import java.util.Scanner;
public class ejercicio12{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int aux;
		int numerosecuencia;
		
		System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
		System.out.print("Por favor, introduzca n: ");
		numerosecuencia=teclado.nextInt();
		
		teclado.nextLine();
		
		if(numerosecuencia == 1){
			System.out.println("0");
		}else if(numerosecuencia == 2){
			System.out.println("0 1");
		}else {
			 System.out.print("0 1");
         numero1 = 0;
         numero2 = 1;
         
        while(numerosecuencia > 2) {
            aux = numero1;
				numero1 = numero2;
            numero2 = aux + numero2;
            System.out.print(" " + numero2);
            numerosecuencia--;
			}
		}
	}
}
