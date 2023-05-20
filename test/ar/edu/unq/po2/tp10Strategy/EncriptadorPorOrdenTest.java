package ar.edu.unq.po2.tp10Strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp10Strategy.EncriptadorPorOrden;

class EncriptadorPorOrdenTest {
	
	private EncriptadorPorOrden encriptador;

	@BeforeEach
	void setUp() {
		encriptador = new EncriptadorPorOrden();
	}

	@Test
	void verificacionDeEncriptacionDeMensaje() {
		
		String mensajeSinEncriptar = "Hola, ¿como estas?";
		String mensajeEncriptadoEsperado = "?satse omoc¿ ,aloH";
		
		String mensajeEncriptadoObtenido = encriptador.encriptar(mensajeSinEncriptar);
		
		assertEquals(mensajeEncriptadoEsperado, mensajeEncriptadoObtenido);
	}

	@Test
	void verificacionDeDesencriptacionDeMensaje() {
		
		String mensajeSinDesencriptar = "?satse omoc¿ ,aloH";
		String mensajeDesencriptadoEsperado = "Hola, ¿como estas?";
		
		String mensajeDesencriptadoObtenido = encriptador.encriptar(mensajeSinDesencriptar);
		
		assertEquals(mensajeDesencriptadoEsperado, mensajeDesencriptadoObtenido);
	}
}
