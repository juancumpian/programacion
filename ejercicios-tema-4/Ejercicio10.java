import java.util.Scanner;
public class Ejercicio10{
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	
	int dia;
	int mes;
	
	System.out.println("dime el dia en el que naciste (en numero)");
	dia=teclado.nextInt();
	
	System.out.println("dime el mes en el que naciste (en numero)");
	mes=teclado.nextInt();
	
	if(mes == 1 || mes== 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
		if(dia > 31){
			System.out.println("Ese mes no tiene tantos dias");
		}
	}else if(mes == 4 || mes == 6 || mes == 19 || mes == 11){
		if(dia > 30){
			System.out.println("Ese mes no tiene tantos dias");
			}
	}else if(mes == 2){
			if(dia >28){
				System.out.println("Ese mes no tiene tantos dias");
			}
	}
		
		
		switch(mes){
		
		case 1:
		if(dia <= 20){
			System.out.println("eres capricornio");		
		}else if (dia >=21){
			System.out.println("eres acuario");
		}
		break;
		
		case 2:
		if(dia <= 19){
			System.out.println("eres acuario");		
		}else if (dia >=20){
			System.out.println("eres piscis");
		}
		break;
		
		case 3:
		if(dia <= 20){
			System.out.println("eres piscis");		
		}else if (dia >=21){
			System.out.println("eres aries");
		}
		break;
		
		case 4:
		if(dia <= 20){
			System.out.println("eres aries");		
		}else if (dia >=21){
			System.out.println("eres tauro");
		}
		break;
		
		case 5:
		if(dia <= 21){
			System.out.println("eres tauro");		
		}else if (dia >=22){
			System.out.println("eres géminis");
		}
		break;
		
		case 6:
		if(dia <= 21){
			System.out.println("eres géminis");		
		}else if (dia >=22){
			System.out.println("eres cáncer");
		}
		break;
		
		case 7:
		if(dia <= 22){
			System.out.println("eres cancer");		
		}else if (dia >=23){
			System.out.println("eres leo");
		}
		break;
		
		case 8:
		if(dia <= 22){
			System.out.println("eres leo");		
		}else if (dia >=23){
			System.out.println("eres virgo");
		}
		break;
		
		case 9:
		if(dia <= 23){
			System.out.println("eres virgo");		
		}else if (dia >=23){
			System.out.println("eres libra");
		}
		break;
		
		case 10:
		if(dia <= 23){
			System.out.println("eres libra");		
		}else if (dia >=23){
			System.out.println("eres escorpio");
		}
		break;
		
		case 11:
		if(dia <= 23){
			System.out.println("eres escorpio");		
		}else if (dia >=23){
			System.out.println("eres sagitario");
		}
		break;
		
		case 12:
		if(dia <= 23){
			System.out.println("eres sagitario");		
		}else if (dia >=22){
			System.out.println("eres carpicornio");
		}
		break;
	
		}
	}
}
