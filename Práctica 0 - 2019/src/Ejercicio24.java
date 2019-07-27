
import unpaz.ayp3.*;

public class Ejercicio24 {
	public static void main(String[] args) {
		String persona;

		System.out.println("Ingrese una palabra");
		persona = Consola.pedirTexto();
		if (esSinRepetidos(persona) == true) {
			System.out.println("La palabra " + persona + " no tiene caracteres repetidos, por lo tanto es "
					+ esSinRepetidos(persona));
		} else {
			System.out.println("La palabra " + persona + " tiene caracteres repetidos, por lo tanto es "
					+ esSinRepetidos(persona));
		}
	}

	static boolean esSinRepetidos(String s) {
		String tex = s;

		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == tex.charAt(j)) {
					return false;
					// cont++;
				}

			}
		}
		return true;

	}

}
