package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends ProductoTradicional implements Cobrable {

	public ProductoCooperativa(String nombre, double precioBase, int stock) {
		super(nombre, precioBase, stock);
	}
	
	public double descuento() {
		return 0.10d;
	}
	
	private double descuentoAAplicar() {
		return super.getPrecioBase() * this.descuento();
	}	
	
	@Override
	public double precioFinal() {
		return super.getPrecioBase() - this.descuentoAAplicar();	
	}
}
