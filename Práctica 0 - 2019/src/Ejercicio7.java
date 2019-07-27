import unpaz.ayp3.Consola;

public class Ejercicio7 {

	public static void main(String args[]) {

		int a;
		int b;

		System.out.println("Ingrese un valor:\n");
		a = Consola.pedirEntero();
		System.out.println("Ingrese un valor:\n");
		b = Consola.pedirEntero();

		sumayprom(a, b);

	}

	static void sumayprom(int num1, int num2) {

		float promediofinal = (num1 + num2) / 2;

		System.out.println("El promedio de " + num1 + " y " + num2 + " es:\n" + promediofinal);

	}

}
