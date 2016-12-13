public class ejercicio11 {

  public static void main(String[] args) {

    int nota;
    int suspensos = 0;
    int suficientes = 0;
    int biens = 0;
    int notables = 0;
    int sobresalientes = 0;

    for(int i = 0; i < 20; i++) {

      nota = (int)(Math.random() * 5);

      switch(nota) {
        case 0:
          System.out.print("suspenso ");
          suspensos++;
          break;
        case 1:
          System.out.print("suficiente ");
          suficientes++;
          break;
        case 2:
          System.out.print("bien ");
          biens++;
          break;
        case 3:
          System.out.print("notable ");
          notables++;
          break;
        case 4:
          System.out.print("sobresaliente ");
          sobresalientes++;
          break;
        default:
      }

    }

    System.out.println("\nNº de suspensos: " + suspensos);
    System.out.println("Nº de suficientes: " + suficientes);
    System.out.println("Nº de biens: " + biens);
    System.out.println("Nº de notables: " + notables);
    System.out.println("Nº de sobresalientes: " + sobresalientes);
  }
}
