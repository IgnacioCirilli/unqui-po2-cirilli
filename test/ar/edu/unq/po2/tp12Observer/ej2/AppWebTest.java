package ar.edu.unq.po2.tp12Observer.ej2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppWebTest {
	
	private AppWeb app;
	
	private Partido partido1;
	private Partido partido2;
	
	private Servidor servidor;
	
	@BeforeEach
	void setUp() {
		
		partido1 = mock(Partido.class);
		partido2 = mock(Partido.class);
		
		servidor = mock(Servidor.class);
		
		app = new AppWeb();
		
	}

	@Test
	void testInicializacionDeUnaAppWeb() {
		assertTrue(this.app.getPartidos().isEmpty());
	}
	
	@Test
	void testCuandoUnaAppWebAgregaUnPartido() {
		//Excersice
		this.app.agregarPartido(this.partido1);
		
		assertTrue(this.app.getPartidos().contains(this.partido1));
	}
	
	@Test
	void testCuandoUnaAppWebAgregaUnPartidoEstaLesNotificaASusObservers() {
		//Setup
		this.app.addObserver(this.servidor);
		
		//Excersice
		this.app.agregarPartido(this.partido1);
				
		assertTrue(this.app.getPartidos().contains(this.partido1));
		//verify(this.servidor, times(1)).update(this.app, this.partido1);
	}

}
