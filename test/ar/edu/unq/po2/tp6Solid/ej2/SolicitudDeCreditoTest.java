package ar.edu.unq.po2.tp6Solid.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoTest {
	
	private SolicitudDeCredito solicitudDeCredito;
	private Cliente cliente1;

	@BeforeEach
	void setUp() throws Exception {
		cliente1 = new Cliente("Guido", "Ventoso", "Av. SiempreWollok 2142", 62, 5000f);
		solicitudDeCredito = new SolicitudDeCredito(cliente1, 1000f, 10); 
	}

	@Test
	void verificacionDeInicializacionDeUnaSolicitudDeCredito() {
		assertEquals(this.solicitudDeCredito.getClienteSolicitante(), cliente1);
		assertEquals(this.solicitudDeCredito.getMontoSolicitado(), 1000f);
		assertEquals(this.solicitudDeCredito.getPlazoEnMeses(), 10);
		assertEquals(this.solicitudDeCredito.getEsAceptada(), false);
	}

	@Test
	void verificarMontoMensualDeUnCredito() {
		assertEquals(this.solicitudDeCredito.montoCuotaMensual(), 100f);
	}
	
}
