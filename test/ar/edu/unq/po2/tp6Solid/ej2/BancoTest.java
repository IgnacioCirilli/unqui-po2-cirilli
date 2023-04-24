package ar.edu.unq.po2.tp6Solid.ej2;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {
	
	private Banco banco;
	private Cliente cliente1;

	@BeforeEach
	void setUp() throws Exception {
		this.banco    = new Banco();
		this.cliente1 = new Cliente(banco, "Guido", "Ventoso", "Av. SiempreViva 2142", 62, 5000f); 
	}

	@Test
	void verificacionDeInicializacionDeUnBanco() {
		assertEquals(this.banco.getClientes().size(), 0);
		assertEquals(this.banco.getSolicitudesDeCreditos().size(), 0);
	}
	
	@Test
	void verificacionDeCuandoUnBancoAgregaUnCliente() {
		this.banco.agregarCliente(this.cliente1);
		assertEquals(this.banco.getClientes().size(), 1);
	}
	
}
