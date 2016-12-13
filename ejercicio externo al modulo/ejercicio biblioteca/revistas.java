/***************
* Clase revistas *
****************/



public class revistas extends material{
	private String fecha;
	public revistas(String numarticulo, String nombre,  String tipo, String autor, int cantidad,
			 String fecha) {
		super(numarticulo, nombre,  cantidad, tipo, autor);
		this.fecha=fecha;
	}

	/****************
	* Constructores *
	*****************/
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
