package ar.edu.unq.po2.tp10State.ej2;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReproductorTest {
	
	private Reproductor reproductor;
	
	private EstadoSeleccionDeCanciones estadoSeleccionDeCanciones;
	
	private ISong song;

	@BeforeEach
	void setUp() {
		
		estadoSeleccionDeCanciones = mock(EstadoSeleccionDeCanciones.class);
		song = mock(ISong.class);
		
		reproductor = new Reproductor(song);
	}

	@Test
	void testInicializacionDeReproductor() { 
		
		reproductor.setEstadoDeReproductor(estadoSeleccionDeCanciones);
		reproductor.play(song);
		
		verify(estadoSeleccionDeCanciones, times(1)).play(song);
	}
		
}
