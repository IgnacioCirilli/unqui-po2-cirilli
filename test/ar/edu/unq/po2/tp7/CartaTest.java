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
		cartaAD = new Carta(ValorDeCarta.A, PaloDeCarta.DIAMANTE);
		carta5P = new Carta(ValorDeCarta.CINCO, PaloDeCarta.PICAS);
		cartaAP = new Carta(ValorDeCarta.A, PaloDeCarta.PICAS);
	}

	@Test
	public void verificacionInicializacionDeCarta() {
		assertEquals(cartaAD.getPalo(), PaloDeCarta.DIAMANTE);
		assertEquals(cartaAD.getValor(), ValorDeCarta.A);

	}
	
	@Test
	public void verificacionCartaNoEsMayorAOtra1() {
		assertFalse(carta5P.esMayorQue(cartaAD));
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
