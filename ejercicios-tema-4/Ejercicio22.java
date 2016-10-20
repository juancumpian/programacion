import java.util.Scanner;
public class Ejercicio22{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	String dia;
	int hora;
	int minuto;
	int total;
	
	System.out.println("dime que dia de la semana es(tiene que ser una hora antes del viernes a las 15:00)(en minuscula)");
	dia = teclado.nextLine();
	
	   switch(dia){
		
		case "lunes":
		
			System.out.println("dime la hora (en formato 24h)");
			hora = teclado.nextInt();
		
			teclado.nextLine();
			
			System.out.println("ahora los minutos");
			minuto = teclado.nextInt();
		
			teclado.nextLine();
		
			hora = 24 - hora;
		
			hora = hora * 60;
		
			minuto = 60 - minuto;
		
			total = hora + minuto + 5220;
		
			System.out.println("faltan: "+total+" minutos");
		
		break;
		
		case "martes":
		
			System.out.println("dime la hora");
			hora = teclado.nextInt();
		
			teclado.nextLine();
		
			System.out.println("ahora los minutos");
			minuto = teclado.nextInt();
		
			teclado.nextLine();
		
			hora = 24 - hora;
		
			hora = hora * 60;
		
			minuto = 60 - minuto;
		
			total = hora + minuto + 3180;
		
			System.out.println("faltan: "+total+" minutos");
		
		break;
		
		case "miercoles":
		
			System.out.println("dime la hora");
			hora = teclado.nextInt();
		
			teclado.nextLine();
		
			System.out.println("ahora los minutos");
			minuto = teclado.nextInt();
		
			teclado.nextLine();
		
		
			hora = 24 - hora;
		
			hora = hora * 60;
		
			minuto = 60 - minuto;
			
			total = hora + minuto + 2340;
		
			System.out.println("faltan: "+total+" minutos");
		
		break;
		
		case "jueves":
		
			System.out.println("dime la hora");
			hora = teclado.nextInt();
		
			teclado.nextLine();
		
			System.out.println("ahora los minutos");
			minuto = teclado.nextInt();
		
			teclado.nextLine();
		
			hora = 24 - hora;
		
			hora = hora * 60;
		
			minuto = 60 - minuto;
		
			total = hora + minuto + 900;
		
			System.out.println("faltan: "+total+" minutos");
	
		break;
		
		case "viernes":
		
			System.out.println("dime la hora");
			hora = teclado.nextInt();
		
			teclado.nextLine();
		
			System.out.println("ahora los minutos");
			minuto = teclado.nextInt();
		
			teclado.nextLine();
		
			hora = 15 - hora;
		
			hora = hora *60;
		
			minuto = 60-minuto;
		
			total = hora + minuto;
		
			System.out.println("faltan: "+total+" minutos");
		
		break;
		
	  }
	
	}
}
