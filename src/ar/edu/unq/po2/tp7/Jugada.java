package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;

public class Jugada {
	
	private List<Carta> cartas;
	
	
	public Jugada() {
		
		this.setCartas(new ArrayList<Carta>());
		
	}
	
	
	public List<Carta> getCartas() {
		return cartas;
	}


	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}


	public void agregarCarta(Carta carta) {
		this.getCartas().add(carta);
	}


	public Carta getCarta(int nroDeCarta) {
		return this.getCartas().get(nroDeCarta - 1);
	}


	public List<Carta> obtenerPrimeras(int nroDeCartasSolicitadas) {
		return this.getCartas().stream().limit(nroDeCartasSolicitadas).toList();
	}

}
