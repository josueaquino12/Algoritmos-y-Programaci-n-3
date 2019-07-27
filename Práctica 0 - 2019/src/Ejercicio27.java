import unpaz.ayp3.Consola;

public class Ejercicio27 {

	public static void main(String[] args) {

		int numero = 0;

		System.out.println("Ingrese un numero (Collatz)");
		numero = Consola.pedirEntero();

		collatz(numero);

	}

	static void collatz(int num) {
		// TODO Auto-generated method stub

		if (num == 1) {
			System.out.println("1");
		}
		while (num != 1) {
			if ((num % 2 == 0)) {
				num = num / 2;
			} else {
				num = (num * 3) + 1;
			}

			System.out.print(num + " , ");

		}

	}

}
