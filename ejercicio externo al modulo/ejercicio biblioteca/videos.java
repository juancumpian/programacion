/***************
* Clase videos * 
****************/

public class videos extends material {

	private String formato;

	public videos(String numarticulo, String nombre,  String tipo, String autor, int cantidad, String formato) {
		super(numarticulo, nombre, cantidad, tipo,autor);
		this.formato=formato;
	}

	/****************
	* Constructores *
	****************/

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

}
