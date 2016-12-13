import java.util.Scanner;
public class ejercicio40 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.print("Por favor, introduzca la altura del rombo: ");
    int altura2 = teclado.nextInt();

    int espaciosDentro = 0;
    int espaciosDelante = altura2 / 2;

    if ((altura2 < 3) || (altura2 % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {

      int altura = 1;
      while (altura <= altura2 / 2 + 1) {

        for (int i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }

        System.out.print("*");
        for (int i = 1; i < espaciosDentro; i++) {
          System.out.print(" ");
        }

        if (altura>1) {
          System.out.print("*");
        }

        System.out.println();
        altura++;
        espaciosDelante--;
        espaciosDentro+=2;
      }

      espaciosDentro = altura2 - 3;
      espaciosDelante = 1;
      altura = 0;

      while (altura < altura2 / 2) {

        for (int i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }

        System.out.print("*");
        for (int i = 1; i < espaciosDentro; i++) {
          System.out.print(" ");
        }

        if(altura < altura2 / 2 - 1) {
          System.out.print("*");
        }

        System.out.println();
        altura++;
        espaciosDelante++;
        espaciosDentro -= 2;
      }
    }
  }
}
