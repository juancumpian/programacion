import java.util.Scanner;
public class ejercicio25 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = teclado.nextInt();

    int numero = numeroIntroducido;
    int volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }

    System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);
  }
}
