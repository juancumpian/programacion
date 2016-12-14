public class barajar{
  public static void main(String[] args){
    int[] posiciones = new int[10];
    int[] arrayPrimero = new int[10];
    int[] arraySegundo = new int[10];
    int i;
    int j = 0;
    int k = 0;
    boolean ocupado = false;
    boolean newPostIsOk = false;
    int newPost = 0;
    for (i = 0; i < arrayPrimero.length; i++){
      arrayPrimero[i] = (int) (Math.random()*100);
      System.out.print(arrayPrimero[i]+" | ");
    }

    for (i = 0; i<arrayPrimero.length; i++){
      System.out.println("zona for");
      while(!newPostIsOk){
        System.out.println("zona primer while");
        newPost = (int)(Math.random()*10);
        if(newPost == i){
          System.out.println("zona if 1");
          ocupado = true;
        }
        while(!ocupado || j < posiciones.length){
          System.out.println("zona while 2");
          if(newPost == posiciones[j]){
            System.out.println("zona if 2");
            ocupado = true;
          }
          j++;
        }

      }
      if(!ocupado){
        newPostIsOk = true;
      }

      arraySegundo[newPost] = arrayPrimero[i];
      posiciones[k] = newPost;

      k++;
    }

    for (int h = 0;h < arraySegundo.length ;h++ ){
      System.out.print(arrayPrimero[h]+" - ");

    }
  }
}
