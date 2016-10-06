import java.util.Scanner;
public class Ejercicio4{
	public static void main (String[] args){
	Scanner s = new Scanner(System.in);
	
	int hora;
	
	System.out.println("dime cuantas horas has trabajado");
	hora = s.nextInt();
	
	if(hora > 40){
		System.out.println("cobraras "+((40 * 12) + ((hora - 40)* 16)) +"€");
	}else
		System.out.println("cobraras "+(40 * 12)+"€");
	}	
}
