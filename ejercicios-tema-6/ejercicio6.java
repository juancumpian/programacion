import java.util.Scanner;
class ejercicio6{
  public static void main(String[] args) {
  Scanner teclado = new Scanner (System.in);

  int numero=0;
  int numerointroducir=0;
  int contador=0;
  boolean esta=false;

  numero = (int) (Math.random()*100);

  do{
    System.out.println("dime que numero estoy pensando");
    numerointroducir=teclado.nextInt();

    teclado.nextLine();

    if (numerointroducir==numero) {
      esta=true;
      System.out.println("has acertado!!");
    }else{
      contador++;
      System.out.println("no has acertado, intentalo de nuevo, te quedan "+(6-contador)+" intentos");
      if(numerointroducir > numero){
        System.out.println("ese numero es mayor que el numero que estoy pensando");
      }
      if(numerointroducir < numero){
        System.out.println("ese numero es menor que el numero en el que estoy pensando");
      }
    }
  }while(contador < 6 && !esta);

  }
}
