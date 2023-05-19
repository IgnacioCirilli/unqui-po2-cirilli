package ar.edu.unq.po2.tp9Composite.ej5;

public class SpecialProduct extends Product {

	@Override
	public float getPrice() {
		return super.getPrice() - 1f; 				// Deberia hacer algo mas.
	}
}
