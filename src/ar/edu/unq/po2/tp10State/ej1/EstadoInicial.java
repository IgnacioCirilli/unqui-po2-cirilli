package ar.edu.unq.po2.tp10State.ej1;

public class EstadoInicial extends EstadoDeJuego {

	public EstadoInicial(MaquinaDeVideojuegos maquina) {
		super(maquina);
	}

	@Override
	public String iniciarJuego() {
		
		String mensajeEsperado = "Ingresar fichas";
		
		if (this.getMaquina().getFichas() == 1) {
			this.getMaquina().setEstadoDeJuego(new EstadoIndividual(this.getMaquina()));
			mensajeEsperado = "Se esta iniciando el modo individual";
		} else if (this.getMaquina().getFichas() == 2) {
			this.getMaquina().setEstadoDeJuego(new EstadoCooperativo(this.getMaquina()));
			mensajeEsperado = "Se esta iniciando el modo coperativo";
		}
		
		return mensajeEsperado;
		
	}

}
