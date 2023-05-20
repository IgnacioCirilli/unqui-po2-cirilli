package ar.edu.unq.po2.tp10Strategy;

public class RedDeComputadores {
	
	private IEncriptadorNaive strategy;

	public IEncriptadorNaive getStrategy() {
		return strategy;
	}

	public void setStrategy(IEncriptadorNaive encriptadorNaive) {
		this.strategy = encriptadorNaive;
	}
	
	public String encriptarMensaje(String mensaje) {
		return this.getStrategy().encriptar(mensaje);
	}
	
	public String desencriptarMensaje(String mensaje) {
		return this.getStrategy().desencriptar(mensaje);
	}
}
