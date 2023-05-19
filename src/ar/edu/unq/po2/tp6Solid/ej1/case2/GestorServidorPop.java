package ar.edu.unq.po2.tp6Solid.ej1.case2;

public class GestorServidorPop implements IGestorServidor {

	private ServidorPop servidor;
	
	public GestorServidorPop(ServidorPop servidor) {
		super();
		this.setServidor(servidor);
	}

	public ServidorPop getServidor() {
		return servidor;
	}

	private void setServidor(ServidorPop servidor) {
		this.servidor = servidor;
	}

	@Override
	public float tazaDeTransferencia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarBackUp() {
		// TODO Auto-generated method stub
		
	}
}
