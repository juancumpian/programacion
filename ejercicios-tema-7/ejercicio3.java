import java.util.*;
public class ejercicio3{
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

    int[] num = new int[10];
    int numerico;

    System.out.println("dime un listado de 10 numeros");

    for (int i = num.length -1; i >= 0; i--){
      numerico = teclado.nextInt();

      num[i] = numerico;
    }

    System.out.println("estos son los numeros al reves");

    for (int j = 0; j<num.length; j++){
      System.out.println(num[j]);
    }

  }
}
