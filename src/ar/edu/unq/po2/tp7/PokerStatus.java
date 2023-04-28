package ar.edu.unq.po2.tp7;

import java.util.List;

public class PokerStatus {

	public String verificar(Jugada jugada) {
		String resultado = "Nada";
		
		// Se deberia hacer con doble-dispatch ¿? 
		if (esPoker(jugada)) {
			resultado = "Poker";
		} else 
			if (esColor(jugada)) {
				resultado = "Color";
			} else 
				if (esTrio(jugada)) {
					resultado = "Trio";
		}
		return resultado;
	}
	
	public boolean esPoker(Jugada jugada) {
		
		return jugada.obtenerPrimeras(2).stream().anyMatch(c -> this.hayPoker(c, jugada));
		
	}
	
	public boolean hayPoker(Carta carta, Jugada jugada) {
		
		return jugada.getCartas().stream().filter(c -> c.tieneMismoValorQue(carta)).count() == 4;
		
	}
	
	public boolean esColor(Jugada jugada) {
		
		 return jugada.getCartas().stream().allMatch(c -> c.tieneMismoPalo(jugada.getCarta(1)));
	
	}
	
	public boolean esTrio(Jugada jugada) {
		
		return jugada.obtenerPrimeras(3).stream().anyMatch(c -> this.hayTrio(c, jugada));
		
	}

	public boolean hayTrio(Carta carta, Jugada jugada) {

		return jugada.getCartas().stream().filter(c -> c.tieneMismoValorQue(carta)).count() == 3;
		
	}

	public int aparicionesDeValor(Integer valor, List<Integer> listaDeValores) {
		return listaDeValores.stream()
							 .filter(v -> v.equals(valor))
							 .toList()
							 .size();
	}
}