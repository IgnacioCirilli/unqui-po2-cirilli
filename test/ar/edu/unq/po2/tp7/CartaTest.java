package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {
	
	private Carta cartaAD;
	private Carta carta5P;
	private Carta cartaAP;

	@BeforeEach
	public void setUp() {
		cartaAD = new Carta(1, PaloDeCarta.Diamante);
		carta5P = new Carta(5, PaloDeCarta.Picas);
		cartaAP = new Carta(1, PaloDeCarta.Picas);
	}

	@Test
	public void verificacionInicializacionDeCarta() {
		assertEquals(cartaAD.getPalo(), PaloDeCarta.Diamante);
		assertEquals(cartaAD.getValor(), 1);
	}
	
	@Test
	public void verificacionCartaNoEsMayorAOtra1() {
		assertTrue(carta5P.esMayorQue(cartaAD));
	}
	
	@Test
	public void verificacionCartaNoEsMayorAOtra2() {
		assertFalse(cartaAD.esMayorQue(cartaAP));
	}
	
	@Test
	public void verificacionCartaEsMayorAOtra() {
		assertTrue(cartaAD.esMayorQue(carta5P));
	}
	
	@Test
	public void verificarQueNoSonMismoPalo() {
		assertFalse(cartaAD.tieneMismoPalo(carta5P));
	}
	
	@Test
	public void verificarQueSonMismoPalo() {
		assertTrue(cartaAP.tieneMismoPalo(carta5P));
	}
}
