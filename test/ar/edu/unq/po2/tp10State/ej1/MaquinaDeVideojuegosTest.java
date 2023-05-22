package ar.edu.unq.po2.tp10State.ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaDeVideojuegosTest {
	
	private MaquinaDeVideojuegos maquina;

	@BeforeEach
	void setUp() {
		maquina = new MaquinaDeVideojuegos();
	}

	@Test
	void verificacionDeInicializacionDeUnaMaquinaDeVideojuegos() {
		assertEquals(0, this.maquina.getFichas());
	}
	
	@Test
	void verificacionDeModoDeJuegoDeUnaMaquinaRecienCreada() {
		String modoDeJuegoEsperado = "Ingresar fichas";
		
		assertEquals(modoDeJuegoEsperado, this.maquina.presionarBotonDeInicio());
	}
	
	@Test
	void verificacionDeModoDeJuegoDeUnaMaquinaCuandoTieneUnaFicha() {
		
		String modoDeJuegoEsperado = "Modo de juego individual";
		
		this.maquina.agregarFicha();
		
		this.maquina.presionarBotonDeInicio();
		
		assertEquals(modoDeJuegoEsperado, this.maquina.presionarBotonDeInicio());
		assertEquals(1, this.maquina.getFichas());
	}
	
	@Test
	void verificacionDeModoDeJuegoDeUnaMaquinaCuandoTieneDosFicha() {
		
		String modoDeJuegoEsperado = "Modo de juego cooperativo";
		
		this.maquina.agregarFicha();
		this.maquina.agregarFicha();
		
		this.maquina.presionarBotonDeInicio();
		
		assertEquals(modoDeJuegoEsperado, this.maquina.presionarBotonDeInicio());
		assertEquals(2, this.maquina.getFichas());
	}

}
