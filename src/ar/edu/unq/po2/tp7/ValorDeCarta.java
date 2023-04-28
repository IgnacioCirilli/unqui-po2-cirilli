package ar.edu.unq.po2.tp7;

public enum ValorDeCarta {

	A(14),    DOS(2),   TRES(3),  CUATRO(4), 
	CINCO(5), SEIS(6),  SIETE(7), OCHO(8), 
	NUEVE(9), DIEZ(10), J(11),    Q(12), 
	K(13);
	
	private int valorNumerico;

	private ValorDeCarta(int valorNumerico) {
		this.setValorNumerico(valorNumerico);
	}

	public int getValorNumerico() {
		return valorNumerico;
	}

	private void setValorNumerico(int valorNumerico) {
		this.valorNumerico = valorNumerico;
	}

}
