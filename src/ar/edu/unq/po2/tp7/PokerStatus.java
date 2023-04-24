package ar.edu.unq.po2.tp7;

import java.util.Arrays;
import java.util.List;

public class PokerStatus {

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		String resultado = "Nada";
		
		List<Integer> listaDeValores = Arrays.asList(obtenerValorDeCarta(carta1), 
													 obtenerValorDeCarta(carta2), 
													 obtenerValorDeCarta(carta3), 
												     obtenerValorDeCarta(carta4),
													 obtenerValorDeCarta(carta5));
		List<PaloDeCarta> listaDePalos = Arrays.asList(obtenerPaloDeCarta(carta1), 
													   obtenerPaloDeCarta(carta2), 
			      									   obtenerPaloDeCarta(carta3), 
			      									   obtenerPaloDeCarta(carta4),
			      									   obtenerPaloDeCarta(carta5));
		
		// Se deberia hacer con doble-dispatch ¿? 
		if (esPoker(listaDeValores)) {
			resultado = "Poker";
		} else 
			if (esColor(listaDePalos)) {
				resultado = "Color";
			} else 
				if (esTrio(listaDeValores)) {
					resultado = "Trio";
		}
		return resultado;
	}

	public PaloDeCarta obtenerPaloDeCarta(Carta carta) {
		return carta.getPalo();
	}

	public int obtenerValorDeCarta(Carta carta) {
		return carta.getValor();
	}
	
	public boolean esPoker(List<Integer> listaDeValores) {
		Integer primerValor = listaDeValores.get(0);
		Integer segundoValor = listaDeValores.get(1);
		
		return aparicionesDeValor(primerValor, listaDeValores) >= 4
				||
			   aparicionesDeValor(segundoValor, listaDeValores) >= 4;
	}
	
	public boolean esColor(List <PaloDeCarta> listaDePalos) {
		 return listaDePalos.isEmpty() || listaDePalos.stream()
			      .allMatch(listaDePalos.get(0)::equals);
	}
	
	public boolean esTrio(List <Integer> listaDeValores) {
		Integer primerValor = listaDeValores.get(0);
		Integer segundoValor = listaDeValores.get(1);
		Integer tercerValor = listaDeValores.get(2);
		
		return aparicionesDeValor(primerValor, listaDeValores) >= 3
				||
			   aparicionesDeValor(segundoValor, listaDeValores) >= 3
			    ||
			   aparicionesDeValor(tercerValor, listaDeValores) >= 3;
	}

	public int aparicionesDeValor(Integer valor, List<Integer> listaDeValores) {
		return listaDeValores.stream()
							 .filter(v -> v.equals(valor))
							 .toList()
							 .size();
	}
}