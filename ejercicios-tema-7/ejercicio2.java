public class ejercicio2{
  public static void main(String[] args) {
    String[] simbolo  = new String[12];

    simbolo[0] = "a";
    simbolo[1] = "x";
    simbolo[4] = "@";
    simbolo[6] = " ";
    simbolo[7] = "+";
    simbolo[8] = "Q";

    System.out.println("Indice 1----2-----3-----4-----5-----6----7---8---9----10----11----12");
    System.out.print("Valor  ");
    for (int i = 0;i < simbolo.length;i++ ) {
      System.out.print("'"+simbolo[i]+"' ");
    }
    System.out.println();

  }
}
