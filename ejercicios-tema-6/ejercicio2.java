class ejercicio2{
  public static void main(String[] args){


  String palo="";
  String numero="";
  int palo1;
  int numero1;

  palo1 = (int)(Math.random()*4)+1;
  switch(palo1){
    case 1:
      palo = "corazones";
      break;
    case 2:
      palo = "diamantes";
      break;
    case 3:
      palo = "picas";
      break;
    case 4:
      palo = "trebol";
      break;
  }

  numero1 = (int)(Math.random()*13)+1;

  switch(numero1){
    case 1:
      numero = "as";
      break;
    case 2:
      numero = "2";
      break;
    case 3:
      numero = "3";
      break;
    case 4:
      numero = "4";
      break;
    case 5:
      numero = "5";
      break;
    case 6:
      numero = "6";
      break;
    case 7:
      numero = "7";
      break;
    case 8:
      numero = "8";
      break;
    case 9:
      numero = "9";
      break;
    case 10:
      numero = "10";
      break;
    case 11:
      numero = "J";
      break;
    case 12:
      numero = "Q";
      break;
    case 13:
      numero = "K";
      break;
    }
    System.out.println("esta es la carta: "+numero+" "+palo);
  }
}
