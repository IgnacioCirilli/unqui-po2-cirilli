package ar.edu.unq.po2.tp9Composite.ej2;

public class ParcelaPura implements Parcela {
	
	private Cultivo cultivo;

	public ParcelaPura(Cultivo cultivo) {
		this.setCultivo(cultivo);
	}

	public Cultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}


	@Override
	public double obtenerGananciasAnualesTotales() {
		return this.getCultivo().getValorAnual();
	}
	
}
