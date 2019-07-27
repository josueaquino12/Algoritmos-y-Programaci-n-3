import unpaz.ayp3.Consola;

public class Ejercicio5 {
	
public static void main (String args[]){
		
		int a;
		int b;
		float resultadoprom;
		
		System.out.println("Ingrese un valor:\n");
		a = Consola.pedirEntero();
		System.out.println("Ingrese un valor:\n");
		b = Consola.pedirEntero();
		
		resultadoprom = (a + b) / 2;
		
		System.out.println("El resultado es:\n" +resultadoprom);
	}


}
