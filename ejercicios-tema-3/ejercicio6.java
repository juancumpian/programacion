/*
    capitulo 2 ejercicio 1
    
    @author Juan Cumpian Diaz

*/
import java.util.Scanner;
public class ejercicio6{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
     	double x;
        int y;
        System.out.println("dime la base");
        x = s.nextInt();
        
        System.out.println("dime la altura");
        y = s.nextInt();
        
        System.out.println("el area del rectangulo es: "+ ((x*y)/2));
        
    }
}
