package ar.edu.unq.po2.tp8.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeporteTest {
	
	private Deporte deporteRunning;
	private Deporte deporteFutbol;
	private Deporte deporteBasket;
	private Deporte deporteTennis;
	private Deporte deporteJabalina;

	@BeforeEach
	public void setUp() {
		deporteRunning = Deporte.RUNNING;
		deporteFutbol = Deporte.FUTBOL;
		deporteBasket = Deporte.BASKET;
		deporteTennis = Deporte.TENNIS;
		deporteJabalina = Deporte.JABALINA;
	}

	@Test
	public void verificacionInicializacionDeporteRunning() {
		int complejidadEsperada = 1;
		
		assertEquals(complejidadEsperada, deporteRunning.getNivelDeComplejidad());
	}

	@Test
	public void verificacionInicializacionDeporteFutbol() {
		int complejidadEsperada = 2;
		
		assertEquals(complejidadEsperada, deporteFutbol.getNivelDeComplejidad());
	}

	@Test
	public void verificacionInicializacionDeporteBasket() {
		int complejidadEsperada = 2;
		
		assertEquals(complejidadEsperada, deporteBasket.getNivelDeComplejidad());
	}
	
	@Test
	public void verificacionInicializacionDeporteTennis() {
		int complejidadEsperada = 3;
		
		assertEquals(complejidadEsperada, deporteTennis.getNivelDeComplejidad());
	}
	
	@Test
	public void verificacionInicializacionDeporteJabalina() {
		int complejidadEsperada = 4;
		
		assertEquals(complejidadEsperada, deporteJabalina.getNivelDeComplejidad());
	}
}
