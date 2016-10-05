/*
    capitulo 2 ejercicio 1
    
    @author Juan Cumpian Diaz

*/
import java.util.Scanner;
public class ejercicio2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
     	int x;
        System.out.println("dime el numeros de euros a convertir");
        x = s.nextInt();
        System.out.println("esos son: "+ (x*166.38)+ "pesetas");
        
    }
}
