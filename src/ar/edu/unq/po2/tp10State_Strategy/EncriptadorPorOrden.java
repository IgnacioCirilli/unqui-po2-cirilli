package ar.edu.unq.po2.tp10State_Strategy;

public class EncriptadorPorOrden implements IEncriptadorNaive {

	@Override
	public String encriptar(String mensajeSinEncriptar) {
		return new StringBuilder(mensajeSinEncriptar).reverse().toString();
	}

	@Override
	public String desencriptar(String mensajeSinDesencriptar) {
		return this.encriptar(mensajeSinDesencriptar);
	}
}
