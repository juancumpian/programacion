import java.util.*;
public class ejercicio4{
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  int[] numero = new int[20];
  int[] cuadrado = new int[20];
  int[] cubo = new int[20];
  int numerico;

  for (int i = 0;i < numero.length;i++){
        numerico =(int) ((Math.random()*100 )+1);

        numero[i] = numerico;
        cuadrado[i] = numerico * numerico;
        cubo[i] = numerico * numerico * numerico;
   }

   System.out.println("numero---cuadrado-----cubo");

   for (int j = 0;j < numero.length; j++) {
      System.out.println(numero[j]+"-------"+cuadrado[j]+"-----"+cubo[j]);
   }

  }
}
