import java.util.Scanner;
public class ejercicio8{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
		int numero;
	
		System.out.println("dime el numero del que quieres sacar la tabla (tiene que ser entero)");
		numero=teclado.nextInt();
	
		for(int i=2;i<11;i++){
				System.out.println(i*numero);
		}
	
	}
}
