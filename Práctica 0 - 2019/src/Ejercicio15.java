import unpaz.ayp3.Consola;

public class Ejercicio15 {

	public static void main(String args[]) {

		double x;
		int a;

		System.out.println("Ingrese un numero");
		x = Consola.pedirDecimal();

		System.out.println("Ingrese un numero");

		a = Consola.pedirEntero();

		System.out.println("El numero " + x + " elevado al " + a + " da como resultado " + potencia(x, a));

	}

	static double potencia(double x, int a) {

		int i;
		double res = x;
		for (i = 1; i < a; i++) {
			res = res * x;

		}

		return res;

	}

}
