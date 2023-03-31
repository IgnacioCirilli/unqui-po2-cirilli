package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> numeros;

	public Multioperador(ArrayList<Integer> numeros) {
		super();
		this.numeros = numeros;
	}
	
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}

	public int sumaTotalDeLaLista() {
		int sumaTotalPorAhora = 0;
		for (Integer numero : this.getNumeros()) {
			sumaTotalPorAhora += numero;
		}
		return sumaTotalPorAhora;
	}
	
	public int restaTotalDeLaLista() {
		int restaTotalPorAhora = 0;
		for (Integer numero : this.getNumeros()) {
			restaTotalPorAhora -= numero;
		}
		return restaTotalPorAhora;
	}
	
	public int multiplicacionTotalDeLaLista() {
		int multiplicacionTotalPorAhora = 0;
		for (Integer numero : this.getNumeros()) {
			multiplicacionTotalPorAhora *= numero;
		}
		return multiplicacionTotalPorAhora;
	}
	
}
