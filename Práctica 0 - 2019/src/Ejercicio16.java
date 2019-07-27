import unpaz.ayp3.Consola;

public class Ejercicio16 {

	public static void main(String args[]) {

		int n;

		System.out.println("Ingrese un numero");
		n = Consola.pedirEntero();

		System.out.println("El resultado del factorial " + n + " es " + factorial(n));

	}

	static int factorial(int n) {

		int fact = 1;
		int i;
		if (n == 0)
			fact = 1;
		else
			for (i = 1; i <= n; i++)
				fact = fact * i;
		return fact;

	}
}
