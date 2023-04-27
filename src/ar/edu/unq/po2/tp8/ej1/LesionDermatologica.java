package ar.edu.unq.po2.tp8.ej1;

public enum LesionDermatologica {
	
	ROJO("Es una quemadura de tercer grado", 3, "Gris"), 
	GRIS("Es una quemadura de segundo grado", 2, "Amarillo"), 
	AMARILLO("Es una quemadura de primer grado", 1, "Miel"), 
	MIEL("Es un moreton", 0, "Rojo");
	
	private String descripcion;
	private int nivelDeRiesgo;
	private String siguienteColorDeMaduracion;
	
	private LesionDermatologica(String descripcion, int nivelDeRiesgo, String siguienteColorDeMaduracion) {
		this.setDescripcion(descripcion);
		this.setNivelDeRiesgo(nivelDeRiesgo);
		this.setSiguienteColorDeMaduracion(siguienteColorDeMaduracion);
	}

	public String getSiguienteColorDeMaduracion() {
		return siguienteColorDeMaduracion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	private void setNivelDeRiesgo(int nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}
	
	private void setSiguienteColorDeMaduracion(String siguienteColorDeMaduracion) {
		this.siguienteColorDeMaduracion = siguienteColorDeMaduracion;
	}
}
