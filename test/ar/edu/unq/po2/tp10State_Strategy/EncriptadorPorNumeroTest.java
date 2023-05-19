package ar.edu.unq.po2.tp10State_Strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorPorNumeroTest {

	private EncriptadorPorNumero encriptador;
	
	@BeforeEach
	void setUp() {
		encriptador = new EncriptadorPorNumero();
	}

	@Test
	void verificacionDeEncriptacionDeMensaje() {
		
		String mensajeSinEncriptar = "hola como estas";
		String mensajeEncriptadoEsperado = "8,15,12,1,0,3,15,13,15,0,5,19,20,1,19";
		
		String mensajeEncriptadoObtenido = encriptador.encriptar(mensajeSinEncriptar);
		
		assertEquals(mensajeEncriptadoEsperado, mensajeEncriptadoObtenido);
	}

	@Test
	void verificacionDeDesencriptacionDeMensaje() {
		
		String mensajeSinDesencriptar = "8,15,12,1,0,3,15,13,15,0,5,19,20,1,19";
		String mensajeDesencriptadoEsperado  = "hola como estas";
		
		String mensajeDesencriptadoObtenido = encriptador.desencriptar(mensajeSinDesencriptar);
		
		assertEquals(mensajeDesencriptadoEsperado, mensajeDesencriptadoObtenido);
	}
}
