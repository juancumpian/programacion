/******************
* Clase coleccion *
*******************/


import java.util.*;

/************************************************************
*aqui estan los metodos donde se implican a los materiales *
************************************************************/

public class coleccion {
static Scanner teclado=new Scanner (System.in);
ArrayList<libros> libro= new ArrayList<libros>();
ArrayList<audios> audio= new ArrayList<audios>();
ArrayList<videos> video= new ArrayList<videos>();
ArrayList<periodicos> periodico= new ArrayList<periodicos>();
ArrayList<revistas> revista= new ArrayList<revistas>();

/*******************************************************
* lista de objetos base creados para servir de ejemplo *
********************************************************/

public coleccion(){
	libro.add(new libros("01","pepe en las islas griegas","terror","pepe nolan",100,"47239865B"));
	libro.add(new libros("02","Montoro","suspense","Dmitri Ptrenco",10,"47567565F"));
	libro.add(new libros("03","john javier de los paramos conoce a peter parker","drama","pablo terko",56,"23112345C"));
	libro.add(new libros("04","blablabla mejor","terror","john cena",23,"423423413A"));
	audio.add(new audios("01","sonidos del amazonas","ambiente","reserva natural de pacamari",14,"MP3"));
	audio.add(new audios("02","audiolibro aleman de el libro de la selva","aventura","john julios",32,"MP3"));
	audio.add(new audios("03","ufgbasdj- las palabras de un tartamudo","autobiografia","actor de Hodor",45,"AMV"));
	audio.add(new audios("04","popopopopopopopopo","lelele","pepe ututu",78,"MP3"));
	video.add(new videos("01","pepe en las islas griegas","terror","reserva natural de pacamari",100,"MP3"));
	video.add(new videos("02","pepe en las islas griegas","terror","reserva natural de pacamari",100,"MP3"));
	video.add(new videos("03","pepe en las islas griegas","terror","reserva natural de pacamari",100,"MP3"));
	video.add(new videos("04","pepe en las islas griegas","terror","reserva natural de pacamari",100,"MP3"));
	periodico.add(new periodicos("01","pepe en las islas griegas","terror","reserva natural de pacamari",100,"12/12/12"));
	periodico.add(new periodicos("02","pepe en las islas griegas","terror","reserva natural de pacamari",100,"12/12/12"));
	periodico.add(new periodicos("03","pepe en las islas griegas","terror","reserva natural de pacamari",100,"12/12/12"));
	revista.add(new revistas("01","pepe en las islas griegas","terror","reserva natural de pacamari",100,"12/12/12"));
	revista.add(new revistas("02","pepe en las islas griegas","terror","reserva natural de pacamari",100,"12/12/12"));
}

/****************************
* Metodos de la clase libro *
*****************************/

public void anadir_libro(){
	boolean comprobar=false;
	String numarticulonuevo, nombrenuevo, tiponuevo, autornuevo, ISBNnuevo;
	int cantidadnuevo;
	System.out.println("dame el ID del libro nuevo");
	numarticulonuevo=teclado.nextLine();
	for(libros i:libro){
		if(numarticulonuevo.equalsIgnoreCase(i.getNumarticulo())){
			comprobar=true;
			System.out.println("ese ID ya existe");
		}
	}
	if(!comprobar){
		System.out.println("dame el nombre");
		nombrenuevo=teclado.nextLine();
		System.out.println("dame el genero");
		tiponuevo=teclado.nextLine();
		System.out.println("dame el nombre del autor");
		autornuevo=teclado.nextLine();
		System.out.println("dame el ISBN");
		ISBNnuevo=teclado.nextLine();
		System.out.println("Deme cuantos tienes");
		cantidadnuevo=teclado.nextInt();
		libro.add(new libros(numarticulonuevo,nombrenuevo,tiponuevo,autornuevo,cantidadnuevo,ISBNnuevo));
	}

}
public void eliminar_libro(){
	boolean comprobar=false;
	String numarticulonuevo;
	System.out.println("dame el ID del libro a eliminar");
	numarticulonuevo=teclado.nextLine();
	for(libros i:libro){
		if(numarticulonuevo.equalsIgnoreCase(i.getNumarticulo())){
			comprobar=true;
			libro.remove(i);
			System.out.println("libro eliminado");
		}
	}
	if(!comprobar){
		System.out.println("libro no enocntrado");
	}
}

/****************************
* Metodos de la clase audio *
*****************************/

public void anadir_audio(){
	boolean comprobar=false;
	String numarticulonuevo, nombrenuevo, tiponuevo, autornuevo, formato;
	int cantidadnuevo;
	System.out.println("dame el ID del audio nuevo");
	numarticulonuevo=teclado.nextLine();
	for(audios i:audio){
		if(numarticulonuevo.equalsIgnoreCase(i.getNumarticulo())){
			comprobar=true;
			System.out.println("ese ID ya existe");
		}
	}

	if(!comprobar){
		System.out.println("Deme el nombre");
		nombrenuevo=teclado.nextLine();
		System.out.println("Deme el genero");
		tiponuevo=teclado.nextLine();
		System.out.println("Deme el nombre del autor");
		autornuevo=teclado.nextLine();
		System.out.println("Deme el ISBN");
		formato=teclado.nextLine();
		System.out.println("Deme cuantos tiene");
		cantidadnuevo=teclado.nextInt();
		audio.add(new audios(numarticulonuevo,nombrenuevo,tiponuevo,autornuevo,cantidadnuevo,formato));
	}
}

public void eliminar_audio(){
	boolean comprobar=false;
	String numarticulonuevo;
	System.out.println("Deme el ID del audio a eliminar");
	numarticulonuevo=teclado.nextLine();
	for(audios i:audio){
		if(numarticulonuevo.equalsIgnoreCase(i.getNumarticulo())){
			comprobar=true;
			audio.remove(i);
			System.out.println("Audio eliminado");
		}
	}
	if(!comprobar){
		System.out.println("Ese audio no existe");
	}
}

/****************************
* Metodos de la clase video *
*****************************/

public void anadir_video(){
	boolean comprobar=false;
	String numarticulonuevo, nombrenuevo, tiponuevo, autornuevo, formato;
	int cantidadnuevo;
	System.out.println("Deme el ID del video nuevo");
	numarticulonuevo=teclado.nextLine();
	for(videos i:video){
		if(numarticulonuevo.equalsIgnoreCase(i.getNumarticulo())){
			comprobar=true;
			System.out.println("Ese ID ya existe");
		}
	}

	if(!comprobar){
		System.out.println("Deme el nombre");
		nombrenuevo=teclado.nextLine();
		System.out.println("Deme el genero");
		tiponuevo=teclado.nextLine();
		System.out.println("Deme el nombre del autor");
		autornuevo=teclado.nextLine();
		System.out.println("Deme el ISBN");
		formato=teclado.nextLine();
		System.out.println("Deme cuantos tienes");
		cantidadnuevo=teclado.nextInt();
		video.add(new videos(numarticulonuevo,nombrenuevo,tiponuevo,autornuevo,cantidadnuevo,formato));
	}
}

public void eliminar_video(){
	boolean comprobar=false;
	String numarticulonuevo;
	System.out.println("Deme el ID del video a eliminar");
	numarticulonuevo=teclado.nextLine();
	for(videos i:video){
		if(numarticulonuevo.equalsIgnoreCase(i.getNumarticulo())){
			comprobar=true;
			video.remove(i);
			System.out.println("video eliminado");
		}
	}
	if(!comprobar){
		System.out.println("ese video no existe");
	}
}

/********************************
* Metodos de la clase periodico *
*********************************/

public void anadir_periodico(){
	boolean comprobar=false;
	String numarticulonuevo, nombrenuevo, tiponuevo, autornuevo, fecha;
	int cantidadnuevo;
	System.out.println("Deme el ID del periodico nuevo");
	numarticulonuevo=teclado.nextLine();

	for(periodicos i:periodico){
		if(numarticulonuevo.equalsIgnoreCase(i.getNumarticulo())){
			comprobar=true;
			System.out.println("ese ID ya existe");
		}
	}

	if(!comprobar){
		System.out.println("Deme el nombre");
		nombrenuevo=teclado.nextLine();
		System.out.println("Deme el genero");
		tiponuevo=teclado.nextLine();
		System.out.println("dame el nombre del autor");
		autornuevo=teclado.nextLine();
		System.out.println("dame el ISBN");
		fecha=teclado.nextLine();
		System.out.println("Deme cuantos tienes");
		cantidadnuevo=teclado.nextInt();
		periodico.add(new periodicos(numarticulonuevo,nombrenuevo,tiponuevo,autornuevo,cantidadnuevo,fecha));
	}
}
public void eliminar_periodico(){
	boolean comprobar=false;
	String numarticulonuevo;
	System.out.println("dame el ID del periodico a eliminar");
	numarticulonuevo=teclado.nextLine();
	for(periodicos i:periodico){
		if(numarticulonuevo.equalsIgnoreCase(i.getNumarticulo())){
			comprobar=true;
			periodico.remove(i);
			System.out.println("periodico eliminado");
		}
	}
	if(!comprobar){
		System.out.println("ese periodico no existe");
	}
}

/******************************
* Metodos de la clase revista *
*******************************/

public void anadir_revista(){
	boolean comprobar=false;
	String numarticulonuevo, nombrenuevo, tiponuevo, autornuevo, fecha;
	int cantidadnuevo;
	System.out.println("dame el ID del revista nuevo");
	numarticulonuevo=teclado.nextLine();

	for(revistas i:revista){
		if(numarticulonuevo.equalsIgnoreCase(i.getNumarticulo())){
			comprobar=true;
			System.out.println("ese ID ya existe");
		}
	}

	if(!comprobar){
		System.out.println("dame el nombre");
		nombrenuevo=teclado.nextLine();
		System.out.println("dame el genero");
		tiponuevo=teclado.nextLine();
		System.out.println("dame el nombre del autor");
		autornuevo=teclado.nextLine();
		System.out.println("dame el ISBN");
		fecha=teclado.nextLine();
		System.out.println("Deme cuantos tienes");
		cantidadnuevo=teclado.nextInt();
		revista.add(new revistas(numarticulonuevo,nombrenuevo,tiponuevo,autornuevo,cantidadnuevo,fecha));
	}
}

public void eliminar_revista(){
	boolean comprobar=false;
	String numarticulonuevo;
	System.out.println("dame el ID de la revista a eliminar");
	numarticulonuevo=teclado.nextLine();

	for(revistas i:revista){
		if(numarticulonuevo.equalsIgnoreCase(i.getNumarticulo())){
			comprobar=true;
			revista.remove(i);
			System.out.println("revista eliminado");
		}
	}
	if(!comprobar){
		System.out.println("esa revista no existe");
	}
}

/******************************************
* Metodos para listar de todas las clases *
*******************************************/

public void listarlibro()  {
	Collections.sort(libro);
	System.out.println("listado de libros");
	System.out.println("ID--------nombre-------fecha de entrada-------genero-------autor-------cantidad-------ISBN");

	for(libros i:libro){
		System.out.println(i.getNumarticulo()+"        "+i.getNombre()+"       "+i.getTipo()+"       "+i.getAutor()+"       "+i.getCantidad()+"       "+i.getISBN());
	}
}

public void listaraudio(){
	Collections.sort(audio);
	System.out.println("listado de audios");
	System.out.println("ID--------nombre-------fecha de entrada-------genero-------autor-------cantidad-------formato");

	for (audios i:audio){
		System.out.println(i.getNumarticulo()+"        "+i.getNombre()+"       "+i.getTipo()+"       "+i.getAutor()+"       "+i.getCantidad()+"       "+i.getFormato());
	}
}

public void listarvideo(){
	Collections.sort(video);
	System.out.println("listado de videos");
	System.out.println("ID--------nombre-------fecha de entrada-------genero-------autor-------cantidad-------formato");

	for (videos i:video){
		System.out.println(i.getNumarticulo()+"        "+i.getNombre()+"       "+i.getTipo()+"       "+i.getAutor()+"       "+i.getCantidad()+"       "+i.getFormato());
	}
}

public void listarperiodico(){
	Collections.sort(periodico);
	System.out.println("listado de periodicos");
	System.out.println("ID--------nombre-------fecha de entrada-------genero-------autor-------cantidad-------fecha");

	for (periodicos i:periodico){
		System.out.println(i.getNumarticulo()+"        "+i.getNombre()+"       "+i.getTipo()+"       "+i.getAutor()+"       "+i.getCantidad()+"       "+i.getFecha());
	}
}

public void listarrevista(){
	Collections.sort(revista);
	System.out.println("listado de revista");
	System.out.println("ID--------nombre-------fecha de entrada-------genero-------autor-------cantidad-------fecha");

	for (revistas i:revista){
		System.out.println(i.getNumarticulo()+"        "+i.getNombre()+"       "+i.getTipo()+"       "+i.getAutor()+"       "+i.getCantidad()+"       "+i.getFecha());
	}
}

/******************************************
* Metodos para buscar de todas las clases *
*******************************************/

public void buscarlibro(){
	int p;
	boolean esta=false;
	System.out.println("");
	System.out.println("¿porqué campo quieres buscar?");
  System.out.println("1.ID");
	System.out.println("2.nombre");
  System.out.println("3.genero");
  System.out.println("4.autor");
  System.out.println("5.ISBN");
  p=teclado.nextInt();

	switch(p){
	  case 1:
		  String IDlibro;
		  System.out.println("Deme el id del libro que buscas");
		  IDlibro=teclado.next();

		  for(libros i:libro){
			  if (IDlibro.equalsIgnoreCase(i.getNumarticulo())){
					esta=true;
				  teclado.nextLine();
				  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

	  case 2:
		  String nombrelibro;
		  System.out.println("Deme el nombre del libro que buscas");
		  nombrelibro=teclado.next();
		  for(libros i:libro){
			  if (nombrelibro.equalsIgnoreCase(i.getNombre())){
					esta=true;
					teclado.nextLine();
				  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

	  case 3:
		  String generolibro;
		  System.out.println("Deme el genero del libro que buscas");
		  generolibro=teclado.next();

			for(libros i:libro){
			  if (generolibro.equalsIgnoreCase(i.getTipo())){
					esta=true;
					teclado.nextLine();
				  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

		  case 4:
			  String autorlibro;
			  System.out.println("Deme el autor del libro que buscas");
			  autorlibro=teclado.next();

				for(libros i:libro){
				  if (autorlibro.equalsIgnoreCase(i.getAutor())){
						esta=true;
						System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
				if(!esta){
					System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
				}
			  break;

		  case 5:
			  String ISBNlibro;
			  System.out.println("Deme el ISBN del libro que buscas");
			  ISBNlibro=teclado.next();

				for(libros i:libro){
				  if (ISBNlibro.equalsIgnoreCase(i.getTipo())){
						esta=true;
						teclado.nextLine();
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
				if(!esta){
					System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
				}
			  break;
	  }
  }

  public void buscaraudio(){
	  int p;
	  boolean esta=false;
	  System.out.println("");
	  System.out.println("¿porqué campo quieres buscar?");
	  System.out.println("1.ID");
	  System.out.println("2.nombre");
	  System.out.println("3.genero");
	  System.out.println("4.autor");
	  System.out.println("5.formato");
	  p=teclado.nextInt();

	  switch(p){
	  	case 1:
		  String IDaudio;
		  System.out.println("Deme el id del audio que buscas");
		  IDaudio =teclado.next();
		  for(audios i:audio){
			  if (IDaudio.equalsIgnoreCase(i.getNumarticulo())){
					esta=true;
					System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

	  	case 2:
		  String nombreaudio;
		  System.out.println("Deme el nombre del audio que buscas");
		  nombreaudio=teclado.next();

			for(audios i:audio){
			  if (nombreaudio.equalsIgnoreCase(i.getNombre())){
				  teclado.nextLine();
					esta=true;
					System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

			case 3:
		  String generoaudio;
		  System.out.println("Deme el genero del audio que buscas");
		  generoaudio=teclado.next();

			for(audios i:audio){
			  if (generoaudio.equalsIgnoreCase(i.getTipo())){
				  teclado.nextLine();
					esta=true;
					System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

			case 4:
			  String autoraudio;
			  System.out.println("Deme el autor del audio que buscas");
			  autoraudio=teclado.next();

			  for(audios i:audio){
				  if (autoraudio.equalsIgnoreCase(i.getAutor())){
					  teclado.nextLine();
						esta=true;
						System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
				if(!esta){
					System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
				}
			  break;

			case 5:
			  String formatoaudio;
			  System.out.println("Deme el formato del audio que buscas");
			  formatoaudio=teclado.next();

			  for(audios i:audio){
				  if (formatoaudio.equalsIgnoreCase(i.getTipo())){
					  teclado.nextLine();
						esta=true;
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
				if(!esta){
					System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
				}
			  break;
	  }
  }

  public void buscarvideo(){
	  int p;
	  boolean esta=false;
	  System.out.println("");
	  System.out.println("¿porqué campo quieres buscar?");
	  System.out.println("1.ID");
	  System.out.println("2.nombre");
	  System.out.println("3.genero");
	  System.out.println("4.autor");
	  System.out.println("5.formato");
	  p=teclado.nextInt();

	  switch(p){
	  	case 1:
		  String IDvideo;
		  System.out.println("Deme el id del video que buscas");
		  IDvideo =teclado.next();

		  for(videos i:video){
			  if (IDvideo.equalsIgnoreCase(i.getNumarticulo())){
				  teclado.nextLine();
					esta=true;
				  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

	  	case 2:
		  String nombrevideo;
		  System.out.println("Deme el nombre del video que buscas");
		  nombrevideo=teclado.next();

		  for(videos i:video){
			  if (nombrevideo.equalsIgnoreCase(i.getNombre())){
				  teclado.nextLine();
					esta=true;
				  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

	  	case 3:
		  String generovideo;
		  System.out.println("Deme el genero del video que buscas");
		  generovideo=teclado.next();

		  for(videos i:video){
			  if (generovideo.equalsIgnoreCase(i.getTipo())){
					esta=true;
					teclado.nextLine();
				  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

			case 4:
			  String autorvideo;
			  System.out.println("Deme el autor del video que buscas");
			  autorvideo=teclado.next();
			  for(videos i:video){
				  if (autorvideo.equalsIgnoreCase(i.getAutor())){
						esta=true;
						teclado.nextLine();
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
				if(!esta){
					System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
				}
			  break;

			case 5:
			  String formatovideo;
			  System.out.println("Deme el formato del video que buscas");
			  formatovideo=teclado.next();
			  for(audios i:audio){
				  if (formatovideo.equalsIgnoreCase(i.getTipo())){
					  teclado.nextLine();
						esta=true;
						System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
				if(!esta){
					System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
				}
			  break;
	  }
  }

  public void buscarperiodico(){
	  int p;
	  boolean esta=false;
	  System.out.println("");
	  System.out.println("¿porqué campo quieres buscar?");
	  System.out.println("1.ID");
	  System.out.println("2.nombre");
	  System.out.println("3.genero");
	  System.out.println("4.autor");
	  System.out.println("5.formato");
	  p=teclado.nextInt();

	  switch(p){
	  	case 1:
		  String IDperiodico;
		  System.out.println("Deme el id del periodico que buscas");
		  IDperiodico =teclado.next();

		  for(periodicos i:periodico){
			  if (IDperiodico.equalsIgnoreCase(i.getNumarticulo())){
				  teclado.nextLine();
					esta=true;
				  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

	  	case 2:
		  String nombreperiodico;
		  System.out.println("Deme el nombre del periodico que buscas");
		  nombreperiodico=teclado.next();

		  for(periodicos i:periodico){
			  if (nombreperiodico.equalsIgnoreCase(i.getNombre())){
				  teclado.nextLine();
					esta=true;
					System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

	  	case 3:
		  String generoperiodico;
		  System.out.println("Deme el genero del periodico que buscas");
		  generoperiodico=teclado.next();

		  for(periodicos i:periodico){
			  if (generoperiodico.equalsIgnoreCase(i.getTipo())){
				  teclado.nextLine();
					esta=true;
				  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
			  }
		  }
			if(!esta){
				System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
			}
		  break;

		  case 4:
			  String autorperiodico;
			  System.out.println("Deme el autor del periodico que buscas");
			  autorperiodico=teclado.next();

			  for(periodicos i:periodico){
				  if (autorperiodico.equalsIgnoreCase(i.getAutor())){
					  teclado.nextLine();
						esta=true;
						System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
				if(!esta){
					System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
				}
			  break;

		  case 5:
			  String fechaperiodico;
			  System.out.println("Deme el formato del periodico que buscas");
			  fechaperiodico=teclado.next();

			  for(periodicos i:periodico){
				  if (fechaperiodico.equalsIgnoreCase(i.getTipo())){
					  teclado.nextLine();
						esta=true;
						System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
				if(!esta){
					System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
				}
		  	break;
	  	}
	  }

	  public void buscarrevista(){
		  int p;
		  boolean esta=false;
		  System.out.println("");
		  System.out.println("�porque campo quieres buscar?");
		  System.out.println("1.ID");
		  System.out.println("2.nombre");
		  System.out.println("3.genero");
		  System.out.println("4.autor");
		  System.out.println("5.formato");
		  p=teclado.nextInt();

		  switch(p){
		  	case 1:
			  String IDrevista;
			  System.out.println("Deme el id del periodico que buscas");
			  IDrevista =teclado.next();

			  for(revistas i:revista){
				  if (IDrevista.equalsIgnoreCase(i.getNumarticulo())){
					  teclado.nextLine();
						esta=true;
					  System.out.println(i.getNombre()+"     "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
				if(!esta){
					System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
				}
			  break;

		  	case 2:
			  String nombrerevista;
			  System.out.println("Deme el nombre del periodico que buscas");
			  nombrerevista=teclado.next();

			  for(revistas i:revista){
				  if (nombrerevista.equalsIgnoreCase(i.getNombre())){
					  teclado.nextLine();
						esta=true;
						System.out.println(i.getNombre()+"     "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
				if(!esta){
					System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
				}
			  break;

		  	case 3:
			  String generorevista;
			  System.out.println("Deme el genero del periodico que buscas");
			  generorevista=teclado.next();

			  for(revistas i:revista){
				  if (generorevista.equalsIgnoreCase(i.getTipo())){
					  teclado.nextLine();
						esta=true;
					  System.out.println(i.getNombre()+"     "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
				if(!esta){
					System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
				}
			  break;

			  case 4:
				  String autorrevista;
				  System.out.println("Deme el autor del periodico que buscas");
				  autorrevista=teclado.next();

				  for(revistas i:revista){
					  if (autorrevista.equalsIgnoreCase(i.getAutor())){
						  teclado.nextLine();
							esta=true;
						  System.out.println(i.getNombre()+"     "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
					if(!esta){
						System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
					}
		  	break;

				case 5:
				  String fecharevista;
				  System.out.println("Deme el formato del periodico que buscas");
				  fecharevista=teclado.next();

				  for(periodicos i:periodico){
					  if (fecharevista.equalsIgnoreCase(i.getTipo())){
						  teclado.nextLine();
							esta=true;
							System.out.println(i.getNombre()+"     "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
					if(!esta){
						System.out.println("el objeto que buscas no existe o has introducido mal la busqueda");
					}
				  break;
		  	}
  	}

		/********************************
		* Metodos para prestar de todas *
		*********************************/

	  public void prestar(String e){
		  int p, contador = 0, cant;
		  String obj = null, nombreart;
		  System.out.println("");
		  System.out.println("Deme que tipo de objeto quieres listar");
			System.out.println("1.libro");
			System.out.println("2.audio");
			System.out.println("3.video");
			System.out.println("4.periodico");
			System.out.println("5.revista");
			p=teclado.nextInt();
			teclado.nextLine();

			switch(p){
				case 1:
					System.out.println("Deme el nombre del articulo");
					nombreart=teclado.nextLine();

					for(libros i:libro){
						if(nombreart.equalsIgnoreCase(i.getNombre())){
							if(i.getCantidad()==0){
								System.out.println("no quedan mas");
							} else {
							obj="l"+i.getNumarticulo();
							cant=i.getCantidad();
							cant=cant-1;
							}
						}
					}
					break;

				case 2:
					System.out.println("Deme el nombre del articulo");
					nombreart=teclado.nextLine();

					for(audios i:audio){
						if(nombreart.equalsIgnoreCase(i.getNombre())){
							if(i.getCantidad()==0){
								System.out.println("no quedan mas");
							}else
							obj="a"+i.getNumarticulo();
							cant=i.getCantidad();
							cant=cant-1;
						}
					}
					break;

				case 3:
					System.out.println("Deme el nombre del articulo");
					nombreart=teclado.nextLine();

					for(videos i:video){
						if(nombreart.equalsIgnoreCase(i.getNombre())){
							if(i.getCantidad()==0){
								System.out.println("no quedan mas");
							}else
							obj="v"+i.getNumarticulo();
							cant=i.getCantidad();
							cant=cant-1;
						}
					}
					break;

				case 4:
					System.out.println("Deme el nombre del articulo");
					nombreart=teclado.nextLine();

					for(periodicos i:periodico){
						if(nombreart.equalsIgnoreCase(i.getNombre())){
							if(i.getCantidad()==0){
								System.out.println("no quedan mas");
							} else {
							obj="p"+i.getNumarticulo();
							cant=i.getCantidad();
							cant=cant-1;
							}
						}
					}
					break;

				case 5:
					System.out.println("Deme el nombre del articulo");
					nombreart=teclado.nextLine();

					for(revistas i:revista){
						if(nombreart.equalsIgnoreCase(i.getNombre())){
							if(i.getCantidad()==0){
								System.out.println("no quedan mas");
							} else {
							obj="r"+i.getNumarticulo();
							cant=i.getCantidad();
							cant=cant-1;
							}
						}
					}
					break;
			}

			for(usuario n:manager_usuario.usuarios){
				if(e.equalsIgnoreCase(n.getID())){
					usuario.prestamos[contador]=obj;
					contador++;
				}
			}
	  }

	  public void listar_prestamos(String e){
		  char j,k,n1,n2;
		  String h, f;
		  boolean encontrado=false;

		  System.out.println("Deme que objeto quieres listar");
		  System.out.println("libro");
		  System.out.println("audio");
		  System.out.println("video");
		  System.out.println("periodico");
		  System.out.println("revista");
		  h=teclado.nextLine();

		  for(usuario n:manager_usuario.usuarios){
			  if(e.equalsIgnoreCase(n.getID())){
				for(int t=0;t<usuario.prestamos.length;t++){
					j=usuario.prestamos[t].charAt(0);

					k=h.charAt(0);
					n1=h.charAt(1);
					n2=h.charAt(2);
					f=""+n1+n2;

					if(k==j){
						encontrado=true;
						switch(k){
						case 'l':
							for(libros i:libro){
								  if (f.equalsIgnoreCase(i.getNumarticulo())){
									  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
								  }
							  }
							break;

						case 'a':
							for(audios i:audio){
								  if (f.equalsIgnoreCase(i.getNumarticulo())){
									  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
								  }
							  }
							break;

						case 'v':
							for(videos i:video){
								  if (f.equalsIgnoreCase(i.getNumarticulo())){
									  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
								  }
							  }
							break;

						case 'p':
							for(periodicos i:periodico){
								  if (f.equalsIgnoreCase(i.getNumarticulo())){
									  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
								  }
							  }
							break;

						case 'r':
							for(revistas i:revista){
								  if (f.equalsIgnoreCase(i.getNumarticulo())){
									  System.out.println(i.getNombre()+"     "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
								  }
							  }
							break;
						}
					}
			}
		}

	}

		  if(!encontrado){
			  System.out.println("este usuario no tiene objeto prestados, o no se encuentra");
		  }
  }

	  public void devolver(String e){
		  char k;
		  String j, h, f, IDT=null,z;
		  boolean encontrado1=false, encontrado2=false;

		  System.out.println("Deme que objeto quieres devolver");
		  System.out.println("liro");
		  System.out.println("audio");
		  System.out.println("video");
		  System.out.println("periodico");
		  System.out.println("revista");
		  h=teclado.nextLine();

		  System.out.println("Deme el nombre del objeto");
		  f=teclado.nextLine();

		  for(usuario n:manager_usuario.usuarios){
			  if(e.equalsIgnoreCase(n.getID())){
					k=h.charAt(0);

					switch(k){
						case 'l':
							for(libros i:libro){
								if (f.equalsIgnoreCase(i.getNombre())){
									encontrado1=true;
									IDT=i.getNumarticulo();

									z="l"+IDT;

									for(int t=0;t<usuario.prestamos.length;t++){
										if(z.equalsIgnoreCase(usuario.prestamos[t])){
											encontrado2=true;
											usuario.prestamos[t]="";
											}
										}
							  	}
						  	}
						break;

					case 'a':
						for(audios i:audio){
							if (f.equalsIgnoreCase(i.getNombre())){
								encontrado1=true;
								IDT=i.getNumarticulo();

								z="l"+IDT;
								for(int t=0;t<usuario.prestamos.length;t++){
									if(z.equalsIgnoreCase(usuario.prestamos[t])){
										encontrado2=true;
										usuario.prestamos[t]="";
									}
								}
						  }
					  }
						break;

					case 'v':
						for(videos i:video){
							if (f.equalsIgnoreCase(i.getNombre())){
							  encontrado1=true;
							  IDT=i.getNumarticulo();

							  z="l"+IDT;
								for(int t=0;t<usuario.prestamos.length;t++){
									if(z.equalsIgnoreCase(usuario.prestamos[t])){
										encontrado2=true;
										usuario.prestamos[t]="";
									}
								}
							}
						}
						break;

					case 'p':
						for(periodicos i:periodico){
							if (f.equalsIgnoreCase(i.getNombre())){
							  encontrado1=true;
							  IDT=i.getNumarticulo();

							  z="l"+IDT;
								for(int t=0;t<usuario.prestamos.length;t++){
									if(z.equalsIgnoreCase(usuario.prestamos[t])){
										encontrado2=true;
										usuario.prestamos[t]="";
										}
									}
							  }
						  }
						break;

					case 'r':
						for(revistas i:revista){
							if (f.equalsIgnoreCase(i.getNombre())){
							  encontrado1=true;
							  IDT=i.getNumarticulo();

							  z="l"+IDT;
								for(int t=0;t<usuario.prestamos.length;t++){
									if(z.equalsIgnoreCase(usuario.prestamos[t])){
										encontrado2=true;
										usuario.prestamos[t]="";
									}
								}
						  }
					  }
						break;
					}
				}
			}

		  if(!encontrado1){
			  System.out.println("el nombre no coincide");
		  }

		  if(!encontrado2){
			  System.out.println("el bjeto no esta en la lista de prestamos");
		  }
	  }

		/******************************
		* Metodos para subscripciones *
		*******************************/

	  public void anadir_suscripcion(String e){
		  int p, contador = 0, cant;
		  String obj = null, nombreart;
		  System.out.println("Deme que tipo de objeto al que quieres suscribirte");
		  System.out.println("1.periodico");
		  System.out.println("2.revista");
		  p=teclado.nextInt();
		  teclado.nextLine();

  		switch(p){
			  case 1:
					System.out.println("Deme el nombre del articulo");
					nombreart=teclado.nextLine();
					for(periodicos i:periodico){
						if(nombreart.equalsIgnoreCase(i.getNombre())){
							obj="p"+i.getNumarticulo();
							cant=i.getCantidad();
							cant=cant-1;
						}
					}
					break;

				case 2:
					System.out.println("Deme el nombre del articulo");
					nombreart=teclado.nextLine();
					for(revistas i:revista){
						if(nombreart.equalsIgnoreCase(i.getNombre())){
							obj="r"+i.getNumarticulo();
							cant=i.getCantidad();
							cant=cant-1;
						}
					}
					break;
				}

		for(usuario n:manager_usuario.usuarios){
			if(e.equalsIgnoreCase(n.getID())){
				usuario.suscripciones[contador]=obj;
				contador++;
				}
			}
	  }

	 public void eliminar_suscripcion(String e){
		 char k;
		  String j, h, f, IDT=null,z;
		  boolean encontrado1=false, encontrado2=false;

		  System.out.println("Deme que objeto quieres dejar de suscribirte");
		  System.out.println("periodico");
		  System.out.println("revista");
		  h=teclado.nextLine();

		  System.out.println("Deme el nombre del objeto");
		  f=teclado.nextLine();

		  for(usuario n:manager_usuario.usuarios){
			  if(e.equalsIgnoreCase(n.getID())){
					k=h.charAt(0);

					switch(k){
					  case 'p':
							for(periodicos i:periodico){
								  if (f.equalsIgnoreCase(i.getNombre())){
									  encontrado1=true;
									  IDT=i.getNumarticulo();

									  z="l"+IDT;
										for(int t=0;t<usuario.suscripciones.length;t++){
											if(z.equalsIgnoreCase(usuario.suscripciones[t])){
												encontrado2=true;
												usuario.suscripciones[t]="";
											}
										}
								  }
							  }

							break;

						case 'r':
							for(revistas i:revista){
								  if (f.equalsIgnoreCase(i.getNombre())){
									  encontrado1=true;
									  IDT=i.getNumarticulo();

									  z="l"+IDT;
										for(int t=0;t<usuario.suscripciones.length;t++){
											if(z.equalsIgnoreCase(usuario.suscripciones[t])){
												encontrado2=true;
												usuario.suscripciones[t]="";
											}
										}
								  }
							  }
							break;
						}
					}
		  	}
			}
	 	}
