import unpaz.ayp3.*;

public class Ejercicio22 {

	public static void main(String[] args) {
		String nom;

		System.out.println("Ingrese una palabra");
		nom = Consola.pedirTexto();
		if (esabecedaria(nom) == true) {
			System.out.println("La palabra esta ordenada, por lo tanto es " + esabecedaria(nom));
		} else {

			System.out.println("La palabra no esta ordenada, por lo tanto es " + esabecedaria(nom));
		}
	}

	static boolean esabecedaria(String s) {

		char c[] = s.toCharArray();

		// char aux;

		for (int i = 0; i < c.length; i++) {

			for (int j = i + 1; j < c.length; j++) {

				if (c[i] > c[i + 1]) {

					return false;
				}
			}
		}
		return true;

	}

}
