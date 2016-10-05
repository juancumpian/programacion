/*
    capitulo 2 ejercicio 1
    
    @author Juan Cumpian Diaz

*/
import java.util.Scanner;
public class ejercicio8{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
     	double x;
     	
        System.out.println("dime cuantas horas ha tgrabajado el empleado");
        x = s.nextInt();
         
        System.out.println("el salario del empleado es: "+ (x*12)+ " €");
        
    }
}
