import java.util.Scanner;
public class ejercicio38 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.print("Por favor, introduzca la altura del reloj de arena: ");
    int altura2 = teclado.nextInt();

    int altura = 1;
    int asteriscos = altura2;
    int espaciosDelante = 0;

    if ((altura2 < 3) || (altura2 % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {

      while (altura < altura2 / 2 + 1) {


        for (int i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }


        for (int i = 0; i < asteriscos; i++) {
          System.out.print("*");
        }

        System.out.println();
        altura++;
        espaciosDelante++;
        asteriscos -= 2;
      }


      espaciosDelante = altura2 / 2;
      altura = 1;
      while (altura <= altura2 / 2 + 1) {


        for (int i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }


        for (int i = 0; i < asteriscos; i++) {
          System.out.print("*");
        }

        System.out.println();
        altura++;
        espaciosDelante--;
        asteriscos += 2;
      }
    }
  }
}
