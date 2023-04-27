package ar.edu.unq.po2.tp8.ej2;

public enum Deporte {
	
	RUNNING(1),
	FUTBOL(2),
	BASKET(2),
	TENNIS(3),
	JABALINA(4);
	
	private int nivelDeComplejidad;

	private Deporte(int nivelDeComplejidad) {
		this.setNivelDeComplejidad(nivelDeComplejidad);
	}

	public int getNivelDeComplejidad() {
		return nivelDeComplejidad;
	}

	private void setNivelDeComplejidad(int nivelDeComplejidad) {
		this.nivelDeComplejidad = nivelDeComplejidad;
	}
}