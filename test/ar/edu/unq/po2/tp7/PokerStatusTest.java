package ar.edu.unq.po2.tp7;


import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	private PokerStatus pokerStatus;
	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	// Setup
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus(); 
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
	    carta5 = mock(Carta.class);
		
	}

	@Test
	public void verificacionCuandoNoHayPoquer1() {
		// Exercise y Verify
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(13);
		when(carta3.getValor()).thenReturn(12);
		when(carta4.getValor()).thenReturn(11);
		when(carta5.getValor()).thenReturn(1);
		
		when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta2.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta3.getPalo()).thenReturn(PaloDeCarta.Corazones);
		when(carta4.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta5.getPalo()).thenReturn(PaloDeCarta.Corazones);
		
		
		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Nada");
	}
	
	@Test
	public void verificacionCuandoNoHayPoquer2() {
		// Exercise y Verify
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(1);
		when(carta3.getValor()).thenReturn(2);
		when(carta4.getValor()).thenReturn(11);
		when(carta5.getValor()).thenReturn(13);
		
		when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta2.getPalo()).thenReturn(PaloDeCarta.Picas);
		when(carta3.getPalo()).thenReturn(PaloDeCarta.Picas);
		when(carta4.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta5.getPalo()).thenReturn(PaloDeCarta.Diamante);
		
		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Nada");
	}
	
	@Test
	public void verificacionCuandoHayPoquer1() {
		// Exercise y Verify
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(1);
		when(carta3.getValor()).thenReturn(1);
		when(carta4.getValor()).thenReturn(1);
		when(carta5.getValor()).thenReturn(2);
		
		when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta2.getPalo()).thenReturn(PaloDeCarta.Picas);
		when(carta3.getPalo()).thenReturn(PaloDeCarta.Corazones);
		when(carta4.getPalo()).thenReturn(PaloDeCarta.Trebol);
		when(carta5.getPalo()).thenReturn(PaloDeCarta.Picas);
		
		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Poker");
	}
	
	@Test
	public void verificacionCuandoHayPoquer2() {
		// Exercise y Verify
		when(carta1.getValor()).thenReturn(2);
		when(carta2.getValor()).thenReturn(1);
		when(carta3.getValor()).thenReturn(1);
		when(carta4.getValor()).thenReturn(1);
		when(carta5.getValor()).thenReturn(1);
		
		when(carta1.getPalo()).thenReturn(PaloDeCarta.Picas);
		when(carta2.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta3.getPalo()).thenReturn(PaloDeCarta.Corazones);
		when(carta4.getPalo()).thenReturn(PaloDeCarta.Picas);
		when(carta5.getPalo()).thenReturn(PaloDeCarta.Trebol);
		
		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Poker");
	}
	
	@Test
	public void verificacionCuandoNoHayNada() {
		// Exercise y Verify
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(2);
		when(carta3.getValor()).thenReturn(11);
		when(carta4.getValor()).thenReturn(13);
		when(carta5.getValor()).thenReturn(1);
		
		when(carta1.getPalo()).thenReturn(PaloDeCarta.Corazones);
		when(carta2.getPalo()).thenReturn(PaloDeCarta.Picas);
		when(carta3.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta4.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta5.getPalo()).thenReturn(PaloDeCarta.Picas);
		
		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Nada");
	}
	
	@Test
	public void verificacionCuandoHayColor() {
		// Exercise y Verify
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(13);
		when(carta3.getValor()).thenReturn(12);
		when(carta4.getValor()).thenReturn(11);
		when(carta5.getValor()).thenReturn(10);
		
		when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta2.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta3.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta4.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta5.getPalo()).thenReturn(PaloDeCarta.Diamante);
		
		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Color");
	}
	
	@Test
	public void verificacionCuandoHayTrio1() {
		// Exercise y Verify
		when(carta1.getValor()).thenReturn(1);
		when(carta2.getValor()).thenReturn(1);
		when(carta3.getValor()).thenReturn(1);
		when(carta4.getValor()).thenReturn(11);
		when(carta5.getValor()).thenReturn(10);
		
		when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta2.getPalo()).thenReturn(PaloDeCarta.Picas);
		when(carta3.getPalo()).thenReturn(PaloDeCarta.Corazones);
		when(carta4.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta5.getPalo()).thenReturn(PaloDeCarta.Diamante);
		
		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Trio");
	}
	
	@Test
	public void verificacionCuandoHayTrio2() {
		// Exercise y Verify
		when(carta1.getValor()).thenReturn(10);
		when(carta2.getValor()).thenReturn(1);
		when(carta3.getValor()).thenReturn(1);
		when(carta4.getValor()).thenReturn(1);
		when(carta5.getValor()).thenReturn(2);
		
		when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta2.getPalo()).thenReturn(PaloDeCarta.Diamante);
		when(carta3.getPalo()).thenReturn(PaloDeCarta.Corazones);
		when(carta4.getPalo()).thenReturn(PaloDeCarta.Picas);
		when(carta5.getPalo()).thenReturn(PaloDeCarta.Picas);
		
		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), "Trio");
	}
}
