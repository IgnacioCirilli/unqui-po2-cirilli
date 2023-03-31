package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> numeros; 
	
	public Counter(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public Counter() {
		this.numeros = new ArrayList<Integer>();
	}
	
	private ArrayList<Integer> getNumeros() {
		return this.numeros;
	}
	
	
	public int getEvenOcurrences() {
		int cantidadDeNumerosParesPorAhora = 0;
		for(Integer numero : this.getNumeros()) {
			if (this.isEven(numero)) {
				cantidadDeNumerosParesPorAhora ++;
			} 
		}
		return cantidadDeNumerosParesPorAhora;
	}
	

	private boolean isEven(Integer numero) {
		return (numero % 2) == 0;
	}

	public int getOddOcurrences() {
		int cantidadDeNumerosImparesPorAhora = 0;
		for(Integer numero : this.getNumeros()) {
			if (!this.isEven(numero)) {
				cantidadDeNumerosImparesPorAhora ++;
			}
		}
		return cantidadDeNumerosImparesPorAhora;
	}
	
	public int cantidadDeMultiplosDe(int numeroMultiplo) {
		int cantidadDeMultiplosPorAhora = 0;
		for(Integer numero : this.getNumeros()) {
			if (this.esMultiploDe(numero, numeroMultiplo)) {
				cantidadDeMultiplosPorAhora ++;
			}
		}
		return cantidadDeMultiplosPorAhora;
	}

	private boolean esMultiploDe(Integer numero, int numeroMultiplo) {
		return numero % numeroMultiplo == 0;
	}

	public void addNumber(int i) {
		this.numeros.add(i);
	}
	
}
