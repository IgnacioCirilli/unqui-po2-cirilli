package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaTest {

	private Factura factura1;
	private Factura factura2;
	
	@BeforeEach
	public void setUp() {
		factura1 = new Factura(1250d, "Impuesto a las Ganancias");
		factura2 = new Factura(120d, "Servicio de cajas");
	}
	
	@Test
	public void verificarCreacionFactura() {
		assertEquals(factura1.getConcepto(), "Impuesto a las Ganancias");
		assertEquals(factura2.getConcepto(), "Servicio de cajas");
		
		assertEquals(factura1.getMontoTotalAPagar(), 1250d);
		assertEquals(factura2.getMontoTotalAPagar(), 120d);
	}
}