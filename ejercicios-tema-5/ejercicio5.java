import java.util.Scanner;
public class ejercicio5{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);

	int numero = 320;
	
	int p = 0;
	
	while(p<9){
		
		if(numero >= 160){
			
			System.out.println(numero);
			
			numero -= 20;
			
			
		}
		p++;
		
	}

	}
}
