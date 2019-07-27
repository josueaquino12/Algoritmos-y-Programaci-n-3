import unpaz.ayp3.Consola;

public class Ejercicio14 {

	public static void main(String args[]) {

		int n;
		System.out.println("Ingrese un numero");
		n = Consola.pedirEntero();

		System.out.println("la sumatoria es:\n" + sumatoriaPares(n));

	}

	static int sumatoriaPares(int n) {
		int sum = 0;

//		for (int i = 0; i <= n; i++) {
//			if (i % 2 == 0)
//				sum = sum + i;
//
//		}

		for (int i = 2; i <= n; i = i + 2) {

			sum = sum + i;

		}

		return sum;

	}

}
