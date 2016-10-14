/***************
* Clase menus *
****************/

import java.util.*;

public class menus {

	public static manager_usuario a=new manager_usuario();
	public static coleccion b=new coleccion();
	public static biblioteca_operaciones s=new biblioteca_operaciones();
	private static Scanner teclado=new Scanner(System.in);

	public int dibujaMenu(){
		int q=0;
		System.out.println("con que objeto trabajamos?");
		System.out.println("1.libro");
		System.out.println("2.audio");
		System.out.println("3.video");
		System.out.println("4.periodico");
		System.out.println("5.revista");
		System.out.println("6.V.M.P.");
		q=teclado.nextInt();
		teclado.nextLine();
		return 	q;
	}
	public void menu(){
		int p=0;

		System.out.println("dime que tipo de usuario quieres entrar");
		System.out.println("1.usuario estandar");
		System.out.println("2.bibliotecario");
		System.out.println("3.biblioteca");
		p=teclado.nextInt();
		teclado.nextLine();
		switch (p){

		case 1:
			String codusu;
			String contrasenausu;
			boolean contrasenab=false, codb=false;
			System.out.println("dime tu codigo de usuario");
			codusu=teclado.nextLine();
			System.out.println("dime tu contrasena");
			contrasenausu=teclado.nextLine();

	 		for(usuario i: a.usuarios){
				if(codusu.equalsIgnoreCase(i.getID())){
					codb=true;
				}
				if(contrasenausu.equalsIgnoreCase(i.getContrasena_usuario())){
					contrasenab=true;
				}
			}

			if (!codb || !contrasenab){
				System.out.println("el codigo no existe o no coincide con la contrasena");
			} else {
				int y=0, l=0;
				while(y<5){
				System.out.println("dime que accion quieres hacer");
				System.out.println("1.listar objeto");
				System.out.println("2.prestar objeto");
				System.out.println("3.devolver objeto");
				System.out.println("4.listar prestamos");
				System.out.println("5.buscar objeto");
				System.out.println("6.anadir suscripcion");
				System.out.println("7.eliminar suscripcion");
				System.out.println("8.salir de esta sesion");

				y=teclado.nextInt();
				teclado.nextLine();
				switch (y){
					case 1:
						l=dibujaMenu();

						switch (l){
							case 1:
								b.listarlibro();
								break;

							case 2:
								b.listaraudio();
								break;

							case 3:
								b.listarvideo();
								break;

							case 4:
								b.listarperiodico();
								break;

							case 5:
								b.listarrevista();
								break;
					}
					break;

				case 2:
					b.prestar(codusu);
					break;
				case 3:
					b.devolver(codusu);
					break;
				case 4:
					b.listar_prestamos(codusu);
					break;
				case 5:
					int q=0;
					while(q<6){
					q=dibujaMenu();

					switch (q){

					case 1:
						b.buscarlibro();
						break;

					case 2:
						b.buscaraudio();
						break;

					case 3:
						b.buscarvideo();
						break;

					case 4:
						b.buscarperiodico();
						break;

					case 5:
						b.buscarrevista();
						break;
					}
					}
					break;
				case 6:
					b.anadir_suscripcion(codusu);
					break;

				case 7:
					b.eliminar_suscripcion(codusu);
					break;
				}
			}
		}
			break;

		case 2:
			String codbibliotecario;
			String contrasenabibliotecario;
			boolean contrasenabiblio=false, codbiblio=false;

			System.out.println("dime tu codigo de usuario");
			codbibliotecario=teclado.nextLine();
			System.out.println("dime tu contrasena");
			contrasenabibliotecario=teclado.nextLine();

			for(bibliotecario i: a.bibliotecarios){

				if(codbibliotecario.equalsIgnoreCase(i.getID())  ){
					codbiblio=true;
				}
				if(contrasenabibliotecario.equalsIgnoreCase(i.getContrasena_bibliotecario())){
					contrasenabiblio=true;
				}
			}
			if (!codbiblio || !contrasenabiblio){
				System.out.println("la contrasena no existe o no coincide con el usuario");
			}else{
				int h=0;
			while(h<12){
				System.out.println("dime que accion quieres hacer");
				System.out.println("1.anadir usuario");
				System.out.println("2.eliminar usuario");
				System.out.println("3.anadir bibliotecario");
				System.out.println("4.eliminar bibliotecario");
				System.out.println("5.listar usuarios");
				System.out.println("6.listar bibliotecario");
				System.out.println("7.lista bibliotecas");
				System.out.println("8.anadir nuevo objeto");
				System.out.println("9.eliminar objeto");
				System.out.println("10.buscar objeto");
				System.out.println("11.listar objeto");
				System.out.println("12.salir de esta sesion");

				h=teclado.nextInt();
				teclado.nextLine();
				switch (h){

				case 1:
					a.anadir_usuario();
					break;

				case 2:
					a.eliminar_usuario();
					break;

				case 3:
					a.anadir_bibliotecario();
					break;

				case 4:
					a.eliminar_bibliotecario();
					break;

				case 5:
					a.listar_usuarios();
					break;

				case 6:
					a.listar_bibliotecarios();
					break;

				case 7:
					a.listar_bibliotecas();
					break;

				case 8:
					int k=dibujaMenu();

					switch (k){

					case 1:
						b.anadir_libro();
						break;

					case 2:
						b.anadir_audio();
						break;

					case 3:
						b.anadir_video();
						break;

					case 4:
						b.anadir_periodico();
						break;

					case 5:
						b.anadir_revista();
						break;
					}

				case 9:
					int f=0;
					while(f<6){
					f=dibujaMenu();

					switch (f){

					case 1:
						b.eliminar_libro();
						break;

					case 2:
						b.eliminar_audio();
						break;

					case 3:
						b.eliminar_video();
						break;

					case 4:
						b.eliminar_periodico();
						break;

					case 5:
						b.eliminar_revista();
						break;
					}
					}
				case 10:
					int q=0;
					while(q<6){
					q=dibujaMenu();

					switch (q){

					case 1:
						b.buscarlibro();
						break;

					case 2:
						b.buscaraudio();
						break;

					case 3:
						b.buscarvideo();
						break;

					case 4:
						b.buscarperiodico();
						break;

					case 5:
						b.buscarrevista();
						break;
					}
					}

				case 11:
					int l=0;
					while(l<6){
					l=dibujaMenu();

					switch (l){

					case 1:
						b.listarlibro();
						break;

					case 2:
						b.listaraudio();
						break;

					case 3:
						b.listarvideo();
						break;

					case 4:
						b.listarperiodico();
						break;

					case 5:
						b.listarrevista();
						break;
					}
				}
			}
		}
	}
			break;

		case 3:
			String codbiblioteca;
			String contrasenabiblioteca;
			boolean contrasenabibliotecas=false, codbibliotecas=false;

			System.out.println("dime el codigo de biblioteca");
			codbiblioteca=teclado.nextLine();
			System.out.println("dime la contrasena de la iblioteca");
			contrasenabiblioteca=teclado.nextLine();

			for(biblioteca_otras i: a.bibliotecas){

				if(codbiblioteca.equalsIgnoreCase(i.getID())  ){
					codbibliotecas=true;
				}
				if(contrasenabiblioteca.equalsIgnoreCase(i.getContrasena_biblioteca())){
					contrasenabibliotecas=true;
				}
			}
			if (!codbibliotecas || !contrasenabibliotecas){
				System.out.println("la contrasena no existe o no coincide con el usuario");
			}else{
				int l = 0;

				while(l<5){

			System.out.println("dime que quieres hacer");
			System.out.println("1.listar objetos de la otra biblioteca");
			System.out.println("2.buscar objeto");
			System.out.println("3.hacer solicitud");
			System.out.println("4.mostrar solicitud");
			l=teclado.nextInt();
			teclado.nextLine();

			switch (l){
			case 1:
				l=dibujaMenu();

				switch (l){
					case 1:
						s.listarlibro();
						break;

					case 2:
						s.listaraudio();
						break;

					case 3:
						s.listarvideo();
						break;

					case 4:
						s.listarperiodico();
						break;

					case 5:
						s.listarrevista();
						break;
			}
			break;
			case 2:
				int q=0;
				while(q<6){
				q=dibujaMenu();

				switch (q){

				case 1:
					s.buscarlibro();
					break;

				case 2:
					s.buscaraudio();
					break;

				case 3:
					s.buscarvideo();
					break;

				case 4:
					s.buscarperiodico();
					break;

				case 5:
					s.buscarrevista();
					break;
				}
				break;

			}
				break;
			case 3:
				s.hacer_solicitud(codbiblioteca);
			break;
			case 4:
				s.mostrar_solicitud(codbiblioteca);
				break;
		}
			}

}
			break;
}
}
}
