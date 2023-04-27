package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaTest {

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
		carta1    = mock(Carta.class);
		carta2    = mock(Carta.class);
		carta3    = mock(Carta.class);
		carta4    = mock(Carta.class);
	    carta5    = mock(Carta.class);
	    carta6    = mock(Carta.class);
	    carta7    = mock(Carta.class);
	    carta8    = mock(Carta.class);
	    carta9    = mock(Carta.class);
	    carta10   = mock(Carta.class);
	    
	    jugada1   = new Jugada();
	    jugada1.agregarCarta(carta1);
	    jugada1.agregarCarta(carta2);
	    jugada1.agregarCarta(carta3);
	    jugada1.agregarCarta(carta4);
	    jugada1.agregarCarta(carta5);
	    
	    jugada2   = new Jugada();
	    jugada2.agregarCarta(carta6);
	    jugada2.agregarCarta(carta7);
	    jugada2.agregarCarta(carta8);
	    jugada2.agregarCarta(carta9);
	    jugada2.agregarCarta(carta10);
		
	}

	@Test
	void verificacionDeInicializacionDeUnaJugada() {
		
		//Mockeando
		when(carta1.getValor()).thenReturn(4);
		when(carta2.getValor()).thenReturn(10);
		when(carta3.getValor()).thenReturn(13);
		when(carta4.getValor()).thenReturn(5);
		when(carta5.getValor()).thenReturn(1);
		
		//Assert
		assertEquals(jugada1.getCarta(1).getValor(), carta1.getValor());
		assertEquals(jugada1.getCarta(2).getValor(), carta2.getValor());
		assertEquals(jugada1.getCarta(3).getValor(), carta3.getValor());
		assertEquals(jugada1.getCarta(4).getValor(), carta4.getValor());
		assertEquals(jugada1.getCarta(5).getValor(), carta5.getValor());
	}

}
