import java.util.*;
public class ejercicio17{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int myRandomi;
    int myRandomj;
    int alto;
    int ancho;
    int huecos;

    System.out.println("dime el alto");
    alto=teclado.nextInt();

    teclado.nextLine();

    System.out.println("dime el ancho");
    ancho=teclado.nextInt();

    teclado.nextLine();

    if(ancho < 4){
      ancho = 4;
    }

    if(alto < 4){
      alto = 4;
    }

    myRandomi = ((int)(Math.random()* ancho - 3) + 1);
    myRandomj = ((int)(Math.random()* alto - 3) + 1);

    for (int i=0;i<alto;i++){
      for (int j=0;j<ancho;j++){
        if (i == 0 || i == (alto - 1) || j == 0 || j == (ancho - 1)){
          System.out.print("*");
      }else if (i == myRandomi && j == myRandomj) {
        System.out.print("&");
      }else
      System.out.print(" ");
      }
      System.out.println(" ");
    }
  }
}
