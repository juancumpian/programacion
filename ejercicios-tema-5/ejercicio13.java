import java.util.Scanner;
public class ejercicio13{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
		
		int contadorpositivo = 0;
		int contadornegativo = 0;
		int numero;
		
		for(int i=0;i<11;i++){
		
		numero = 0;
		
		System.out.print("dimne un numero entero positivo o negativo: ");
		numero=teclado.nextInt();
		
		teclado.nextLine();
		
		if(numero > 0){
				contadorpositivo++;
		}else if(numero < 0){
				contadornegativo++;
		}
			
		}
		System.out.println("hay "+contadorpositivo+" positivos y "+contadornegativo+" negativos");
	}
}
