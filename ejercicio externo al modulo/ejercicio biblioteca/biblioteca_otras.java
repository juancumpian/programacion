/**************************
* Clase otras bibliotecas *
***************************/



public class biblioteca_otras extends perfil_usuario {
	private String contrasena_biblioteca;
	static String[] lista=new String[20];

	/**********
	+ Metodos *
	***********/

	public biblioteca_otras(String ID, String nombre,  String fecha_de_entrada, String contrasena_biblioteca) {
		super(ID, nombre,  fecha_de_entrada);
		this.contrasena_biblioteca=contrasena_biblioteca;
	}
	public String getContrasena_biblioteca() {
		return contrasena_biblioteca;
	}
	public void setContrasena_biblioteca(String contrasena_biblioteca) {
		this.contrasena_biblioteca = contrasena_biblioteca;
	}
}
