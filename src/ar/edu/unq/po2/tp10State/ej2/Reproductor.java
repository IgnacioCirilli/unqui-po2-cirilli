package ar.edu.unq.po2.tp10State.ej2;

public class Reproductor {
	
	private EstadoDeReproductor estadoActual;
	private ISong song;
	
	public Reproductor(ISong song) {
		super();
		this.setEstadoDeReproductor(new EstadoSeleccionDeCanciones(this));
	}

	public EstadoDeReproductor getEstadoDeReproductor() {
		return this.estadoActual;
	}
	
	public void setEstadoDeReproductor(EstadoDeReproductor estadoDeReproductor) {
		this.estadoActual = estadoDeReproductor;
	}
	
	public void play(ISong song) {
		this.getEstadoDeReproductor().play(song);
	}
	
	public void pause() {
		this.getEstadoDeReproductor().pause();
	} 
	
	public void stop() {
		this.getEstadoDeReproductor().stop();
	}
}
