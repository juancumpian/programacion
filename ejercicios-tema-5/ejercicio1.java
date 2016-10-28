import java.util.Scanner;
public class ejercicio1{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("estos son los multiplos de 5");
	
	for(int i=5; i<=100;i++){
		
		if(i%5 == 0){
		System.out.println(i);
		}
	}
	
	}
}
