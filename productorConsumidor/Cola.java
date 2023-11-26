package productorConsumidor;

public class Cola {
	private int numero;
	private boolean disponible;
	
	public int get() {
		if(this.disponible) {//si disponible
			this.disponible=false;//se pone cola vacía
			return this.numero;//se devuelve
		}
		return -1;//no hay numero, cola vacía
	}
	
	public void put(int valor) {
		this.numero=valor;//coloca valor a la cola
		this.disponible=true;//disponible para consumir, cola llena
	}
}
