public class ejercicio19 {
  public static void main(String[] args) {

    int numero;
    int maximoPar = -100;
    int minimoImpar = 200;
    int suma = 0;

    for (int i = 0; i < 50; i++) {
      numero = (int)(Math.random() * 301) - 100;

      System.out.print(numero + " ");

      if (numero % 2 == 0) {
        if (numero > maximoPar) maximoPar = numero;
      } else {
        if (numero < minimoImpar) minimoImpar = numero;
      }

      suma += numero;
    }

    System.out.println("\nMáximo de los pares: " + maximoPar);
    System.out.println("Mínimo de los impares: " + minimoImpar);
    System.out.println("Media: " + suma / 50);
  }
}
