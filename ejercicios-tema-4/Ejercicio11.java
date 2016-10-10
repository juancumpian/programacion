import java.util.Scanner;
public class Ejercicio11{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	int hora;
	int minuto;
	int segundo;
	
	System.out.println("dime la hora");
	hora=teclado.nextInt();
	
	System.out.println("dime los minutos");
	minuto=teclado.nextInt();
		
	if(minuto > 59){
		System.out.println("error en el minutero");
	}else if(hora > 23){
		System.out.println("error en la hora");
	}
	
	minuto = minuto * 60;
	hora = hora * 3600;
	
	segundo = minuto + hora;
	
	segundo = 86400 - segundo;
	
	System.out.println("quedan "+segundo+" segundos hasta la medianoche");
}
}
