/***************
* Clase libros *
****************/



public class libros extends material{
	private String ISBN;
	public libros (String numarticulo,String nombre, String tipo,String autor, int cantidad,
			 String ISBN) {
		super(numarticulo, nombre,  cantidad, tipo, autor);
		this.ISBN=ISBN;
	}

	/***************
	* Constructores*
	****************/

	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}



}
