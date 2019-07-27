import unpaz.ayp3.Consola;

public class Ejercicio19 {

	public static void main(String args[]) {

		String nombre = "TELEVISION";

		int i;

		// char gcadena ;

		String nep = "";

		for (i = nombre.length() - 1; i >= 0; i--) {

			nep = nep + nombre.charAt(i);
		}

		// gcadena = nombre.charAt(0);

		System.out.println(nep);

		System.out.println(" Caracter devuelto ");

		System.out.println("----invertir string en cadena por metodo---- ");

		String nombrec;

		System.out.println("Ingresa una palabra");

		nombrec = Consola.pedirTexto();

		System.out.println(" ----Palabra Ordenada-----");

		System.out.println(nombrec);

		System.out.println(" ----Palabra inversa-----");

		System.out.println(imprimirReversa(nombrec));
	}

	static String imprimirReversa(String cadenap) {

		int x;

		String cadenas = "";

		for (x = cadenap.length() - 1; x >= 0; x--) {

			cadenas = cadenas + cadenap.charAt(x);
		}

		return cadenas;
	}

}
