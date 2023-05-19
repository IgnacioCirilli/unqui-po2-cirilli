package ar.edu.unq.po2.tp6Solid.ej2;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int    edad;
	private float  sueldoNetoMensual;

	public Cliente(String nombre, String apellido, String direccion, int edad, float sueldoNetoMensual) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDireccion(direccion);
		this.setEdad(edad);
		this.setSueldoNetoMensual(sueldoNetoMensual);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(float sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public float sueldoNetoAnual() {
		return this.getSueldoNetoMensual() * 12;
	}
}
