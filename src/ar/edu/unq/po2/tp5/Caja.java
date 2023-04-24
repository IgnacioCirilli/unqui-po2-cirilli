package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {
	
		private Agencia agenciaRecaudadora;
		
		public Caja(Agencia agencia) {
			super();
			this.setAgenciaRecaudadora(agencia);
		}
		
		public Agencia getAgenciaRecaudadora() {
			return this.agenciaRecaudadora;
		}
		
		private void setAgenciaRecaudadora(Agencia agencia) {
			this.agenciaRecaudadora = agencia;
		}
		
		public double montoTotalAPagar(ArrayList<Cobrable> cobrables) {
			
			double montoTotalHastaAhora = 0;
			
			for (Cobrable cobrable : cobrables) {
				montoTotalHastaAhora += cobrable.registrarse();
			}
			
			return montoTotalHastaAhora;
		}
		
		public void notificarPago(double monto, String concepto) {
			Factura factura = new Factura(monto, concepto);
			this.getAgenciaRecaudadora().registrarPago(factura);
		}
}
