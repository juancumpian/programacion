import java.util.Scanner;
public class ejercicio20 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura2 = teclado.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();

    int altura = 1;
    int i = 0;
    int espaciosDelante = altura2 - 1;
    int espaciosDentro = 0;

    while (altura < altura2) {
      for (i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      }

      System.out.print(relleno);
      for (i = 1; i < espaciosDentro; i++) {
        System.out.print(" ");
      }

      if (altura>1) {
        System.out.print(relleno);
      }

      System.out.println();
      altura++;
      espaciosDelante--;
      espaciosDentro += 2;
    }
    for (i = 1; i < altura*2; i++) {
      System.out.print(relleno);
    }
  }
}
