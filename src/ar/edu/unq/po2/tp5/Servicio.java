package ar.edu.unq.po2.tp5;

public class Servicio implements Cobrable {
	
	private double costoFijoPorUnidad;
	private int cantidadDeUnidadesConsumidas;
	
	public Servicio(double costoFijoPorUnidad, int cantidadDeUnidadesConsumidas) {
		super();
		this.setCostoFijoPorUnidad(costoFijoPorUnidad);
		this.setCantidadDeUnidadesConsumidas(cantidadDeUnidadesConsumidas);
	}

	public double getCostoFijoPorUnidad() {
		return costoFijoPorUnidad;
	}

	public int getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}

	private void setCostoFijoPorUnidad(double costoFijoPorUnidad) {
		this.costoFijoPorUnidad = costoFijoPorUnidad;
	}

	private void setCantidadDeUnidadesConsumidas(int cantidadDeUnidadesConsumidas) {
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}

	@Override
	public double registrarse() {
		return this.getCostoFijoPorUnidad() * this.getCantidadDeUnidadesConsumidas();
	}
}
