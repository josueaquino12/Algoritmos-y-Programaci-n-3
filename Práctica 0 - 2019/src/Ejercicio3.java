import unpaz.ayp3.Consola;

public class Ejercicio3 {

	public static void main(String args[]) {

		int a;
		int b;
		int resultado;
		System.out.println("Ingresa un numero1:\n");
		a = Consola.pedirEntero();
		System.out.println("Ingresa un numero2:\n");
		b = Consola.pedirEntero();

		resultado = a + b;

		System.out.println("El resultado es:\n" + resultado);

	}

}
