import java.util.*;
public class acuario{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int myRandomi;
    int myRandomj;
    int alto;
    int ancho;
    int coordenadax;
    int coordenaday;

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

    for (int i=0;i<alto;i++){//en este bucle se crean las filas
      for (int j=0;j<ancho;j++){//en este bucle se crean las columnas
        if (i == 0 || i == (alto - 1) || j == 0 || j == (ancho - 1)){//aqui se pintan los bordes, se hace una comparacion para determinar cuantos asteriscos se pintan
          System.out.print("*");
      }else if (i == myRandomi && j == myRandomj) {// aqui se "crea" el pez segun las funciones aleatorias preestablecidas arriba
        System.out.print("&");
      }else
      System.out.print(" ");
      }
      System.out.println(" ");
    }
    System.out.println("encuentra al pez!");

      System.out.println("dime la coordenada x del pez");
      coordenadax = teclado.nextInt();

      teclado.nextLine();

      System.out.println("dime la coordenada y del pez");
      coordenaday = teclado.nextInt();

      teclado.nextLine();

      if(coordenadax == myRandomi && coordenaday == myRandomj){
        for (int i=0;i<alto;i++){//en este bucle se crean las filas
          for (int j=0;j<ancho;j++){//en este bucle se crean las columnas
            if (i == 0 || i == (alto - 1) || j == 0 || j == (ancho - 1)){//aqui se pintan los bordes, se hace una comparacion para determinar cuantos asteriscos se pintan
              System.out.print("*");
          }else
          System.out.print(" ");
          }
          System.out.println(" ");
        }
        System.out.println("has ganado!");
      }else{
        System.out.println("has perdido!");
      }
  }
}
