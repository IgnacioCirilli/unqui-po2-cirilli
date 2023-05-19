package ar.edu.unq.po2.tp6Solid.ej1.case2;

import java.util.List;

public class GestorDeEmail {

	private IServidor servidor;

	public GestorDeEmail(IServidor servidor) {
		super();
		this.setServidor(servidor);
	}
	
	public IServidor getServidor() {
		return servidor;
	}

	private void setServidor(IServidor servidor) {
		this.servidor = servidor;
	}

	public void conectar() {
		// Hace lo necesario para conectar
		
	}
	
	public List<Correo> recibirNuevos() {
		// Hace lo necesario para recibir los correos nuevos.
		return null;
	}
	
	public void enviarCorreo(Correo correo) {
		// Hace lo necesario para enviar un correo
		
	}
}