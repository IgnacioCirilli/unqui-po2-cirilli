package ar.edu.unq.po2.tp9Composite.ej3;

import java.util.ArrayList;
import java.util.List;

public class Ejercito extends Personaje {

	private List<Personaje> personajes;
	
	public Ejercito() {
		super();
		this.setPersonajes(new ArrayList<Personaje>());
	}

	public List<Personaje> getPersonajes() {
		return personajes;
	}

	private void setPersonajes(List<Personaje> personajes) {
		this.personajes = personajes;
	}

	@Override
	public void caminar(Point punto) {
		this.getPersonajes()
		    .stream()
		    .forEach(p -> p.caminar(punto));
		this.getUbicacion().movePointTo(punto.getX(), punto.getY());
    }

	public void agregarPersonaje(Personaje personaje) {
		this.getPersonajes().add(personaje);
	}
	
	public void removerPersonaje(Personaje personaje) {
		this.getPersonajes().remove(personaje);
	}

}
