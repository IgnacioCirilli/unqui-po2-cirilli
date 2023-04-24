package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTradicionalTest {
	
	private ProductoTradicional banana;
	private ProductoTradicional cereales;

	@BeforeEach
	public void setUp() {
		banana = new ProductoTradicional("Banana", 150d, 3);        
		cereales = new ProductoTradicional("Cereales", 800d, 5);
	}
	
	@Test
	public void verificarCreacionProductos() {
		assertEquals("Banana", banana.getNombre());
		assertEquals("Cereales", cereales.getNombre());
		
		assertEquals(150d, banana.getPrecioBase());
		assertEquals(800d, cereales.getPrecioBase());
		
		assertEquals(3, banana.getStock());
		assertEquals(5, cereales.getStock());
	}
	
	@Test
	public void verificarPrecioProducto() {
		assertEquals(150d, banana.precioFinal());
		assertEquals(800d, cereales.precioFinal());
	}
}
