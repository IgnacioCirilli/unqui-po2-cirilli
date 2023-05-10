package ar.edu.unq.po2.tp11TemplateMethod;

public class CajaDeAhorro extends CuentaBancaria {	//ConcreteClass
	
	 private int limite;
	 
	 public CajaDeAhorro(String titular, int limite) {
		 super(titular);
		 this.limite=limite;
	 }
	 
	 public int getLimite() {
		 return this.limite;
	 }

	@Override
	protected boolean esPosibleExtraer(int monto) {	//Primitive operation
		return super.getSaldo() >= monto && this.getLimite() >= monto;
	}

}
