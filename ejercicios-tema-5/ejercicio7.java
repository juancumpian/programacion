import java.util.Scanner;
public class ejercicio7{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	int contraseña = 8749;
	int contador = 0;
	int intento;
	
	do{
		
		System.out.println("dime la contraseña");
		intento=teclado.nextInt();
		
		teclado.nextLine();
		
		if(intento == contraseña){
		
			System.out.println("acertaste!");
			
		}else
		
		System.out.println("no acertaste!");
		
		contador++;
		
	 }while(contador < 4);
	
	}
}
