import unpaz.ayp3.Consola;

public class Ejercicio10 {

	public static void main(String args[]) {

		int x;

		System.out.println("Ingrese el valor:\n");
		x = Consola.pedirEntero();

		if (x % 2 == 0) {

			System.out.println(+x + " es par");
		} else {

			System.out.println(+x + " es impar");

		}

		System.out.println("Is " + esPar(x));

	}

	static boolean esPar(int n) {

		if (n % 2 == 0) {

			return true;
		}

		else {
			return false;

		}

	}

}
