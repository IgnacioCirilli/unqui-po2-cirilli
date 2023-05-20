package ar.edu.unq.po2.tp10State.ej1;

public abstract class EstadoDeJuego {
	
	private MaquinaDeVideojuegos maquina;
	
	public EstadoDeJuego(MaquinaDeVideojuegos maquina) {
		this.setMaquina(maquina);
	}
	
	
	public MaquinaDeVideojuegos getMaquina() {
		return maquina;
	}


	public void setMaquina(MaquinaDeVideojuegos maquina) {
		this.maquina = maquina;
	}


	public abstract String iniciarJuego();
	
}
