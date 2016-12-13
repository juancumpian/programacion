public class ejercicio1{
  public static void main(String[] args) {
    int[] num  = new int[12];
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    System.out.println("Indice 1----2--3--4--5--6--7---8--9--10--11--12");
    System.out.print("Valor  ");
    for (int i = 0;i < num.length;i++ ) {
      System.out.print(num[i]+"  ");
    }
    System.out.println();

  }
}
