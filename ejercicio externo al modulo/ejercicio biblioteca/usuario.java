/****************
* Clase usuario *
****************/



public class usuario extends perfil_usuario{

	private String contrasena_usuario;
	static String[] prestamos=new String[6];
	static String[] suscripciones=new String[6];

	public usuario(String ID, String nombre,  String fecha_de_entrada, String contrasena_usuario) {
		super(ID, nombre,  fecha_de_entrada);
		this.contrasena_usuario=contrasena_usuario;

	}

	/***************************
	* Constructores contrasena *
	****************************/

	public String getContrasena_usuario() {
		return contrasena_usuario;
	}

	public void setContrasena_usuario(String contrasena_usuario) {
		this.contrasena_usuario = contrasena_usuario;
	}

}
