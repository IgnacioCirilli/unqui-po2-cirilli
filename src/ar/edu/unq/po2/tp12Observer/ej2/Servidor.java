package ar.edu.unq.po2.tp12Observer.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Servidor implements Observer {
	
	private AppWeb web;
	private List<TipoDeDeporte> deportesDeInteres;

	public Servidor(AppWeb appWeb) {
		super();
		this.setWeb(appWeb);
		this.setDeportesDeInteres(new ArrayList<TipoDeDeporte>());
	}
	
	public AppWeb getWeb() {
		return web;
	}

	private void setWeb(AppWeb web) {
		this.web = web;
		web.addObserver(this);
	}

	public List<TipoDeDeporte> getDeportesDeInteres() {
		return deportesDeInteres;
	}

	private void setDeportesDeInteres(ArrayList<TipoDeDeporte> deportesDeInteres) {
		this.deportesDeInteres = deportesDeInteres;
	}

	public void agregarDeporteDeInteres(TipoDeDeporte deporteDeInteres) {
		this.getDeportesDeInteres().add(deporteDeInteres);
	}
	
	public void eliminarDeporteDeInteres(TipoDeDeporte deporteDeInteres) {
		this.getDeportesDeInteres().remove(deporteDeInteres);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (this.verificarQueElPartidoEsDeInteres(arg)) {
			System.out.println("Me interesa gracias");
		}
	}

	public boolean verificarQueElPartidoEsDeInteres(Object partido) {
		Partido nuevoPartido = (Partido) partido;
		
		return this.getDeportesDeInteres().contains(nuevoPartido.getTipoDeDeporte());
	}

}
