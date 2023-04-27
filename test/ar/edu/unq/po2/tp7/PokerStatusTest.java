package ar.edu.unq.po2.tp7;


import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

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
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(1);
		when(carta3.getValor()).thenReturn(1);
		when(carta4.getValor()).thenReturn(1);
		when(carta5.getValor()).thenReturn(2);
		
		when(jugada1.getCarta(1)).thenReturn(carta1);
		when(jugada1.getCarta(2)).thenReturn(carta2);
		when(jugada1.getCarta(3)).thenReturn(carta3);
		when(jugada1.getCarta(4)).thenReturn(carta4);
		when(jugada1.getCarta(5)).thenReturn(carta5);
		
		assertEquals("Poker", pokerStatus.verificar(jugada1));
	}
	
//	@Test
//	public void verificacionCuandoHayPoquer2() {
//		// Exercise y Verify
//		when(carta1.getValor()).thenReturn(2);
//		when(carta2.getValor()).thenReturn(1);
//		when(carta3.getValor()).thenReturn(1);
//		when(carta4.getValor()).thenReturn(1);
//		when(carta5.getValor()).thenReturn(1);
//		
//		when(carta1.getPalo()).thenReturn(PaloDeCarta.Picas);
//		when(carta2.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		when(carta3.getPalo()).thenReturn(PaloDeCarta.Corazones);
//		when(carta4.getPalo()).thenReturn(PaloDeCarta.Picas);
//		when(carta5.getPalo()).thenReturn(PaloDeCarta.Trebol);
//		
//		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Poker");
//	}
//	
//	@Test
//	public void verificacionCuandoNoHayNada() {
//		// Exercise y Verify
//		when(carta1.getValor()).thenReturn(1);
//		when(carta2.getValor()).thenReturn(2);
//		when(carta3.getValor()).thenReturn(11);
//		when(carta4.getValor()).thenReturn(13);
//		when(carta5.getValor()).thenReturn(1);
//		
//		when(carta1.getPalo()).thenReturn(PaloDeCarta.Corazones);
//		when(carta2.getPalo()).thenReturn(PaloDeCarta.Picas);
//		when(carta3.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		when(carta4.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		when(carta5.getPalo()).thenReturn(PaloDeCarta.Picas);
//		
//		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Nada");
//	}
//	
//	@Test
//	public void verificacionCuandoHayColor() {
//		// Exercise y Verify
//		when(carta1.getValor()).thenReturn(1);
//		when(carta2.getValor()).thenReturn(13);
//		when(carta3.getValor()).thenReturn(12);
//		when(carta4.getValor()).thenReturn(11);
//		when(carta5.getValor()).thenReturn(10);
//		
//		when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		when(carta2.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		when(carta3.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		when(carta4.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		when(carta5.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		
//		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Color");
//	}
//	
//	@Test
//	public void verificacionCuandoHayTrio1() {
//		// Exercise y Verify
//		when(carta1.getValor()).thenReturn(1);
//		when(carta2.getValor()).thenReturn(1);
//		when(carta3.getValor()).thenReturn(1);
//		when(carta4.getValor()).thenReturn(11);
//		when(carta5.getValor()).thenReturn(10);
//		
//		when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		when(carta2.getPalo()).thenReturn(PaloDeCarta.Picas);
//		when(carta3.getPalo()).thenReturn(PaloDeCarta.Corazones);
//		when(carta4.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		when(carta5.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		
//		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Trio");
//	}
//	
//	@Test
//	public void verificacionCuandoHayTrio2() {
//		// Exercise y Verify
//		when(carta1.getValor()).thenReturn(10);
//		when(carta2.getValor()).thenReturn(1);
//		when(carta3.getValor()).thenReturn(1);
//		when(carta4.getValor()).thenReturn(1);
//		when(carta5.getValor()).thenReturn(2);
//		
//		when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		when(carta2.getPalo()).thenReturn(PaloDeCarta.Diamante);
//		when(carta3.getPalo()).thenReturn(PaloDeCarta.Corazones);
//		when(carta4.getPalo()).thenReturn(PaloDeCarta.Picas);
//		when(carta5.getPalo()).thenReturn(PaloDeCarta.Picas);
//		
//		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Trio");
//	}
	
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
