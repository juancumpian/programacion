import java.util.Scanner;
public class Ejercicio6{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	double altura;
	double tiempo;
	
	System.out.println("dime la altura y te are el tiempo que tarda en caer el objeto");
	altura=teclado.nextDouble();
	
	if(altura == 0){
		System.out.println("error, la altura debe ser diferente a 0");
	}else
	
	System.out.println("el resultado es "+ (Math.sqrt((altura*2)/9.8)) +" segundos");
	
	
	}
}
