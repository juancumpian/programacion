/************************
* Clase manager_usuario *
*************************/


import java.util.*;

public class manager_usuario {
	static Scanner teclado=new Scanner(System.in);
	static ArrayList<usuario> usuarios= new ArrayList<usuario>();
	static ArrayList<biblioteca_otras> bibliotecas= new ArrayList<biblioteca_otras>();
	static ArrayList<bibliotecario> bibliotecarios= new ArrayList<bibliotecario>();

	/**
	 * lista de objetos base creados como ejemplo
	 */

	public manager_usuario(){
		usuarios.add(new usuario("01","paco","13/1/03","1111"));
		usuarios.add(new usuario("02","sara","26/6/05","2222"));
		usuarios.add(new usuario("03","john","08/9/12","3333"));
		usuarios.add(new usuario("04","cartago","21/4/09","4444"));
		bibliotecarios.add(new bibliotecario("01","rocio","19/2/04","1111"));
		bibliotecarios.add(new bibliotecario("02","cristo","12/2/15","2222"));
		bibliotecarios.add(new bibliotecario("03","juan","5/8/02","3333"));
		bibliotecarios.add(new bibliotecario("04","pablo","3/8/16","4444"));
		bibliotecas.add(new biblioteca_otras("01", "biblioteca de almoria", "2/5/12", "1111"));
		bibliotecas.add(new biblioteca_otras("02", "biblioteca de yehaviorenda", "1/5/14", "2222"));
	}

	public void anadir_usuario(){
		boolean comprobar=false;
		String IDnuevo, nombrenuevo, fechanueva, contrasenanueva;
		System.out.println("dame el ID del usuario nuevo");
		IDnuevo=teclado.nextLine();
		for(usuario i:usuarios){
			if(IDnuevo.equalsIgnoreCase(i.getID())){
				comprobar=true;
				System.out.println("ese ID ya existe");
			}
		}

		if(!comprobar){
			System.out.println("dame el nombre");
			nombrenuevo=teclado.nextLine();
			System.out.println("dame la fecha de entrada");
			fechanueva=teclado.nextLine();
			System.out.println("dame la contrasena que quieras poner");
			contrasenanueva=teclado.nextLine();

			usuarios.add(new usuario(IDnuevo,nombrenuevo,fechanueva,contrasenanueva));
		}

	}
	public void eliminar_usuario(){
		boolean comprobar=false;
		String IDnuevo;
		System.out.println("dame el ID del usuario nuevo");
		IDnuevo=teclado.nextLine();
		for(usuario i:usuarios){
			if(IDnuevo.equalsIgnoreCase(i.getID())){
				comprobar=true;
				usuarios.remove(i);
				System.out.println("usuario eliminado");
			}
		}
	}

	public void anadir_bibliotecario(){
		boolean comprobar=false;
		String IDnuevo, nombrenuevo, fechanueva, contrasenanueva;
		System.out.println("dame el ID del usuario nuevo");
		IDnuevo=teclado.nextLine();
		for(bibliotecario i:bibliotecarios){
			if(IDnuevo.equalsIgnoreCase(i.getID())){
				comprobar=true;
				System.out.println("ese ID ya existe");
			}
		}

		if(!comprobar){
			System.out.println("dame el nombre");
			nombrenuevo=teclado.nextLine();
			System.out.println("dame la fecha de entrada");
			fechanueva=teclado.nextLine();
			System.out.println("dame la contrasena que quieras poner");
			contrasenanueva=teclado.nextLine();

			bibliotecarios.add(new bibliotecario(IDnuevo,nombrenuevo,fechanueva,contrasenanueva));
		}
	}

	public void eliminar_bibliotecario(){
		boolean comprobar=false;
		String IDnuevo;
		System.out.println("dame el ID del usuario que quieres eliminar");
		IDnuevo=teclado.nextLine();
		for(bibliotecario i:bibliotecarios){
			if(IDnuevo.equalsIgnoreCase(i.getID())){
				comprobar=true;
				bibliotecarios.remove(i);
				System.out.println("usuario eliminado");
			}
		}
		if(!comprobar){
			System.out.println("bibliotecario no encontrado");
		}
	}



	public void listar_bibliotecarios(){
	//listado ordenado de los bibliotecarios
		Collections.sort(bibliotecarios);

		System.out.println("listado de bibliotecarios");
		System.out.println("ID--------nombre-------fecha de entrada");
		for(bibliotecario i:bibliotecarios){

			System.out.println(i.getID()+"        "+i.getNombre()+"       "+i.getFecha_de_entrada());
		}
	}
	public void listar_usuarios(){
	 //listado ordenado de los usuarios estandar
		Collections.sort(usuarios);

		System.out.println("listado de usuarios");
		System.out.println("ID--------nombre-------fecha de entrada");
		for(usuario i:usuarios){

			System.out.println(i.getID()+"        "+i.getNombre()+"       "+i.getFecha_de_entrada());
		}
	}

	public void listar_bibliotecas(){
		 //listado ordenado de las bibliotecas
			Collections.sort(bibliotecas);

			System.out.println("listado de usuarios");
			System.out.println("ID--------nombre-------fecha de entrada");
			for(biblioteca_otras i:bibliotecas){

				System.out.println(i.getID()+"        "+i.getNombre()+"       "+i.getFecha_de_entrada());
			}
		}
	}
