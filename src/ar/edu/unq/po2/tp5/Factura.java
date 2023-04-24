package ar.edu.unq.po2.tp5;

public class Factura {

	private double montoTotalAPagar;
	private String concepto;

	public Factura(double montoTotalAPagar, String concepto) {
		super();
		this.setMontoTotalAPagar(montoTotalAPagar);
		this.setConcepto(concepto);
	}

	public double getMontoTotalAPagar() {
		return montoTotalAPagar;
	}

	public String getConcepto() {
		return concepto;
	}

	private void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	private void setMontoTotalAPagar(double montoTotalAPagar) {
		this.montoTotalAPagar = montoTotalAPagar;
	}
}
