import unpaz.ayp3.Consola;

public class Ejercicio17c {

	public static void main(String args[]) {

		double m;
		int n;

		System.out.println("Ingrese un numero");
		m = Consola.pedirDecimal();

		System.out.println("Ingrese un numero");
		n = Consola.pedirEntero();

		System.out.println("El numero " + m + " elevado al " + n + " da como resultado " + potencia(m, n));

	}

	static double potencia(double x, int a) {
		if (a == 0)
			return 1;
		else
			return x * potencia(x, a - 1);

	}

}
