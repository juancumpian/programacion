package modelo;

public class carrito_compra {
	int ID;
	String Nombre;
	String tipo;
	Float precio;
	String empresa;
	
	public carrito_compra(int ID,String Nombre, String tipo ,Float precio, String empresa){
		this.ID=ID;
		this.Nombre=Nombre;
		this.tipo=tipo;
		this.precio=precio;
		this.empresa=empresa;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
}
