package cuenta;

public class Main {

	public static void main(String[] args) {
		Cuenta c=new Cuenta(40);
		SacarDinero h1=new SacarDinero("Jesus",c);
		SacarDinero h2=new SacarDinero("Ana",c);
		h1.start();
		h2.start();
	}

}
