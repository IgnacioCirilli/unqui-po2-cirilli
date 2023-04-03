package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private Point esquinaSupIzq;
	private Point esquinaInfIzq;
	private Point esquinaSupDer;
	private Point esquinaInfDer;
	
	
	public Rectangulo(Point esquinaSupIzq, Point esquinaInfIzq, Point esquinaSupDer, Point esquinaInfDer) {
		super();
		this.setEsquinaSupIzq(esquinaSupIzq);
		this.setEsquinaInfIzq(esquinaInfIzq);
		this.setEsquinaSupDer(esquinaSupDer);
		this.setEsquinaInfDer(esquinaInfDer);
	}


	public Point getEsquinaSupIzq() {
		return esquinaSupIzq;
	}


	public void setEsquinaSupIzq(Point esquinaSupIzq) {
		this.esquinaSupIzq = esquinaSupIzq;
	}


	public Point getEsquinaInfIzq() {
		return esquinaInfIzq;
	}


	public void setEsquinaInfIzq(Point esquinaInfIzq) {
		this.esquinaInfIzq = esquinaInfIzq;
	}


	public Point getEsquinaSupDer() {
		return esquinaSupDer;
	}


	public void setEsquinaSupDer(Point esquinaSupDer) {
		this.esquinaSupDer = esquinaSupDer;
	}


	public Point getEsquinaInfDer() {
		return esquinaInfDer;
	}


	public void setEsquinaInfDer(Point esquinaInfDer) {
		this.esquinaInfDer = esquinaInfDer;
	}
	
	
	public double obtenerArea() {
		//area = base * altura
		return 0;
	}
	
}
