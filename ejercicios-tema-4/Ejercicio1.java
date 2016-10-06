import java.util.Scanner;
public class Ejercicio1{
	public static void main (String[] args){
	Scanner s = new Scanner(System.in);
	
		String diadelasemana;
		
		System.out.println("dime el dia de la semana que quieres saber");
		diadelasemana = s.nextLine();
		
		if(diadelasemana.equalsIgnoreCase("lunes")){
			System.out.println("Ese dia tenemos a primera hora sistemas informaticos");
		}else if(diadelasemana.equalsIgnoreCase("martes")){
			System.out.println("Ese dia tenemos a primera hora programacion");
		}else if(diadelasemana.equalsIgnoreCase("miercoles")){
			System.out.println("Ese dia tenemos a primera hora programacion");
		}else if(diadelasemana.equalsIgnoreCase("jueves")){
			System.out.println("Ese dia tenemos a primera hora bases de datos");
		}else if(diadelasemana.equalsIgnoreCase("viernes")){
			System.out.println("Ese dia tenemos a primera hora lenguaje de marcas");
		}else
		System.out.println("Ese dia de la semana no existe");
	}

}
