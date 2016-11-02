import java.util.Scanner;
public class ejercicio11{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
		
		int numero=0;
		
		System.out.println("dime el numero por el que empiece la secuencia");
		numero=teclado.nextInt();
		
		
		
		
		System.out.println("base     cuadrado       cubo");
		for(int i=numero+1;i<numero+6;i++){
			
			
			System.out.println(i+"       "+(i*i)+"      "+(i*i*i));
			
		}
	}
}
