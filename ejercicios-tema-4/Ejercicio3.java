import java.util.Scanner;
public class Ejercicio3{
	public static void main (String[] args){
	Scanner s = new Scanner(System.in);
	
	int dia;
	
	System.out.println("dime un numero del 1 al 7");
	dia=s.nextInt();
	
	switch(dia){
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}
	}
}
