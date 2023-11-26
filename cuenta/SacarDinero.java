package cuenta;

public class SacarDinero extends Thread{
	private Cuenta c;
	String nombre;
	
	public SacarDinero(String nombre, Cuenta c) {
		super(nombre);
		this.c=c;
	}
	@Override
	public void run() {
		for(int i=1;i<=4;i++) {
			c.retirarSaldo(10, getName());
		}
	}
}
