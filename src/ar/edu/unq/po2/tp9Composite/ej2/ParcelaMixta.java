package ar.edu.unq.po2.tp9Composite.ej2;

import java.util.ArrayList;
import java.util.List;

public class ParcelaMixta implements Parcela {
	
	private List<Parcela> parcelas;

	public ParcelaMixta() {
		this.setParcelas(new ArrayList<Parcela>(4)); 
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

	private void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}


	public void agregarParcela(Parcela parcela) {
		this.getParcelas().add(parcela);	
	}

	public void removerParcela(Parcela parcela) {
		this.getParcelas().remove(parcela);
	}
	
	@Override
	public double obtenerGananciasAnualesTotales() {
		return this.getParcelas()
				   .stream()
				   .mapToDouble(p -> p.obtenerGananciasAnualesTotales())
				   .sum();
	}

}
