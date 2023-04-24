package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImpuestoTest {

	private Impuesto impuesto1;
	private Impuesto impuesto2;
	
	@BeforeEach
	public void setUp() {
		impuesto1 = new Impuesto(150d);
		impuesto2 = new Impuesto(1500d);
	}
	
	@Test
	public void verificarCreacionImpuesto() {
		assertEquals(impuesto1.registrarse(), 150d);
		assertEquals(impuesto2.registrarse(), 1500d);
	}
}