package ar.edu.unq.po2.tp5;

public class ProductoTradicional implements Cobrable {
	
	private String nombre;
	private double precioBase;
	private int stock;
	
	public ProductoTradicional(String nombre,double precioBase, int stock) {
		super();
		this.setNombre(nombre);
		this.setPrecioBase(precioBase);
		this.setStock(stock);
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}
	
	public int getStock() {
		return stock;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	
	private void setStock(int stock) {
		this.stock = stock;
	}

	
	@Override
	public double registrarse() {
		this.reducirStock();
		return this.precioFinal();
	}

	public double precioFinal() {
		return this.getPrecioBase();
	}

	private void reducirStock() {
		this.setStock(stock - 1); 
	}
}
