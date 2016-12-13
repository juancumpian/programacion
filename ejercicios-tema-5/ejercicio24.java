import java.util.Scanner;
public class ejercicio24 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.println("Este programa pinta una pirámide hecha a base de números.");
    System.out.print("Por favor, introduzca la altura de la pirámide:");
    int altura2 = teclado.nextInt();

    int altura = 1;

    int espacios = altura2 - 1;

    while (altura <= altura2) {
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }

      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }

      System.out.println();

      altura++;
      espacios--;
    }
  }
}
