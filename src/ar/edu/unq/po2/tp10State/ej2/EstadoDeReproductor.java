package ar.edu.unq.po2.tp10State.ej2;

public abstract class EstadoDeReproductor {
	
	private Reproductor reproductor;
	
	public EstadoDeReproductor(Reproductor reproductor) {
		super();
		this.setReproductor(reproductor);
	}
		
	public Reproductor getReproductor() {
		return reproductor;
	}
	
	private void setReproductor(Reproductor reproductor) {
		this.reproductor = reproductor;
	}

	public abstract void play(ISong song);
	public abstract void pause();
	public abstract void stop();
	
}
