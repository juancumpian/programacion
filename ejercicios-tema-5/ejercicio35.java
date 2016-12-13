import java.util.Scanner;
public class ejercicio35 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.print("Por favor, introduzca la altura de la X: ");
    int altura2 = teclado.nextInt();

    int altura = 1;
    int i = 0;
    int espaciosDentro = altura2 - 1;
    int espaciosDelante = 0;

    if ((altura2 < 3) || (altura2 % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {
      // parte de arriba /////////////////////////////////////
      while (altura < altura2 / 2 + 1) {

        // inserta espacios delante
        for (i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }

        // pinta la línea
        System.out.print("*");
        for (i = 1; i < espaciosDentro; i++) {
          System.out.print(" ");
        }
        System.out.print("*");

        System.out.println();
        altura++;
        espaciosDelante++;
        espaciosDentro -= 2;
      } // while parte de arriba ///////////////////////

      // parte de abajo /////////////////////////////////////
      espaciosDentro = 0;
      espaciosDelante = altura2 / 2;
      altura = 1;
      while (altura <= altura2 / 2 + 1) {

        // inserta espacios delante
        for (i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }

        // pinta la línea
        System.out.print("*");
        for (i = 1; i < espaciosDentro; i++) {
          System.out.print(" ");
        }

        if(altura>1) {
          System.out.print("*");
        }

        System.out.println();
        altura++;
        espaciosDelante--;
        espaciosDentro+=2;
      } // while parte de abajo ///////////////////////
    } // else
  }
}
