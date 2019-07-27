import unpaz.ayp3.Consola;

public class Ejercicio13 {

	public static void main(String args[]) {

		int n = 0;

		System.out.println("Ingrese la cantidad de numeros a sumar hasta n");
		n = Consola.pedirEntero();

		System.out.println(" El resultado de la sumatoria es " + sumatoria(n));

	}

	static int sumatoria(int n) {

		int suma = 0;

		for (int i = 0; i <= n; i++) {

			suma = suma + i;

		}

		return suma;

	}

}
