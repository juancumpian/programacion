import java.util.Scanner;
public class arbolNavidad{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = teclado.nextInt();

    teclado.nextLine();

    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida-2;
    String elemento;
    int nelemento = 0;
    alturaIntroducida = alturaIntroducida -1;

    for (i = 1; i <= espacios; i++) {
      System.out.print(" ");
    }

    System.out.println("*");

    while (altura <= alturaIntroducida) {
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      for (i = 1; i < altura * 2; i++) {
        nelemento = (int) (Math.random()*9 + 1);
        switch(nelemento){
          case 1:
          System.out.print("O");
          break;
          case 2:
          System.out.print("O");
          break;
          case 3:
          System.out.print("*");
          break;
          default:
          System.out.print("^");
          break;
        }
      }

      System.out.println();

      altura++;
      espacios--;
    }

  }
}
