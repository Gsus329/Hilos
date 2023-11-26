package cuenta;

public class Cuenta {
	private int saldo;
	
	public Cuenta(int saldo) {
		this.saldo=saldo;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void restar(int cantidad) {
		this.saldo=this.saldo-cantidad;
	}
	
	public void retirarSaldo(int cantidad, String nombre) {
		if(getSaldo()<0) {
			System.out.println("Saldo negativo =>"+getSaldo());
		}
		else if(getSaldo()>=cantidad) {
			System.out.println(nombre+"; Se va a retirar Saldo:\n"
						+"\tSaldo actual=> "+getSaldo());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			restar(cantidad);
			System.out.println("\t"+nombre+" retira=> "+ cantidad+"\n\tSaldo actual=> "+getSaldo());
		}else {
			System.out.println(nombre+" no puede retirar diner. Saldo insuficiente: "+getSaldo());
		}
		
	}
}
