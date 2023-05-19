package ar.edu.unq.po2.tp9Composite.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivoTest {

	private Cultivo trigo;
	private Cultivo soja;
	
	@BeforeEach
	void setUp() {
		trigo = Cultivo.TRIGO;
		soja  = Cultivo.SOJA;
	}

	@Test
	void verificacionDeInicializacionDeCultivoTrigo() {
		float gananciaEsperada = 300;
		assertEquals(gananciaEsperada, this.trigo.getValorAnual());
	}
	
	@Test
	void verificacionDeInicializacionDeCultivoSoja() {
		float gananciaEsperada = 500;
		assertEquals(gananciaEsperada, this.soja.getValorAnual());
	}

}
