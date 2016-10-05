/*
    capitulo 2 ejercicio 1
    
    @author Juan Cumpian Diaz

*/
import java.util.Scanner;
public class ejercicio7{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
     	double x;
        
        System.out.println("dime la base imponible");
        x = s.nextInt();
        
        System.out.println("la factura total es: "+ (x + (x*0.21))+ " €");
        
    }
}

