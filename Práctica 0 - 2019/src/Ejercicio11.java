import unpaz.ayp3.Consola;

public class Ejercicio11 {

	public static void main(String args[]) {

		int op = 0;

		System.out.println("Cant de Cifras " + cantCifras(op));

	}

	static int cantCifras(int n) {

		int cont = 0;

		System.out.println("Ingrese el valor");
		n = Consola.pedirEntero();
		while (n != 0) {
			n = n / 10;
			cont++;
		}

		return cont;

	}

}
