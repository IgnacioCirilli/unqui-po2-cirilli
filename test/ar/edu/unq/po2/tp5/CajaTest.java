package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaTest {
	
	private ProductoCooperativa polenta;
	private ProductoCooperativa chocolate;
	private ProductoTradicional banana;
	private ProductoTradicional cereales;
	private Caja caja1;
	private ArrayList<Cobrable> listaDeCobrables1;
	private ArrayList<Cobrable> listaDeCobrables2;
	private Impuesto impuesto1;
	private Impuesto impuesto2;
	private Servicio servicio1;
	private Servicio servicio2;
	private Agencia agencia;
	
	@BeforeEach
	public void setUp() {                                       
	   polenta = new ProductoCooperativa("Polenta", 300d, 1);      
	   chocolate = new ProductoCooperativa("Chocolatin", 500d, 19); 
	   banana = new ProductoTradicional("Banana", 150d, 3);        
	   cereales = new ProductoTradicional("Cereales", 800d, 5);
	   impuesto1 = new Impuesto(150d);
	   impuesto2 = new Impuesto(1000d);
	   servicio1 = new Servicio(10d, 30);
	   servicio2 = new Servicio(150d, 5);
	   agencia = new Agencia() {
		
		@Override
		public void registrarPago(Factura factura) {
			// TODO Auto-generated method stub
			;
		}
	};
	   
	   caja1 = new Caja(agencia);
	   
	   listaDeCobrables1 = new ArrayList<Cobrable>();
	   listaDeCobrables1.add(cereales);
	   listaDeCobrables1.add(banana);
	   listaDeCobrables1.add(polenta);
	   listaDeCobrables1.add(cereales);
	   listaDeCobrables1.add(impuesto1);
	   listaDeCobrables1.add(servicio1);
	   
	   listaDeCobrables2 = new ArrayList<Cobrable>();
	   listaDeCobrables2.add(cereales);
	   listaDeCobrables2.add(chocolate);
	   listaDeCobrables2.add(polenta);
	   listaDeCobrables2.add(impuesto2);
	   listaDeCobrables2.add(servicio2);
	}
	
	@Test
	public void verificarMontoTotalDeCaja() {
		assertEquals(2470d, caja1.montoTotalAPagar(listaDeCobrables1));
	}
	
	@Test
	public void verificarMontoTotalDeCaja2() {
		assertEquals(3270d, caja1.montoTotalAPagar(listaDeCobrables2));
	}
}
