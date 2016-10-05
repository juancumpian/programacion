/*
    capitulo 2 ejercicio 1
    
    @author Juan Cumpian Diaz

*/
import java.util.Scanner;
public class ejercicio1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
     	int x;
        int y;
        System.out.println("dime el primer número de la multiplicación");
        x = s.nextInt();
        
        System.out.println("dime el segundo número de la multiplicación");
        y = s.nextInt();
        
        System.out.println("el resultado es: "+ (x*y));
        
    }
}