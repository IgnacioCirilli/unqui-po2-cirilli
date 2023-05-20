package ar.edu.unq.po2.tp10State.ej1;

public class EstadoIndividual extends EstadoDeJuego {

	public EstadoIndividual(MaquinaDeVideojuegos maquina) {
		super(maquina);
	}

	@Override
	public String iniciarJuego() {
		this.getMaquina().setEstadoDeJuego(new EstadoInicial(this.getMaquina()));
		return "Modo de juego individual";
	}

}
