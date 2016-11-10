import java.util.Scanner;
public class ejercicio19{
	public static void main (String[] args){	
	Scanner teclado = new Scanner(System.in);
	
	int altura;
	
	
	System.out.print("dime la altura de la piramide: ");
	altura=teclado.nextInt();
	
	teclado.nextLine();
	
	System.out.print("Introduzca el carácter de relleno: ");
	String relleno = teclado.nextLine();
	
	
	int aux = 1;
	int espacio=altura-1;
	
	while(aux <= altura){
	
	for(int i=1;i<=espacio;i++){
		System.out.print(" ");
			}
			
	for(int i=1;i<aux*2;i++){
		System.out.print(relleno);	
			}
	System.out.println();
		aux++;
		espacio--;
		}
		
	}
}
