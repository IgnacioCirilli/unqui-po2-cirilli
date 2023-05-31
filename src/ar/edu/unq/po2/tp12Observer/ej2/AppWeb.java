package ar.edu.unq.po2.tp12Observer.ej2;

import java.util.List;
import java.util.ArrayList;
import java.util.Observable;

public class AppWeb extends Observable {

	private List<Partido> partidos;
	
	public AppWeb() {
		super();
		this.setPartidos(new ArrayList<Partido>());
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
	public void agregarPartido(Partido partido) {
		this.getPartidos().add(partido);
		super.notifyObservers(partido);
	}
	
}
