import java.util.Scanner;
public class ejercicio17{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	int numero=0;
	int suma=0;
	
	
	
	do{
		System.out.print("dime el numero: ");
		numero = teclado.nextInt();
	
		teclado.nextLine();		
		
		if(numero < 0){
			
			System.out.println("escribe un numero positivo");
			
		}
	}while(numero < 0);
	
		
		
		for(int i=numero+1;i<numero+100;i++){
				
				suma+=i;
				
			}
			
		System.out.println(suma);
	}
	
}
