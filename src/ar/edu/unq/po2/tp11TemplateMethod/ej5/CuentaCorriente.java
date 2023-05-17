package ar.edu.unq.po2.tp11TemplateMethod.ej5;

public class CuentaCorriente extends CuentaBancaria {	//ConcreteClass
	
	 private int descubierto;
	 
	 public CuentaCorriente(String titular, int descubierto) {
		 super(titular);
		 this.descubierto=descubierto;
	 }
	 
	 public int getDescubierto() {
		 return this.descubierto;
	 }

	@Override
	protected boolean esPosibleExtraer(int monto) {	//Primitive operation
		return super.getSaldo() + this.getDescubierto() >= monto;
	}
	 
}
