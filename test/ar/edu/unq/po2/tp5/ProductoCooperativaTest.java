package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoCooperativaTest {

	private ProductoCooperativa polenta;
	private ProductoCooperativa chocolate;
	
	@BeforeEach
	public void setUp() {
		 polenta = new ProductoCooperativa("Polenta", 300d, 1);      
		 chocolate = new ProductoCooperativa("Chocolatin", 500d, 19); 
	}
	
	@Test
	public void verificarCreacionProductos() {
		assertEquals("Polenta", polenta.getNombre());
		assertEquals("Chocolatin", chocolate.getNombre());
		
		assertEquals(300d, polenta.getPrecioBase());
		assertEquals(500d, chocolate.getPrecioBase());
		
		assertEquals(1, polenta.getStock());
		assertEquals(19, chocolate.getStock());
	}
	
	@Test
	public void verificarPrecioProducto() {
		assertEquals(270d, polenta.precioFinal());
		assertEquals(450d, chocolate.precioFinal());
	}
}
