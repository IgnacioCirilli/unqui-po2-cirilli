package ar.edu.unq.po2.tp10State.ej2;

public class EstadoReproduciendo extends EstadoDeReproductor {

	public EstadoReproduciendo(Reproductor reproductor) {
		super(reproductor);
	}

	@Override
	public void play(ISong song) {
		System.out.println("Ya se esta reproduciendo una cancion.");
	}

	@Override
	public void pause() {
		System.out.println("Se ha pausado la cancion.");
		this.getReproductor().setEstadoDeReproductor(new EstadoPausado(this.getReproductor()));
	}

	@Override
	public void stop() {
		System.out.println("La cancion se ha pausado.");
	}

}
