/*******************************************
* Clase para las operaciones de biblioteca *
********************************************/


import java.util.*;

public class biblioteca_operaciones {
	static Scanner teclado=new Scanner (System.in);
	ArrayList<libros> libro= new ArrayList<libros>();
	ArrayList<audios> audio= new ArrayList<audios>();
	ArrayList<videos> video= new ArrayList<videos>();
	ArrayList<periodicos> periodico= new ArrayList<periodicos>();
	ArrayList<revistas> revista= new ArrayList<revistas>();

	public biblioteca_operaciones(){
		libro.add(new libros("01","pepe en las islas griegas","terror","pepe nolan",100,"47239865B"));
		libro.add(new libros("02","Montoro se casa con un oso","suspense","Dmitri Ptrenco",10,"47567565F"));
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

	public void hacer_solicitud(String e){
		boolean esta=false;
		 int p = 0, contador = 0, cant;

		  String s = null, obj = null, nombreart;
		  do{
			  System.out.println("¿quieres añadir un articulo a la solicitud?(si/no)");
			  s=teclado.nextLine();
		while (p<6){
		System.out.println("dime el tipo de objeto que quieres");
		System.out.println("1.libro");
		System.out.println("2.audio");
		System.out.println("3.video");
		System.out.println("4.periodico");
		System.out.println("5.revista");
		p=teclado.nextInt();
		teclado.nextLine();
		switch(p){
		case 1:
			System.out.println("dime el nombre del articulo");
			nombreart=teclado.nextLine();
			for(libros i:libro){
				if(nombreart.equalsIgnoreCase(i.getNombre())){
					if(i.getCantidad()==0){
						System.out.println("no quedan mas");
					}else

					obj="l"+i.getNumarticulo();
					cant=i.getCantidad();
					cant=cant-1;
				}
			}

			break;
		case 2:
			System.out.println("dime el nombre del articulo");
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
			System.out.println("dime el nombre del articulo");
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
			System.out.println("dime el nombre del articulo");
			nombreart=teclado.nextLine();
			for(periodicos i:periodico){
				if(nombreart.equalsIgnoreCase(i.getNombre())){
					if(i.getCantidad()==0){
						System.out.println("no quedan mas");
					}else
					obj="p"+i.getNumarticulo();
					cant=i.getCantidad();
					cant=cant-1;
				}
			}
			break;
		case 5:
			System.out.println("dime el nombre del articulo");
			nombreart=teclado.nextLine();
			for(revistas i:revista){
				if(nombreart.equalsIgnoreCase(i.getNombre())){
					if(i.getCantidad()==0){
						System.out.println("no quedan mas");
					}else
					obj="r"+i.getNumarticulo();
					cant=i.getCantidad();
					cant=cant-1;
				}
			}
			break;
	}
		}
	for(biblioteca_otras n:manager_usuario.bibliotecas){
		  if(e.equalsIgnoreCase(n.getID())){
			  System.out.println("objeto añadido");
				biblioteca_otras.lista[contador]=obj;
				contador++;

		}
		}
		  }while(s.equalsIgnoreCase("si"));
}

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

	 public void buscarlibro(){
		  int p;
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
			  System.out.println("dime el id del libro que buscas");
			  IDlibro=teclado.next();
			  for(libros i:libro){
				  if (IDlibro.equalsIgnoreCase(i.getNumarticulo())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
		  case 2:
			  String nombrelibro;
			  System.out.println("dime el nombre del libro que buscas");
			  nombrelibro=teclado.next();
			  for(libros i:libro){
				  if (nombrelibro.equalsIgnoreCase(i.getNombre())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
		  case 3:
			  String generolibro;
			  System.out.println("dime el genero del libro que buscas");
			  generolibro=teclado.next();
			  for(libros i:libro){
				  if (generolibro.equalsIgnoreCase(i.getTipo())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
			  case 4:
				  String autorlibro;
				  System.out.println("dime el autor del libro que buscas");
				  autorlibro=teclado.next();
				  for(libros i:libro){
					  if (autorlibro.equalsIgnoreCase(i.getAutor())){
						  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
				  break;
			  case 5:
				  String ISBNlibro;
				  System.out.println("dime el ISBN del libro que buscas");
				  ISBNlibro=teclado.next();
				  for(libros i:libro){
					  if (ISBNlibro.equalsIgnoreCase(i.getTipo())){
						  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
				  break;
		  }
	  }

	  public void buscaraudio(){
		  int p;
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
			  System.out.println("dime el id del audio que buscas");
			  IDaudio =teclado.next();
			  for(audios i:audio){
				  if (IDaudio.equalsIgnoreCase(i.getNumarticulo())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
		  	case 2:
			  String nombreaudio;
			  System.out.println("dime el nombre del audio que buscas");
			  nombreaudio=teclado.next();
			  for(audios i:audio){
				  if (nombreaudio.equalsIgnoreCase(i.getNombre())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
		  	case 3:
			  String generoaudio;
			  System.out.println("dime el genero del audio que buscas");
			  generoaudio=teclado.next();
			  for(audios i:audio){
				  if (generoaudio.equalsIgnoreCase(i.getTipo())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
			  case 4:
				  String autoraudio;
				  System.out.println("dime el autor del audio que buscas");
				  autoraudio=teclado.next();
				  for(audios i:audio){
					  if (autoraudio.equalsIgnoreCase(i.getAutor())){
						  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
				  break;
			  case 5:
				  String formatoaudio;
				  System.out.println("dime el formato del audio que buscas");
				  formatoaudio=teclado.next();
				  for(audios i:audio){
					  if (formatoaudio.equalsIgnoreCase(i.getTipo())){
						  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
				  break;
		  }
	  }

	  public void buscarvideo(){
		  int p;
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
			  System.out.println("dime el id del video que buscas");
			  IDvideo =teclado.next();
			  for(videos i:video){
				  if (IDvideo.equalsIgnoreCase(i.getNumarticulo())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
		  	case 2:
			  String nombrevideo;
			  System.out.println("dime el nombre del video que buscas");
			  nombrevideo=teclado.next();
			  for(videos i:video){
				  if (nombrevideo.equalsIgnoreCase(i.getNombre())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
		  	case 3:
			  String generovideo;
			  System.out.println("dime el genero del video que buscas");
			  generovideo=teclado.next();
			  for(videos i:video){
				  if (generovideo.equalsIgnoreCase(i.getTipo())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
			  case 4:
				  String autorvideo;
				  System.out.println("dime el autor del video que buscas");
				  autorvideo=teclado.next();
				  for(videos i:video){
					  if (autorvideo.equalsIgnoreCase(i.getAutor())){
						  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
				  break;
			  case 5:
				  String formatovideo;
				  System.out.println("dime el formato del video que buscas");
				  formatovideo=teclado.next();
				  for(audios i:audio){
					  if (formatovideo.equalsIgnoreCase(i.getTipo())){
						  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
				  break;
		  }
	  }

	  public void buscarperiodico(){
		  int p;
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
			  System.out.println("dime el id del periodico que buscas");
			  IDperiodico =teclado.next();
			  for(periodicos i:periodico){
				  if (IDperiodico.equalsIgnoreCase(i.getNumarticulo())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
		  	case 2:
			  String nombreperiodico;
			  System.out.println("dime el nombre del periodico que buscas");
			  nombreperiodico=teclado.next();
			  for(periodicos i:periodico){
				  if (nombreperiodico.equalsIgnoreCase(i.getNombre())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
		  	case 3:
			  String generoperiodico;
			  System.out.println("dime el genero del periodico que buscas");
			  generoperiodico=teclado.next();
			  for(periodicos i:periodico){
				  if (generoperiodico.equalsIgnoreCase(i.getTipo())){
					  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
				  }
			  }
			  break;
			  case 4:
				  String autorperiodico;
				  System.out.println("dime el autor del periodico que buscas");
				  autorperiodico=teclado.next();
				  for(periodicos i:periodico){
					  if (autorperiodico.equalsIgnoreCase(i.getAutor())){
						  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
				  break;
			  case 5:
				  String fechaperiodico;
				  System.out.println("dime el formato del periodico que buscas");
				  fechaperiodico=teclado.next();
				  for(periodicos i:periodico){
					  if (fechaperiodico.equalsIgnoreCase(i.getTipo())){
						  System.out.println(i.getNombre()+"    "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
				  break;
		  	}
		  }

		  public void buscarrevista(){
			  int p;
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
				  System.out.println("dime el id del periodico que buscas");
				  IDrevista =teclado.next();
				  for(revistas i:revista){
					  if (IDrevista.equalsIgnoreCase(i.getNumarticulo())){
						  System.out.println(i.getNombre()+"     "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
				  break;
			  	case 2:
				  String nombrerevista;
				  System.out.println("dime el nombre del periodico que buscas");
				  nombrerevista=teclado.next();
				  for(revistas i:revista){
					  if (nombrerevista.equalsIgnoreCase(i.getNombre())){
						  System.out.println(i.getNombre()+"     "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
				  break;
			  	case 3:
				  String generorevista;
				  System.out.println("dime el genero del periodico que buscas");
				  generorevista=teclado.next();
				  for(revistas i:revista){
					  if (generorevista.equalsIgnoreCase(i.getTipo())){
						  System.out.println(i.getNombre()+"     "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
					  }
				  }
				  break;
				  case 4:
					  String autorrevista;
					  System.out.println("dime el autor del periodico que buscas");
					  autorrevista=teclado.next();
					  for(revistas i:revista){
						  if (autorrevista.equalsIgnoreCase(i.getAutor())){
							  System.out.println(i.getNombre()+"     "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
						  }
					  }
					  break;
				  case 5:
					  String fecharevista;
					  System.out.println("dime el formato del periodico que buscas");
					  fecharevista=teclado.next();
					  for(periodicos i:periodico){
						  if (fecharevista.equalsIgnoreCase(i.getTipo())){
							  System.out.println(i.getNombre()+"     "+i.getAutor()+"        "+i.getAutor()+"      "+i.getCantidad());
						  }
					  }
					  break;
			  }
	  	}

		  public void mostrar_solicitud(String e){
			  char j,k,n1,n2;
			  String h, f;
			  boolean encontrado=false;

			  System.out.println("dime que objeto quieres listar");
			  System.out.println("libro");
			  System.out.println("audio");
			  System.out.println("video");
			  System.out.println("periodico");
			  System.out.println("revista");
			  h=teclado.nextLine();

			  for(biblioteca_otras n:manager_usuario.bibliotecas){
				  if(e.equalsIgnoreCase(n.getID())){
					for(int t=0;t<biblioteca_otras.lista.length;t++){

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
}
