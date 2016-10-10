import java.util.Scanner;
public class Ejercicio12{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	String respuesta;
	int puntos = 0;
	
	System.out.println("¿en la asignatura de progrmacion se da java?");
	respuesta = teclado.nextLine();
	
	if(respuesta.equalsIgnoreCase("si")){
		puntos++;
	}
	
	System.out.println("¿hemos dado bucles ya en programacion?");
	respuesta = teclado.nextLine();
	
	if(respuesta.equalsIgnoreCase("No")){
		puntos++;
	}
	
	System.out.println("¿en bases de datos de da sql?");
	respuesta = teclado.nextLine();
	
	if(respuesta.equalsIgnoreCase("Si")){
		puntos++;
	}
	
	System.out.println("¿en sistemas se da el lenguaje c++?");
	respuesta = teclado.nextLine();
	
	if(respuesta.equalsIgnoreCase("no")){
		puntos++;
	}
	
	System.out.println("¿en lenguje de marcas se ve html?");
	respuesta = teclado.nextLine();
	
	if(respuesta.equalsIgnoreCase("si")){
		puntos++;
	}
	
	System.out.println("¿en FOL se dan leyes del trabajador?");
	respuesta = teclado.nextLine();
	
	if(respuesta.equalsIgnoreCase("si")){
		puntos++;
	}
	
	System.out.println("¿en bases de datos veremos uml?");
	respuesta = teclado.nextLine();
	
	if(respuesta.equalsIgnoreCase("no")){
		puntos++;
	}
	
	System.out.println("¿en lenguaje de marcas se ve xml?");
	respuesta = teclado.nextLine();
	
	if(respuesta.equalsIgnoreCase("si")){
		puntos++;
	}
	
	System.out.println("¿en programacion hemos visto java orientado a objetos?");
	respuesta = teclado.nextLine();
	
	if(respuesta.equalsIgnoreCase("no")){
		puntos++;
	}
	
	System.out.println("¿Luis nos enseña comnados de linux?");
	respuesta = teclado.nextLine();
	
	if(respuesta.equalsIgnoreCase("si")){
		puntos++;
	}
	
	
	System.out.println("has sacado "+puntos+" puntos");
	}
}
