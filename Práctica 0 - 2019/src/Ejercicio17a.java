import unpaz.ayp3.Consola;

public class Ejercicio17a {

	public static void main(String args[]) {

		int be = 0;

		System.out.println("Ingrese valor para hacer la sumatoria de n");
		be = Consola.pedirEntero();

		System.out.println(" El resultado de la sumatoria es " + sumatoria(be));

	}

	static int sumatoria(int n) {

		if (n == 1)
			return 1;
		else
			return sumatoria(n - 1) + n;

	}

}
