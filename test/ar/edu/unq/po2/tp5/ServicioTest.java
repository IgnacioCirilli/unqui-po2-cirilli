package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicioTest {

	private Servicio servicio1;
	private Servicio servicio2;
	
	@BeforeEach
	public void setUp() {
		servicio1 = new Servicio(10d, 3);
		servicio2 = new Servicio(1d, 10);
	}
	
	@Test
	public void verificarCreacionDeServicio() {
		assertEquals(30d, servicio1.registrarse());
		assertEquals(10d, servicio2.registrarse());
	}
}
