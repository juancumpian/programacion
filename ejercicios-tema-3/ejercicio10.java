/*
    capitulo 2 ejercicio 1
    
    @author Juan Cumpian Diaz

*/
import java.util.Scanner;
public class ejercicio10{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
     	double x;
     	
        System.out.println("dime el numero de kilobytes a convertir");
        x = s.nextInt();
        
        System.out.println("eso son: "+ (x/1024)+" megas");
        
    }
}
