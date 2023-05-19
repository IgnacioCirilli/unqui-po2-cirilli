package ar.edu.unq.po2.tp6Solid.ej1.case2;

import java.util.ArrayList;

public class ClienteEmail {
	
	private GestorDeEmail cliente;
	private String nombreUsuario;
	private String passusuario;
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public ClienteEmail(GestorDeEmail cliente, String nombreUsuario, String pass){
		this.setCliente(cliente);
		this.setNombreUsuario(nombreUsuario);
		this.setPassusuario(pass);
		this.setInbox(new ArrayList<Correo>());
		this.setBorrados(new ArrayList<Correo>());
		this.conectar();
	}
	
	public GestorDeEmail getCliente() {
		return cliente;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getPassusuario() {
		return passusuario;
	}

	public ArrayList<Correo> getInbox() {
		return inbox;
	}

	public ArrayList<Correo> getBorrados() {
		return borrados;
	}

	private void setCliente(GestorDeEmail cliente) {
		this.cliente = cliente;
	}

	private void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	private void setPassusuario(String passusuario) {
		this.passusuario = passusuario;
	}

	private void setInbox(ArrayList<Correo> inbox) {
		this.inbox = inbox;
	}

	private void setBorrados(ArrayList<Correo> borrados) {
		this.borrados = borrados;
	}

	public void conectar(){
		this.getCliente().conectar();
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.getCliente().recibirNuevos();
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.getCliente().enviarCorreo(correo);
	}
}