package ar.edu.unq.po2.tp10State.ej1;

public class MaquinaDeVideojuegos {
	
	private int fichas;
	private EstadoDeJuego estadoDeJuego;

	public MaquinaDeVideojuegos() {
		super();
		this.setFichas(0);
		this.setEstadoDeJuego(new EstadoInicial(this));
	}

	public int getFichas() {
		return fichas;
	}

	private void setFichas(int fichas) {
		this.fichas = fichas;
	}

	public EstadoDeJuego getEstadoDeJuego() {
		return estadoDeJuego;
	}

	// En este caso el set es público debido a que cada IEstadoDeJuego 
	// puede modificar el estado de juego interno de la maquina de videojuegos.
	public void setEstadoDeJuego(EstadoDeJuego estadoDeJuego) {
		this.estadoDeJuego = estadoDeJuego;
	}

	public String presionarBotonDeInicio() {
		return this.getEstadoDeJuego().iniciarJuego();
	}

	public void agregarFicha() {
		this.setFichas(this.getFichas() + 1);
	}
	
}
