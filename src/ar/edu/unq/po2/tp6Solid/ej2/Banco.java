package ar.edu.unq.po2.tp6Solid.ej2;

import java.util.ArrayList;
import java.util.List;

public class Banco {

		private List<Cliente> 				clientes;
		private List<SolicitudDeCredito> 	solicitudesDeCreditos;
		
		public Banco() {
			this.setClientes(new ArrayList<Cliente>()); 
			this.setSolicitudesDeCreditos(new ArrayList<SolicitudDeCredito>());
		}
		
		
		public List<SolicitudDeCredito> getSolicitudesDeCreditos() {
			return solicitudesDeCreditos;
		}


		public void setSolicitudesDeCreditos(List<SolicitudDeCredito> solicitudesDeCreditos) {
			this.solicitudesDeCreditos = solicitudesDeCreditos;
		}


		public List<Cliente> getClientes() {
			return clientes;
		}

		
		public void setClientes(List<Cliente> clientes) {
			this.clientes = clientes;
		}

		public void agregarCliente(Cliente cliente) {
			this.getClientes().add(cliente);
		}

		public void agregarSolicitudDeCredito(SolicitudDeCredito solicitudDeCredito) {
			this.getSolicitudesDeCreditos().add(solicitudDeCredito);
		}
		
		public void verificarSolicitudesDeCredito() {
			this.getSolicitudesDeCreditos().stream().forEach(s -> s.verificarSolicitudDeCredito());
		}
}

