package ar.edu.unq.po2.tp11Adapter;

public class ListaDePalabrasOrdenadasAdapter implements DefaultListModel {
	
	private ListaDePalabrasOrdenadas adaptee;
	
	public ListaDePalabrasOrdenadasAdapter() {
		super();
		this.setAdaptee(new ListaDePalabrasOrdenadas());;
	}

	public ListaDePalabrasOrdenadas getAdaptee() {
		return adaptee;
	}

	public void setAdaptee(ListaDePalabrasOrdenadas adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void addElement(String element) {
		this.getAdaptee().agregarPalabra(element);
	}
}
