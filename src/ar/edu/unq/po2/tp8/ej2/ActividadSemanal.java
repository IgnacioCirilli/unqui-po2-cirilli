package ar.edu.unq.po2.tp8.ej2;

import java.util.Arrays;
import java.util.List;

public class ActividadSemanal {
	
	public static void main(String[] args) {
		
		ActividadSemanal actividadSemanal = new ActividadSemanal(DiaDeLaSemana.LUNES, 16, 2, Deporte.BASKET);
		
		System.out.println(actividadSemanal.toString());
	}
	
	private DiaDeLaSemana dia;
	private int horarioDeInicio;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, int horarioDeInicio, int duracion, Deporte deporte) {
		super();
		this.setDia(dia);
		this.setHorarioDeInicio(horarioDeInicio);
		this.setDuracion(duracion);
		this.setDeporte(deporte);
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public int getHorarioDeInicio() {
		return horarioDeInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	private void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}

	private void setHorarioDeInicio(int horarioDeInicio) {
		this.horarioDeInicio = horarioDeInicio;
	}

	private void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	private void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	
	public int obtenerCosto() {
		
		return valorPorDia() + valorPorDeporte();
	}

	private int valorPorDeporte() {
		
		return getDeporte().getNivelDeComplejidad() * valorFijoPorComplejidad();
	}

	private int valorFijoPorComplejidad() {
		
		return 200;
	}

	private int valorPorDia() {
		
		return costoDeHoraPorDia() * getDuracion();
	}

	public int costoDeHoraPorDia() {
		
		List<DiaDeLaSemana> listaDeDiasDeCosto500 = Arrays.asList(DiaDeLaSemana.LUNES, DiaDeLaSemana.MARTES, DiaDeLaSemana.MIERCOLES);
		int costoDeHoraPorDia = 1000;
		
		if (listaDeDiasDeCosto500.contains(getDia())) {
			costoDeHoraPorDia = 500; 
		}
		
		return costoDeHoraPorDia;
	}

	
	@Override
	public String toString() {
		return "Deporte: " + getDeporte() + ". " +
				"Dia: " + getDia() + " " +
				"A LAS: " + getHorarioDeInicio() + " . "  +
				"Duracion: " + getDuracion() + " hora(s).";
	}	
}