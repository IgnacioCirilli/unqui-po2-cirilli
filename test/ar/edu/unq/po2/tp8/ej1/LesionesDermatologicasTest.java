package ar.edu.unq.po2.tp8.ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LesionesDermatologicasTest {
	
	private LesionDermatologica lesionDermatologicaRojo;
	private LesionDermatologica lesionDermatologicaGris;
	private LesionDermatologica lesionDermatologicaAmarillo;
	private LesionDermatologica lesionDermatologicaMiel;
	
	@BeforeEach
	public void setUp() {
		lesionDermatologicaRojo = LesionDermatologica.ROJO;
		lesionDermatologicaGris = LesionDermatologica.GRIS;
		lesionDermatologicaAmarillo = LesionDermatologica.AMARILLO;
		lesionDermatologicaMiel = LesionDermatologica.MIEL;
	}

	@Test
	public void verificacionInicializacionLesionDermatologicaRojo() {
		
		String descripcionEsperada = "Es una quemadura de tercer grado";
		int nivelDeRiesgoEsperado  = 3;
		String siguienteColorDeMaduracionEsperado = "Gris";
		
		assertEquals(descripcionEsperada, lesionDermatologicaRojo.getDescripcion());
		assertEquals(nivelDeRiesgoEsperado, lesionDermatologicaRojo.getNivelDeRiesgo());
		assertEquals(siguienteColorDeMaduracionEsperado, lesionDermatologicaRojo.getSiguienteColorDeMaduracion());
	}
	
	@Test
	public void verificacionInicializacionLesionDermatologicaGris() {
		
		String descripcionEsperada = "Es una quemadura de segundo grado";
		int nivelDeRiesgoEsperado  = 2;
		String siguienteColorDeMaduracionEsperado = "Amarillo";
		
		assertEquals(descripcionEsperada, lesionDermatologicaGris.getDescripcion());
		assertEquals(nivelDeRiesgoEsperado, lesionDermatologicaGris.getNivelDeRiesgo());
		assertEquals(siguienteColorDeMaduracionEsperado, lesionDermatologicaGris.getSiguienteColorDeMaduracion());
	}
	
	@Test
	public void verificacionInicializacionLesionDermatologicaAmarillo() {
		
		String descripcionEsperada = "Es una quemadura de primer grado";
		int nivelDeRiesgoEsperado  = 1;
		String siguienteColorDeMaduracionEsperado = "Miel";
		
		assertEquals(descripcionEsperada, lesionDermatologicaAmarillo.getDescripcion());
		assertEquals(nivelDeRiesgoEsperado, lesionDermatologicaAmarillo.getNivelDeRiesgo());
		assertEquals(siguienteColorDeMaduracionEsperado, lesionDermatologicaAmarillo.getSiguienteColorDeMaduracion());
	}
	
	@Test
	public void verificacionInicializacionLesionDermatologicaMiel() {
		
		String descripcionEsperada = "Es un moreton";
		int nivelDeRiesgoEsperado  = 0;
		String siguienteColorDeMaduracionEsperado = "Rojo";
		
		assertEquals(descripcionEsperada, lesionDermatologicaMiel.getDescripcion());
		assertEquals(nivelDeRiesgoEsperado, lesionDermatologicaMiel.getNivelDeRiesgo());
		assertEquals(siguienteColorDeMaduracionEsperado, lesionDermatologicaMiel.getSiguienteColorDeMaduracion());
	}
}
