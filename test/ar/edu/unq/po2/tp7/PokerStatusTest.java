package ar.edu.unq.po2.tp7;


import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	private PokerStatus pokerStatus;
	
	private Jugada jugada1;
	private Jugada jugada2;
	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private Carta carta6;
	private Carta carta7;
	private Carta carta8;
	private Carta carta9;
	private Carta carta10;
	
	// Setup
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus(); 
		
		carta1  = mock(Carta.class);
		carta2  = mock(Carta.class);
		carta3  = mock(Carta.class);
		carta4  = mock(Carta.class);
	    carta5  = mock(Carta.class);
	    carta6  = mock(Carta.class);
	    carta7  = mock(Carta.class);
	    carta8  = mock(Carta.class);
	    carta9  = mock(Carta.class);
	    carta10 = mock(Carta.class);
	    
	    jugada1 = mock(Jugada.class);
	    jugada2 = mock(Jugada.class);
		
	}
	
	@Test
	public void verificacionCuandoHayPoquer1() {
		// Exercise y Verify
		when(carta1.tieneMismoValorQue(carta1)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta2)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta3)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta4)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta5)).thenReturn(false);
		
		List<Carta> cartasDeJugada         = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		List<Carta> primerasCartasDeJugada = Arrays.asList(carta1, carta2);
		
		when(jugada1.getCartas()).thenReturn(cartasDeJugada);
		when(jugada1.obtenerPrimeras(2)).thenReturn(primerasCartasDeJugada);
		
		assertEquals("Poker", pokerStatus.verificar(jugada1));
	}
	
	@Test
	public void verificacionCuandoHayPoquer2() {
		// Exercise y Verify
		when(carta1.tieneMismoValorQue(carta1)).thenReturn(false);
		when(carta1.tieneMismoValorQue(carta2)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta3)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta4)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta5)).thenReturn(true);
		
		List<Carta> cartasDeJugada         = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		List<Carta> primerasCartasDeJugada = Arrays.asList(carta1, carta2);
		
		when(jugada1.getCartas()).thenReturn(cartasDeJugada);
		when(jugada1.obtenerPrimeras(2)).thenReturn(primerasCartasDeJugada);
		
		assertEquals("Poker", pokerStatus.verificar(jugada1));
	}
	
	@Test
	public void verificacionCuandoNoHayNada() {
		// Exercise y Verify
		when(carta1.getValor()).thenReturn(ValorDeCarta.A);
		when(carta2.getValor()).thenReturn(ValorDeCarta.DOS);
		when(carta3.getValor()).thenReturn(ValorDeCarta.J);
		when(carta4.getValor()).thenReturn(ValorDeCarta.K);
		when(carta5.getValor()).thenReturn(ValorDeCarta.A);
		
		when(carta1.getPalo()).thenReturn(PaloDeCarta.CORAZONES);
		when(carta2.getPalo()).thenReturn(PaloDeCarta.PICAS);
		when(carta3.getPalo()).thenReturn(PaloDeCarta.DIAMANTE);
		when(carta4.getPalo()).thenReturn(PaloDeCarta.DIAMANTE);
		when(carta5.getPalo()).thenReturn(PaloDeCarta.TREBOL);
		
		List<Carta> cartasDeJugada         = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		List<Carta> primerasCartasDeJugada = Arrays.asList(carta1, carta2);
		
		when(jugada1.getCartas()).thenReturn(cartasDeJugada);
		when(jugada1.obtenerPrimeras(2)).thenReturn(primerasCartasDeJugada);
		
		assertEquals(pokerStatus.verificar(jugada1), "Nada");
	}
	
	@Test
	public void verificacionCuandoHayColor() {
		// Exercise y Verify
		when(carta1.getPalo()).thenReturn(PaloDeCarta.DIAMANTE);
		when(carta2.getPalo()).thenReturn(PaloDeCarta.DIAMANTE);
		when(carta3.getPalo()).thenReturn(PaloDeCarta.DIAMANTE);
		when(carta4.getPalo()).thenReturn(PaloDeCarta.DIAMANTE);
		when(carta5.getPalo()).thenReturn(PaloDeCarta.DIAMANTE);
		
		when(carta1.tieneMismoPalo(carta1)).thenReturn(true);
		when(carta1.tieneMismoPalo(carta2)).thenReturn(true);
		when(carta1.tieneMismoPalo(carta3)).thenReturn(true);
		when(carta1.tieneMismoPalo(carta4)).thenReturn(true);
		when(carta1.tieneMismoPalo(carta5)).thenReturn(true);
		
		List<Carta> cartasDeJugada = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		
		when(jugada1.getCartas()).thenReturn(cartasDeJugada);
		when(jugada1.getCarta(1)).thenReturn(carta1);
		
		assertEquals("Color", pokerStatus.verificar(jugada1));
	}
	
	@Test
	public void verificacionCuandoHayTrio1() {
		// Exercise y Verify		
		when(carta1.tieneMismoValorQue(carta1)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta2)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta3)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta4)).thenReturn(false);
		when(carta1.tieneMismoValorQue(carta5)).thenReturn(false);
		
		List<Carta> cartasDeJugada         = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		List<Carta> primerasCartasDeJugada = Arrays.asList(carta1, carta2, carta3);
		
		when(jugada1.getCartas()).thenReturn(cartasDeJugada);
		when(jugada1.obtenerPrimeras(3)).thenReturn(primerasCartasDeJugada);
		
		assertEquals("Trio", pokerStatus.verificar(jugada1));
	}
	
	@Test
	public void verificacionCuandoHayTrio2() {
		// Exercise y Verify
		when(carta1.tieneMismoValorQue(carta1)).thenReturn(false);
		when(carta1.tieneMismoValorQue(carta2)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta3)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta4)).thenReturn(false);
		when(carta1.tieneMismoValorQue(carta5)).thenReturn(true);
		
		List<Carta> cartasDeJugada         = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		List<Carta> primerasCartasDeJugada = Arrays.asList(carta1, carta2, carta3);
		
		when(jugada1.getCartas()).thenReturn(cartasDeJugada);
		when(jugada1.obtenerPrimeras(3)).thenReturn(primerasCartasDeJugada);
		
		assertEquals("Trio", pokerStatus.verificar(jugada1));
	}
	
	@Test
	public void verificacionCuandoHayTrio3() {
		// Exercise y Verify
		when(carta1.tieneMismoValorQue(carta1)).thenReturn(false);
		when(carta1.tieneMismoValorQue(carta2)).thenReturn(false);
		when(carta1.tieneMismoValorQue(carta3)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta4)).thenReturn(true);
		when(carta1.tieneMismoValorQue(carta5)).thenReturn(true);
		
		List<Carta> cartasDeJugada         = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		List<Carta> primerasCartasDeJugada = Arrays.asList(carta1, carta2, carta3);
		
		when(jugada1.getCartas()).thenReturn(cartasDeJugada);
		when(jugada1.obtenerPrimeras(3)).thenReturn(primerasCartasDeJugada);
		
		assertEquals("Trio", pokerStatus.verificar(jugada1));
	}
	
//	@Test
//	void verificacionDeGanadorDeUnaJugada() {
//		
//		//Mockeando las cartas de jugada1
//		when(carta1.getValor()).thenReturn(4);
//		when(carta2.getValor()).thenReturn(1);
//		when(carta3.getValor()).thenReturn(1);
//		when(carta4.getValor()).thenReturn(1);
//		when(carta5.getValor()).thenReturn(1);
//		
//		//Mockeando las cartas de jugada2
//		when(carta6.getValor()).thenReturn(4);
//		when(carta7.getValor()).thenReturn(13);
//		when(carta8.getValor()).thenReturn(10);
//		when(carta9.getValor()).thenReturn(5);
//		when(carta10.getValor()).thenReturn(13);
//		
//		//Assert
//		assertEquals(jugada1.ganadorEntre(jugada2), jugada1);
//		
//	}
}
