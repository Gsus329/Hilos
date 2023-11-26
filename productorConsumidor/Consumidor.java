package productorConsumidor;

public class Consumidor extends Thread {
	private Cola cola;
	private int consumidor;
	
	public Consumidor(Cola cola, int consumidor) {
		this.cola=cola;
		this.consumidor=consumidor;
	}
	@Override
	public void run() {
		int valor=0;
		for(int i=0;i<5;i++) {
			valor=cola.get();
			System.out.println(i+"=>Consumidor: "+consumidor+", consume: "+valor);
		}
	}
}
