import unpaz.ayp3.Consola;
import unpaz.ayp3.EscritorArchivo;

public class Ejercicio17b {

	public static void main(String args[]) {
		int n;
		System.out.println("Ingrese valor para hacer la sumatoria de n");
		n = Consola.pedirEntero();
//		if (n % 2 == 0)
//			n = n;
//		else
//			n = n - 1;
		System.out.println(n);
		System.out.println(" El resultado de la sumatoria es " + sumatoriaPares(n));

	}

	static int sumatoriaPares(int n) {
//		System.out.println(n);
//		Consola.pedirTexto("Presione tecla");

		if (n == 2)

			return 2;

		else if (esPar(n))
			return n + sumatoriaPares(n - 2);
		else
			return n + sumatoriaPares(n - 1);
	}

	static boolean esPar(int n) {

		if (n % 2 == 0)
			return true;
		else
			return false;

	}

}
