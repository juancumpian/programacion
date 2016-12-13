import java.util.Scanner;
public class ejercicio23 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.println("Por favor, vaya introduciendo números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");

    int numeroIntroducido;
    int suma = 0;
    int numeroElementos = 0;

    do {
      numeroIntroducido = teclado.nextInt();
      suma += numeroIntroducido;
      numeroElementos++;
    } while (suma <= 10000);

    System.out.println("Ha introducido un total de " + numeroElementos + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / numeroElementos + ".");
  }
}
