package productorConsumidor;

public class Productor extends Thread{
	private Cola cola;
	private int productor;
	
	public Productor(Cola cola, int valor) {
		this.cola=cola;
		this.productor=valor;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			cola.put(i);
			System.out.println(i+"=>Productor: "+productor+", produce: "+i);
			try {
				this.sleep(100);
			}catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
