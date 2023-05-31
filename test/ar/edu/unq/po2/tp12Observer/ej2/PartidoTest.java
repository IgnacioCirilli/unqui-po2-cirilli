package ar.edu.unq.po2.tp12Observer.ej2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartidoTest {
	
	private Partido partido;
	
	@BeforeEach
	void setUp() {
		
		partido = new Partido("3-1", Arrays.asList("Torres", "Butti", "Cano"), TipoDeDeporte.FUTBOL);
		
	}

	@Test
	void testInicializacionDeUnPartido() {
		//Setup
		List<String> contrincantesEsperados =  Arrays.asList("Torres", "Butti", "Cano");
		
		assertEquals("3-1", this.partido.getResultado());
		assertEquals(contrincantesEsperados, this.partido.getContrincantes());
		assertEquals(TipoDeDeporte.FUTBOL, this.partido.getTipoDeDeporte());
	}

}
