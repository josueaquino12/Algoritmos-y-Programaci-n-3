import unpaz.ayp3.Consola;

public class Ejercicio6 {

	public static void main(String[] args) {

		int a;
		int b;
		System.out.println("Ingrese un valor:\n");
		a = Consola.pedirEntero();
		System.out.println("Ingrese un valor:\n");
		b = Consola.pedirEntero();

		imprimirSuma(a, b);

	}

	static void imprimirSuma(int n1, int n2) {

		int hagamoslasuma = n1 + n2;

		System.out.println("La suma de " + n1 + " y " + n2 + "  es " + hagamoslasuma);

	}

}
