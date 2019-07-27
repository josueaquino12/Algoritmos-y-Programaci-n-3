import unpaz.ayp3.Consola;

public class Ejercicio25 {

	public static void main(String[] args) {
		String s;

		System.out.println("Ingrese una palabra");
		s = Consola.pedirTexto();

		System.out.println("Palabra ingresada: " + sinRepetidos(s));
	}

	static String sinRepetidos(String s) {

		String nueva_cadena = "";
		Character caracter = null;
		boolean valido = true;

		for (int i = 0; i < s.length(); i++) {
			valido = true;
			for (int j = i + 1; j < s.length(); j++) {
				caracter = s.charAt(j);

				if (s.charAt(i) == caracter) {
					valido = false;
					break;
				}
			}
			if (valido == true)
				nueva_cadena = nueva_cadena + s.charAt(i);
		}

		return nueva_cadena;

	}

}
