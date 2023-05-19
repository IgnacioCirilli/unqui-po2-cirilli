package ar.edu.unq.po2.tp10State_Strategy;

public class RedDeComputadores {
	
	private IEncriptadorNaive strategy;

	public IEncriptadorNaive getStrategy() {
		return strategy;
	}

	public void setStrategy(IEncriptadorNaive strategy) {
		this.strategy = strategy;
	}
	
	public String encriptarMensaje(String mensaje) {
		return this.getStrategy().encriptar(mensaje);
	}
	
	public String desencriptarMensaje(String mensaje) {
		return this.getStrategy().desencriptar(mensaje);
	}
}
