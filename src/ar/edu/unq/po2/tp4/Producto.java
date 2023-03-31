package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;

	public Producto(String string, double d, boolean b) {
		this.setNombre(string);
		this.setPrecio(d);
		this.setEsPrecioCuidado(b);
	}

	public Producto(String string, double d) {
		this.setNombre(string);
		this.setPrecio(d);
		this.setEsPrecioCuidado(false);
	}
	
	public boolean esPrecioCuidado() {
		return this.getEsPrecioCuidado();
	}

	private boolean getEsPrecioCuidado() {
		return this.esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean precioCuidado) {
		this.esPrecioCuidado = precioCuidado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public void aumentarPrecio(double d) {
		this.setPrecio(this.getPrecio() + d);
	}

}
