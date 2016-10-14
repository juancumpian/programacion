/***********************
* Clase perfil_usuario *
************************/


public class perfil_usuario implements Comparable{
	private String nombre;
	private String ID;
	private String fecha_de_entrada;

	public perfil_usuario(String ID, String nombre, String fecha_de_entrada){
		this.ID=ID;
		this.nombre=nombre;
		this.fecha_de_entrada=fecha_de_entrada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getFecha_de_entrada() {
		return fecha_de_entrada;
	}

	public void setFecha_de_entrada(String fecha_de_entrada) {
		this.fecha_de_entrada = fecha_de_entrada;
	}
	public int compareTo(Object o) {
		perfil_usuario perfil=(perfil_usuario) o;
		return ID.compareTo(perfil.getID());
		}
}
