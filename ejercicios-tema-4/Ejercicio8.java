import java.util.Scanner;
public class Ejercicio8{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	double nota1;
	double nota2;
	double nota3;
	double notaMedia;
	
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
		
		notaMedia = (nota1 + nota2 + nota3)/3;
		
		System.out.println("tu media es: "+ notaMedia);
		
		if(notaMedia < 5 && notaMedia >=0){
			System.out.println("insuficiente");
		}else if(notaMedia == 5){
			System.out.println("suficiente");
		}else if(notaMedia == 6){
			System.out.println("bien");
		}else if(notaMedia >=7 && notaMedia <=8){
			System.out.println("notable"); 
		}else if(notaMedia >=9){
			System.out.println("sobresaliente");
		}else
			System.out.println("esa nota no existe");
		
			}
		}
	}
}
}
