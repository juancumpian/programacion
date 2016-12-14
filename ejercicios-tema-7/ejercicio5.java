import java.util.*;
public class ejercicio5{
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  int[] num = new int[10];
  int max = Integer.MAX_VALUE;
  int min = Integer.MIN_VALUE;

  System.out.println("ve diciendome numeros separados por intro");
  for (int i = 0; i < num.length ; i++){
    num[i] = teclado.nextInt();

    teclado.nextLine();

    if(max < num[i]){
      max = num[i];
    }
    if(min > num[i]){
      min = num[i];
    }
  }
  System.out.println("maximo: "+max+" minimo: "+min);


  }
}
