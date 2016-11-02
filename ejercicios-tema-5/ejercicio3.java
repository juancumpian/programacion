import java.util.Scanner;
public class ejercicio3{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);

	int i=5;
	
	do{
		
		if(i%5 == 0){
			
		System.out.println(i);
		}
		
		i++;
	
	}while(i<101);
}
}
