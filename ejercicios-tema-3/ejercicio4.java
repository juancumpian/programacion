/*
    capitulo 2 ejercicio 1
    
    @author Juan Cumpian Diaz

*/
import java.util.Scanner;
public class ejercicio4{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
     	double x;
        int y;
        System.out.println("dime el primer número");
        x = s.nextInt();
        
        System.out.println("dime el segundo número");
        y = s.nextInt();
        
        System.out.println("multiplicacion es: "+ (x*y));
        System.out.println("suma es: "+ (x+y));
        System.out.println("resta es: "+ (x-y));
        System.out.println("division es: "+ (x/y));
        
    }
}
