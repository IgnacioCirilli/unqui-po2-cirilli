package ar.edu.unq.po2.tp4.ej1y2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ej1y2.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 15d, false, 50d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.5), leche.getPrecio());
	}
}
