package ar.edu.unq.po2.tp9Composite.ej5;

import java.util.List;

public class CarroDeCompras {

	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	private void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public float total() {
		return (float) getProducts().stream().mapToDouble(p -> p.getPrice()).sum();
	}
	
	public int totalRounded() {
		return getProducts().stream().mapToInt(p -> (int)p.getPrice()).sum();
	}
}
