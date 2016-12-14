/*
* Escribe un programa que lea 15 números por teclado y que los almacene en un
* array. Rota los elementos de ese array, es decir, el elemento de la posición 0
* debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
* la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
* del array.
*/

import java.util.*;
public class ejercicio6{
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  int[] num = new int[15];
  int posicion;
  int aux;
  int i;

  System.out.println("ve diciendome numeros separados por intro");
  for ( i = 0; i < num.length ; i++){
    num[i] = teclado.nextInt();
  }

  System.out.println();

  for ( i = 0; i < num.length ; i++) {
      System.out.print(num[i]+" | ");
  }
  System.out.println();

  aux = num[14];
  for ( i = 14; i > 0 ; i--) {
     num[i] = num[i-1];
  }
  num[0] = aux;
System.out.println();
  for ( i = 0; i < num.length ; i++) {
      System.out.print(num[i]+" | ");
  }
  System.out.println();

  }
}
