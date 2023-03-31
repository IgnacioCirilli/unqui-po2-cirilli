package ar.edu.unq.po2.tp4.ej1y2;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double porcentajeDeDescuento;


	public ProductoPrimeraNecesidad(String string, double d, boolean b, double porcentajeDeDescuento) {
		super(string, d, b);
		this.setPorcentajeDeDescuento(porcentajeDeDescuento);
	}
	
	public double getPorcentajeDeDescuento() {
		return porcentajeDeDescuento;
	}

	public void setPorcentajeDeDescuento(double porcentajeDeDescuento) {
		this.porcentajeDeDescuento = porcentajeDeDescuento;
	}

	public Double getPrecio() {
		return super.getPrecio() - this.descuentoAplicadoPorPrimeraNecesidad();
	}

	private Double descuentoAplicadoPorPrimeraNecesidad() {
		return (this.getPorcentajeDeDescuento() * super.getPrecio()) / 100d;
	}


}
