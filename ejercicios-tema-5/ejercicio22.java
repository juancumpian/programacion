import java.util.Scanner;
public class ejercicio22 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    System.out.print("Números primos entre 2 y 100: ");

    boolean esta = true;

    for (int n = 2; n <= 100; n++) {

      esta = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esta = false;
        }
      }
      if (esta) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
  }
}
