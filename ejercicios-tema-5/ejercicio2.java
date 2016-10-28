import java.util.Scanner;
public class ejercicio2{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	int p=5;
	
	while(p<101){
		
		if(p%5 == 0){
		System.out.println(p);
		}
		
		p++;
	}
	
	}
}
