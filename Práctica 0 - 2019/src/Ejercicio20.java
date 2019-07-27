
import java.io.IOException;

import unpaz.ayp3.*;

public class Ejercicio20 {

	public static void main(String args[]) throws IOException {

		String nom;

		char letra;

		System.out.println("Ingresar Palabra: ");

		nom = Consola.pedirTexto();

		System.out.println("Ingrese un caracter");

		letra = (char) System.in.read();

		System.out.println("Palabra Ingresada: " + nom + " | Letra: " + letra
				+ " | Cantidad de veces que aparece la letra: " + cantidadApariciones(nom, letra));

	}

	static int cantidadApariciones(String s, char c) {

		int cadenapos = 0;

		int cont = 0;

		cadenapos = s.indexOf(c);

		while (cadenapos != -1) {

			cont++;

			cadenapos = s.indexOf(c, cadenapos + 1);

		}

		return cont;

	}

}
