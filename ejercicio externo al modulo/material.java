/*****************
* Clase material *
******************/


public class material implements Comparable{

	private String nombre;
	private String numarticulo;
	private int cantidad;
	private String tipo;
	private String autor;

	public material(String numarticulo, String nombre, int cantidad, String tipo,String autor){
		this.numarticulo=numarticulo;
		this.nombre=nombre;
		this.tipo=tipo;
		this.autor=autor;
		this.cantidad=cantidad;
	}

	/****************
	* Constructores *
	****************/

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumarticulo() {
		return numarticulo;
	}

	public void setNumarticulo(String numarticulo) {
		this.numarticulo = numarticulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "material [nombre=" + nombre + ", numarticulo=" + numarticulo
				+ ", cantidad=" + cantidad + "]";
	}

	@Override
	public int compareTo(Object o) {
		material nuevomaterial=(material) o;
		return numarticulo.compareTo(nuevomaterial.getNumarticulo());
	}
}
