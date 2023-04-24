package ar.edu.unq.po2.tp5;

public class Impuesto implements Cobrable {
	
	private double tasaFijaDelServicio;

	public Impuesto(double tasaFija) {
		super();
		this.setTasaFijaDelServicio(tasaFija);
	}
	
	public double getTasaFija() {
		return tasaFijaDelServicio;
	}

	private void setTasaFijaDelServicio(double tasaFija) {
		this.tasaFijaDelServicio = tasaFija;
	}
	
	@Override
	public double registrarse() {
		return this.getTasaFija();
	}
}