import java.util.Scanner;
public class ejercicio28 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    int numeroIntroducido;

    do {
      System.out.print("Por favor, introduzca un número entero: ");
      numeroIntroducido = teclado.nextInt();

      if (numeroIntroducido < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (numeroIntroducido < 0);

    int factorial = numeroIntroducido;

    if (numeroIntroducido == 0) {
      System.out.println("El factorial del " + numeroIntroducido + " es 1.");
    } else {
      for (int i = 1; i < numeroIntroducido; i++) {
        factorial *= i;
      }

      System.out.println(numeroIntroducido + "! = " + factorial);
    }
  }
}
