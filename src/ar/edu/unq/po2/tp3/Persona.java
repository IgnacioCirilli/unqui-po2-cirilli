package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.setNombre(nombre);
		this.setFechaDeNacimiento(fechaDeNacimiento);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
	public int edad() {
		return (int) ChronoUnit.YEARS.between(this.getFechaDeNacimiento(), LocalDate.now());
	}
	
	
	public boolean menorQue(Persona persona) {
		return  this.edad() < persona.edad();
	}
	

}
