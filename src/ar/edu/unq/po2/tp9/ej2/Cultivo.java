package ar.edu.unq.po2.tp9.ej2;

public enum Cultivo {
	
	TRIGO(300), SOJA(500);
	
	private double valorAnual;
	
	private Cultivo(double valorAnual) {
		this.setValorAnual(valorAnual);
	}

	public double getValorAnual() {
		return valorAnual;
	}

	private void setValorAnual(double valorAnual) {
		this.valorAnual = valorAnual;
	}
	
}
