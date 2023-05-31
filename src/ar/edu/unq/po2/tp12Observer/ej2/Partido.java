package ar.edu.unq.po2.tp12Observer.ej2;

import java.util.List;

public class Partido {

	private String resultado;
	private List<String> contrincantes;
	private TipoDeDeporte tipoDeDeporte;
	
	public Partido(String resultado, List<String> contrincantes, TipoDeDeporte tipoDeDeporte) {
		super();
		this.setResultado(resultado);
		this.setContrincantes(contrincantes);
		this.setTipoDeDeporte(tipoDeDeporte);
	}

	public String getResultado() {
		return resultado;
	}

	private void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}

	private void setContrincantes(List<String> contrincantes) {
		this.contrincantes = contrincantes;
	}

	public TipoDeDeporte getTipoDeDeporte() {
		return tipoDeDeporte;
	}

	private void setTipoDeDeporte(TipoDeDeporte tipoDeDeporte) {
		this.tipoDeDeporte = tipoDeDeporte;
	}
	
}
