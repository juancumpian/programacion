import java.util.Scanner;
public class Ejercicio2{
	public static void main (String[] args){
	Scanner s = new Scanner(System.in);
	
	int horadeldia;
	
	System.out.println("dime la hora (solamente la hora)");
	horadeldia = s.nextInt();
	
	if(horadeldia >= 6 && horadeldia <= 12){
		System.out.println("Buenos dias");
	}else if(horadeldia >= 13 && horadeldia <= 20){
		System.out.println("Buenas tardes");
	}else if(horadeldia > 24 || horadeldia < 1){
		System.out.println("esa hora no existe");
	}else if(horadeldia >= 21 || horadeldia <= 5){
		System.out.println("Buenas noches");
	}
		
	}
}
