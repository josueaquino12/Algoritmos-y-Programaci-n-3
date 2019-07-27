import unpaz.ayp3.Consola;

public class Ejercicio23 {
	public static void main(String[] args) {
		String s;

		System.out.println("Ingrese un texto");

		s = Consola.pedirTexto();

		System.out.println("Es capicua?");
		System.out.println(esCapicua(s));
	}

	public static String imprimirReversa(String s) {

		int x;

		String cadenas = "";

		for (x = s.length() - 1; x >= 0; x--) {

			cadenas = cadenas + s.charAt(x);
		}

		return cadenas;
	}

	public static boolean esCapicua(String s) {
		if (s.equals(imprimirReversa(s)))

			return true;
		else
			return false;

	}

}
