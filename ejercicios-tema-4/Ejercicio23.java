import java.util.Scanner;
public class Ejercicio23{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	double baseImponible;
	double ivaNum;
	double descuentoNum;
	double total = 0;
	String descuento;
	String iva;
	
	System.out.println("introduzca la base imponible");
	baseImponible = teclado.nextDouble();
	
	teclado.nextLine();
	
	System.out.println("dime el tipo de iva (general, reducido o superreducido");
	iva = teclado.nextLine();
	
		switch(iva){
		
		case "general":
		
			ivaNum = baseImponible * 21/100;
			
			System.out.println("21% IVA");
			System.out.println(baseImponible);
		
			total = baseImponible + ivaNum;
			
			System.out.printf("%.2f€%n", total);
		
		break;
		
		case "reducido":
		
			ivaNum = baseImponible * 10/100;
		
			System.out.println("10% IVA");
		
			total = baseImponible + ivaNum;
			
			System.out.printf("%.2f€%n", total);
		
		break;
		
		case "superreducido":
		
			ivaNum = baseImponible * 4/100;
		
			System.out.println("4% IVA");
		
			total = baseImponible + ivaNum;
			
			System.out.printf("%.2f %n €", total);
			
		break;
		
		}
		
		System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc)");
		descuento = teclado.nextLine();
		
		 switch(descuento){
			
			case "nopro":
			
				System.out.println("no tiene promoción");
				
				System.out.printf("%.2f %n €", total);
			break;
			
			case "mitad":
			
				System.out.println("se ajustara la promocion de la mitad de precio");
				
				total = total / 2;
				
				System.out.println("Este es el precio total: "+total+"€");
			break;
			
			case "meno5":
			
				System.out.println("se ajustara la promocion quitando 5€ de su total");
				
				total = total - 5;
				
				System.out.println("Este es el precio total: "+total+"€");
			
			break;
			
			case "5porc":
			
				System.out.println("se ajustara la promocion quitando un 5% del total");
			
				descuentoNum = total * 5/100;
			
				total = total - descuentoNum;
			
				System.out.println("Este es el precio total: "+total+"€");
			
			
		   }	
	
	}
}
