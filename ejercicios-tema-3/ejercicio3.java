import java.util.Scanner;
public class ejercicio3{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
     	int x;
        System.out.println("dime el numeros de pesetas a convertir");
        x = s.nextInt();
        System.out.println("esos son: "+ (x*0.006)+ "euros");
        
    }
}
