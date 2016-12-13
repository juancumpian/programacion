import java.util.Scanner;
public class ejercicio21 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.println("Por favor, vaya introduciendo números enteros.");
    System.out.println("Puede terminar mediante la introducción de un número negativo.");

    int numeroIntroducido;
    int numeroElementos = 0;
    int sumaImpares = 0;
    int numeroImpares = 0;
    int maximoPar = 0;

    do {
      numeroIntroducido = teclado.nextInt();

      if (numeroIntroducido >= 0) {
        numeroElementos++;
        if ((numeroIntroducido % 2) == 1) {
          sumaImpares += numeroIntroducido;
          numeroImpares++;
        } else {
          if (numeroIntroducido > maximoPar)
            maximoPar = numeroIntroducido;
        }
      }
    } while (numeroIntroducido >= 0);

    System.out.println("Ha introducido " + numeroElementos + " números");
    System.out.println("La media de los impares es " + sumaImpares/numeroImpares);
    System.out.println("El máximo de los pares es " + maximoPar);
  }
}
