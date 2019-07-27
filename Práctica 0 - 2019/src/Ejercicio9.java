import unpaz.ayp3.Consola;

public class Ejercicio9 {

	public static void main(String args[]) {

		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println("Ingrese dia");
		a = Consola.pedirEntero();

		System.out.println("Ingrese mes");
		b = Consola.pedirEntero();

		System.out.println("Ingrese anio");
		c = Consola.pedirEntero();

		imprimirFecha(a, b, c);

	}

	static void imprimirFecha(int dia, int mes, int anio) {

		switch (mes) {

		case 1:
			System.out.println(+dia + " Enero " + anio);
			break;
		case 2:
			System.out.println(+dia + " Febrero " + anio);
			break;
		case 3:
			System.out.println(+dia + " Marzo " + anio);
			break;
		case 4:
			System.out.println(+dia + " Abril " + anio);
			break;
		case 5:
			System.out.println(+dia + " Mayo " + anio);
			break;
		case 6:
			System.out.println(+dia + " Junio " + anio);
			break;
		case 7:
			System.out.println(+dia + " Julio " + anio);
			break;
		case 8:
			System.out.println(+dia + " Agosto " + anio);
			break;
		case 9:
			System.out.println(+dia + " Septiembre " + anio);
			break;
		case 10:
			System.out.println(+dia + " Octubre " + anio);
			break;
		case 11:
			System.out.println(+dia + " Noviembre " + anio);
			break;
		case 12:
			System.out.println(+dia + " Diciembre " + anio);
			break;
		}

	}

}
