package ar.edu.unq.po2.tp12Observer.ej2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServidorTest {
	
	private Servidor servidor;
	private Partido partido;
	
	private AppWeb appWeb;
	
	@BeforeEach
	void setUp() {
		
		appWeb  = mock(AppWeb.class);
		partido = mock(Partido.class); 
		
		servidor = new Servidor(appWeb);
		
	}

	@Test
	void testInicializacionDeUnServidor() {		
		assertEquals(appWeb, this.servidor.getWeb());
		assertTrue(this.servidor.getDeportesDeInteres().isEmpty());
		verify(this.appWeb, times(1)).addObserver(this.servidor);
	}
	
	@Test
	void testCuandoUnServidorAgregaOtroDeporteDeInteres() {
		//Exercise
		this.servidor.agregarDeporteDeInteres(TipoDeDeporte.TENIS);
		
		assertTrue(this.servidor.getDeportesDeInteres().contains(TipoDeDeporte.TENIS));
		assertEquals(1, this.servidor.getDeportesDeInteres().size());
	}
	
	@Test
	void testCuandoUnServidorEliminaUnDeporteDeInteres() {
		//Setup
		this.servidor.agregarDeporteDeInteres(TipoDeDeporte.TENIS);
		
		//Exercise
		this.servidor.eliminarDeporteDeInteres(TipoDeDeporte.TENIS);
		
		assertFalse(this.servidor.getDeportesDeInteres().contains(TipoDeDeporte.TENIS));
		assertTrue(this.servidor.getDeportesDeInteres().isEmpty());
	}
	
	@Test
	void testUnServidorRecibeUnPartidoQueNoEsDeSuInteres() {
		//setup
		this.servidor.agregarDeporteDeInteres(TipoDeDeporte.FUTBOL);
		
		//Mockeando el partido
		when(partido.getTipoDeDeporte()).thenReturn(TipoDeDeporte.TENIS);
		
		//Exercise
		this.servidor.update(appWeb, partido);
		
		assertFalse(this.servidor.verificarQueElPartidoEsDeInteres(this.partido));
	}
	
	@Test
	void testUnServidorRecibeUnPartidoQueEsDeSuInteres() {
		//setup
		this.servidor.agregarDeporteDeInteres(TipoDeDeporte.FUTBOL);
				
		//Mockeando el partido
		when(partido.getTipoDeDeporte()).thenReturn(TipoDeDeporte.FUTBOL);
		
		//Exercise
		this.servidor.update(appWeb, partido);
		
		assertTrue(this.servidor.verificarQueElPartidoEsDeInteres(this.partido));
	}

}
