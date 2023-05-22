package ar.edu.unq.po2.tp10State.ej2;

public class EstadoPausado extends EstadoDeReproductor {

	public EstadoPausado(Reproductor reproductor) {
		super(reproductor);
	}

	@Override
	public void play(ISong song) {
		System.out.println("No se esta en modo de seleccion de canciones.");
	}

	@Override
	public void pause() {
		System.out.println("Se esta reproduciendo la cancion.");
		this.getReproductor().setEstadoDeReproductor(new EstadoReproduciendo(this.getReproductor()));
	}

	@Override
	public void stop() {
		System.out.println("No se esta reproduciendo una cancion.");
	}

}