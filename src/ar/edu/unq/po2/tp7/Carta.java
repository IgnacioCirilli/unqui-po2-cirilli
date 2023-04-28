package ar.edu.unq.po2.tp7;


public class Carta {
	
	private ValorDeCarta valor;
	private PaloDeCarta palo;
	
	public Carta(ValorDeCarta valor, PaloDeCarta palo) {
		this.setPalo(palo);
		this.setValor(valor);
	}

	public ValorDeCarta getValor() {
		return valor;
	}

	public PaloDeCarta getPalo() {
		return palo;
	}

	private void setValor(ValorDeCarta valor) {
		this.valor = valor;
	}

	private void setPalo(PaloDeCarta palo) {
		this.palo = palo;
	}
	
	private int obtenerValorDeCarta() {
		return this.getValor().getValorNumerico();
	}

	public boolean esMayorQue(Carta carta) { 
		return this.obtenerValorDeCarta() > carta.obtenerValorDeCarta();
	}

	public boolean tieneMismoPalo(Carta carta) {
		return this.getPalo() == carta.getPalo();
	}

	public boolean tieneMismoValorQue(Carta carta) {
		return this.getValor() == carta.getValor();
	}
}
