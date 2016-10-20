import java.util.Scanner;
public class Ejercicio21{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
		double nota1;
		double nota2;
		double notaFinal;
		String apto;
		
		
		System.out.println("Dime la primera nota");
		nota1 = teclado.nextDouble();
		
		
		if(nota1 > 10){
			System.out.println("esa nota no es valida");
		}else{
	
		System.out.println("Dime la segunda nota");
		nota2 = teclado.nextDouble();
		
		if(nota2 > 10){
			System.out.println("esa nota no es valida");
		}else{
		
		notaFinal = (nota1 + nota2)/2;
		
		if(notaFinal >= 5){
			
			System.out.println("has aprobado has sacado un: "+notaFinal);
						
		}else if(notaFinal < 5){
			
			teclado.nextLine();
			
			System.out.println("has supendido, ¿aprobaste la racuperacion? (apto/no apto)");
			apto = teclado.nextLine();
			
			
			
			if(apto.equalsIgnoreCase("apto")){
				
				System.out.println("has aprobado, ha sacado un: 5");
				
			}else if(apto.equalsIgnoreCase("no apto")){
			
				System.out.println("has supendido con un: "+notaFinal);
			}
		}
		
	    }
		}
	}
}
