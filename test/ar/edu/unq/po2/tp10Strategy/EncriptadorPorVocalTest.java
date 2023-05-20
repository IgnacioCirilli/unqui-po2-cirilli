package ar.edu.unq.po2.tp10Strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp10Strategy.EncriptadorPorVocal;

class EncriptadorPorVocalTest {

	private EncriptadorPorVocal encriptador;
	
	@BeforeEach
	void setUp() {
		encriptador = new EncriptadorPorVocal();
	}

	@Test
	void verificacionDeEncriptacionDeMensaje() {
		
		String mensajeSinEncriptar = "Hola, ¿como estas?";
		String mensajeEncriptadoEsperado = "hule, ¿cumu istes?";
		
		String mensajeEncriptadoObtenido = encriptador.encriptar(mensajeSinEncriptar);
		
		assertEquals(mensajeEncriptadoEsperado, mensajeEncriptadoObtenido);
	}

	@Test
	void verificacionDeDesencriptacionDeMensaje() {
		
		String mensajeSinDesencriptar = "Hule, ¿cumu istes?";
		String mensajeDesencriptadoEsperado  = "hola, ¿como estas?";
		
		String mensajeDesencriptadoObtenido = encriptador.desencriptar(mensajeSinDesencriptar);
		
		assertEquals(mensajeDesencriptadoEsperado, mensajeDesencriptadoObtenido);
	}
}