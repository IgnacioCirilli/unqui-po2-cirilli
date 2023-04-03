package ar.edu.unq.po2.tp3;

import java.util.List;

public class EquipoDeTrabajo {

	private String nombre;
	private List<Persona> integrantes;
	
	
	public EquipoDeTrabajo(String nombre, List<Persona> integrantes) {
		super();
		this.setNombre(nombre);
		this.setIntegrantes(integrantes);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Persona> getIntegrantes() {
		return integrantes;
	}


	public void setIntegrantes(List<Persona> integrantes) {
		this.integrantes = integrantes;
	}
	
	
	public void agregarIntegrante(Persona integrante) {
		this.getIntegrantes().add(integrante);
	}
	
	
	public double promedioDeEdadDeIntegrantes() {
		return this.edadTotalDeIntegrantes() / this.getIntegrantes().size();
	}


	private double edadTotalDeIntegrantes() {
		double edadTotalPorAhora = 0;
		for (Persona integrante : this.getIntegrantes()) {
			edadTotalPorAhora += integrante.edad();
		}
		return edadTotalPorAhora;
	}
	
	
}
