class ejercicio1{
    public static void main(String[] args) {

      int dado;
      int suma=0;

      for (int i=0;i<3;i++){
        dado = (int) (Math.random() *6)+1;
        System.out.println(dado);
        suma += dado;
      }
      System.out.println("la suma sale: "+suma);

    }
}
