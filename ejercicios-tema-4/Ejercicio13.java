import java.util.Scanner;
public class Ejercicio13{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
		
	int num1;
	int num2;
	int num3;
	
	System.out.println("dime el primer numero");
	num1 = teclado.nextInt();
	
	System.out.println("dime el segundo numero");
	num2 = teclado.nextInt();
	
	System.out.println("dime el tercer numero");
	num3 = teclado.nextInt();
	
	
	if(num1 > num2){
		
		if(num1 > num3){
			
			if(num2 > num3){
				
				System.out.println(num1+" > "+num2+" > "+num3);
				
			}else
			
				System.out.println(num1+" > "+num3+" > "+num2);
		}else
		
		System.out.println(num3+" > "+num1+" > "+num2);
		
	}else if(num2 > num3){
		
		if(num3 > num1){
			
		System.out.println(num2+" > "+num3+" > "+num1);
		
	   }else
	   
	   System.out.println(num2+" > "+num1+" > "+num3);
	   
	 }else
	 
		System.out.println(num3+" > "+num2+" > "+num1);
		
	}
}
