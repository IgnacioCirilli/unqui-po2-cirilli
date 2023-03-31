package ar.edu.unq.po2.tp4.ej1y2;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;

	public Supermercado(String string, String string2) {
		this.nombre = string;
		this.direccion = string2;
		this.productos = new ArrayList<Producto>();
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public ArrayList<Producto> getProductos() {
		return productos;
	}


	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}


	public Integer getCantidadDeProductos() {
		return this.getProductos().size();
	}

	
	public void agregarProducto(Producto arroz) {
		this.getProductos().add(arroz);
	}

	
	public Double getPrecioTotal() {
		double precioTotalPorAhora = 0;
		for (Producto producto : this.getProductos()) {
			precioTotalPorAhora += producto.getPrecio();
		}
		return precioTotalPorAhora;
	}

}
