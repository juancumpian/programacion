import java.util.Scanner;
public class ejercicio31 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.print("Introduzca la altura de la L: ");
    int altura = teclado.nextInt();

    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }

    for (int i = 0; i < altura / 2 + 1; i++) {
      System.out.print("* ");
    }

  }
}
