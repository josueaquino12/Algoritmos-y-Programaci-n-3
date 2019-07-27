package Fraccion;


public class Fraccion {

	int numerador;
	int denominador;

	public Fraccion(int n, int d) {

		this.numerador = n;
		this.denominador = d;

	}

	public Fraccion() {
		// TODO Auto-generated constructor stub
	}

	void imprimir() {

		System.out.println(this.numerador + "/" + this.denominador);
	}

	
	void invertirSigno() {

		this.numerador = numerador * -1;
		this.denominador = denominador * -1;

	}
	
	
	void invertir() {

		System.out.println(this.denominador + "/" + this.numerador);
	}

	double dDouble() {

		double resul = this.numerador / this.denominador;

		return resul;

	}
	
	static Fraccion producto(Fraccion q1, Fraccion q2) {

		Fraccion resul = new Fraccion();

		resul.numerador = q1.numerador * q2.numerador;
		resul.denominador = q1.denominador * q2.denominador;
		resul.simplificar(); // se simplifica antes de devolverla
		return resul;

	}
	
	static Fraccion sumar(Fraccion q1, Fraccion q2) {

		Fraccion resul = new Fraccion();

		resul.numerador = q1.numerador * q2.denominador + q1.denominador * q2.numerador;
		resul.denominador = q1.denominador * q2.denominador;
		resul.simplificar();

		return resul;

	}
	
	public String toString() {
		simplificar();
		return numerador + "/" + denominador;
	}
	
	private void simplificar() {
		// TODO Auto-generated method stub
		int n = mcd(); // se calcula el mcd de la fracción
		numerador = numerador / n;
		denominador = denominador / n;
	}

	private int mcd() {
		int u = Math.abs(numerador); // valor absoluto del numerador
		int v = Math.abs(denominador); // valor absoluto del denominador
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;

	}

}
