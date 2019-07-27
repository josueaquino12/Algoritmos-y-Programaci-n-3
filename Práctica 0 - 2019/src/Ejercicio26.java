import unpaz.ayp3.Consola;

public class Ejercicio26 {

	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;

		System.out.println("Ingrese un numero(Recursivo)");
		num = Consola.pedirEntero();

		System.out.println("Numero ingresado para la suc. de Finobacci(Recursivo): " + fibrec(num));

		System.out.println("Ingrese un numero(Iterativo)");
		num2 = Consola.pedirEntero();

		System.out.println("Numero ingresado para la suc. de Finobacci(Iterativo): " + fibiter(num2));

	}

	static int fibrec(int n) {

		// Método recursivo

		if (n <= 1)
			return 1;
		else
			return fibrec(n - 1) + fibrec(n - 2);

	}

	static int fibiter(int n) {

		int resul = 0, nu1, nu2 = 0;

		nu1 = nu2 = 1;

		if ((n == 0) || (n == 1)) {

			resul = 1;

		} else

			for (int i = 2; i <= n; i++) {
				resul = nu1 + nu2;
				nu2 = nu1;
				nu1 = resul;
			}

		return resul;

	}

}
