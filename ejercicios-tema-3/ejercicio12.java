import java.util.Scanner;
public class ejercicio12{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
     	double x;
     	double y;
     	
        System.out.println("dime la nota del primer examen");
        x = s.nextDouble();
        
        System.out.println("dime la media que quieres");
        y = s.nextDouble();
        
        System.out.println("necesitas sacar: "+ ((y * 100) - (x * 40)) / 60);
        
    }
}
