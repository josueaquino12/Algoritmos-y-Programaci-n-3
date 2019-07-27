import unpaz.ayp3.Consola;

public class Ejercicio12 {

	public static void main(String args[]) {

		int e = 0;
		int d = 0;

		System.out.println("Ingrese un valor");
		e = Consola.pedirEntero();
		System.out.println("Ingrese un valor");
		d = Consola.pedirEntero();

		if (esDivisible(e, d) == true) {

			System.out.println(" El numero " + e + " es divisible por " + d + " ,por lo tanto es " + esDivisible(e, d));

		}

		else {

			System.out.println(
					" El numero " + e + " no es divisible por " + d + " ,por lo tanto es " + esDivisible(e, d));

		}

	}

	static boolean esDivisible(int n, int m) {

		if (n % m == 0) {

			return true;
		} else {

			return false;
		}

	}

}
