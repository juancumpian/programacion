/**********************
* Clase bibliotecario *
***********************/



public class bibliotecario extends perfil_usuario {
	private String contrasena_bibliotecario;

	public bibliotecario( String ID, String nombre, String fecha_de_entrada, String contrasena_bibliotecario) {
		super(ID,nombre, fecha_de_entrada);
		this.contrasena_bibliotecario=contrasena_bibliotecario;
	}
	public String getContrasena_bibliotecario() {
		return contrasena_bibliotecario;
	}
	public void setContrasena_bibliotecario(String contrasena_bibliotecario) {
		this.contrasena_bibliotecario = contrasena_bibliotecario;
	}
}
