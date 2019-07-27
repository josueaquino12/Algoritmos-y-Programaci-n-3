import unpaz.ayp3.Consola;

public class Ejercicio17d {

	public static void main(String args[]) {

		int c;

		System.out.println("Ingrese un valor");
		c = Consola.pedirEntero();

		System.out.println("El resultado es " + recurFactorial(c));
	}

	static int recurFactorial(int n) {

		if (n < 0)
			return -1;

		if (n == 0)
			return 1;
		else
			return n * (recurFactorial(n - 1));
	}

}
