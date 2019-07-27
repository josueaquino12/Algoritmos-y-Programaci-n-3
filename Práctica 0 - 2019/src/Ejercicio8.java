import unpaz.ayp3.Consola;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese dos numeros:\t");
		double n1;
		double n2;

		n1 = Consola.pedirDecimal();
		n2 = Consola.pedirDecimal();
		ponerNota(n1, n2);

	}

	static void ponerNota(double a, double b) {
		double promediofinal;
		promediofinal = (a + b) / 2;

		System.out.println("Nota:" + promediofinal);

		if (promediofinal >= 7) {
			System.out.println("PROMOCIONADO");
		}

		if (promediofinal >= 4 && promediofinal < 7) {
			System.out.println("APROBADO");
		}
		if (promediofinal < 4) {
			System.out.println("DEBE RECUPERAR");
		}

	}

}
