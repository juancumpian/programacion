class ejercicio5{
  public static void main(String[] args) {

    int numero;
    int suma=0;
    int mayor=0;
    int menor=199;
    int contador=0;

    for (int i=0;i<50;i++){
      numero = (int)(Math.random()*100)+99;
      System.out.print(numero+"  ");
      suma += numero;
      if(mayor < numero){
        mayor = numero;
      }
      if(menor > numero){
        menor = numero;
      }
      contador++;
    }
    suma = suma/contador;
    System.out.println();
    System.out.println("mayor: "+mayor+" menor: "+menor+" media: "+suma);
  }
}
