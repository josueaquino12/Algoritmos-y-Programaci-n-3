
import unpaz.ayp3.*;

public class Ejercicio21 {

	public static void main(String args[]) {

		String nombre;

		System.out.println("Ingrese una palabra");
		nombre = Consola.pedirTexto();

		System.out.println("Palabra ingresada: " + nombre + " Cantidad de vocales " + cantidadVocales(nombre));

	}

	static int cantidadVocales(String s) {

		int cont = 0;

		for (int x = 0; x < s.length(); x++) {

			if ((s.charAt(x) == 'a') || (s.charAt(x) == 'e') || (s.charAt(x) == 'i') || (s.charAt(x) == 'o')
					|| (s.charAt(x) == 'u')) {

				cont++;
			}

		}

		return cont;

	}

}
