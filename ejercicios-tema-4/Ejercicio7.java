import java.util.Scanner;
public class Ejercicio7{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	double nota1;
	double nota2;
	double nota3;
	
	System.out.println("dime la primera nota");
	nota1 = teclado.nextDouble();
	
	if(nota1 < 0 || nota1 > 10){
		System.out.println("esa nota no es valida");
	}else{
	
	 System.out.println("dime la segunda nota");
	 nota2 = teclado.nextDouble();
	
	 if(nota2 < 0 || nota2 > 10){
		 System.out.println("esa nota no es valida");
	 }else{
	
	  System.out.println("dime la tercera nota");
	  nota3 = teclado.nextDouble();
	
	  if(nota3 < 0 || nota3 > 10){
		  System.out.println("esa nota no es valida");
	  }else{
		
		System.out.println("tu media es: "+ (nota1 + nota2 + nota3)/3);
		
				}
			}
		}
	}
}
