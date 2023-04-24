package ar.edu.unq.po2.tp7;


public class Carta {
	
	private int valor;
	private PaloDeCarta palo;
	
	public Carta(int valor, PaloDeCarta palo) {
		this.setPalo(palo);
		this.setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	public PaloDeCarta getPalo() {
		return palo;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}

	private void setPalo(PaloDeCarta palo) {
		this.palo = palo;
	}

	public boolean esMayorQue(Carta carta) { 
		return (this.getValor() == 1 && carta.getValor() != 1) 
				|| this.getValor() > carta.getValor();
	}

	public boolean tieneMismoPalo(Carta carta) {
		return this.getPalo() == carta.getPalo();
	}
}
