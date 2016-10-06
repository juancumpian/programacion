import java.util.Scanner;
public class Ejercicio5{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	int a;
	int b;
	int x;
	
		System.out.println("dada la siugienete ecuacion digame los numeros para ejecutarla");
		System.out.println("ax+b=0");


		System.out.println("ingrese el numero-> a");
		a=teclado.nextInt();

		System.out.println("ingrese el numero-> b");
		b=teclado.nextInt();
		
		if(a==0 && b == 0){
			System.out.println("la ecuacion tiene infinitas soluciones");
		}else if(a==0){
			System.out.println("la ecuacion no tiene solucion");
		}
			
			
			
		x=(-b)/a;

		System.out.println("el resultado de dicha ecuacion es: "+ x);
		
	}
}
