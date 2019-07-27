package Arreglo;

public class Arreglo {

	static boolean esSinRepetidos(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j])

					return false;

			}

		}

		return true;

	}

	static int[] pegar(int[] arr, int[] arr2) {

		int[] cargar = new int[arr.length + arr2.length];

		for (int i = 0; i < arr.length; i++) {

			cargar[i] = arr[i];

		}

		for (int i = 0; i < arr2.length; i++) {

			cargar[arr.length + i] = arr2[i];

		}
		
		
		return cargar;

	}
	
	
	static void mostrar(int arreglo[]) {


		System.out.print("[ ");
		
		for (int i = 0; i < arreglo.length; i++) {

			System.out.print( + arreglo[i] +", ");

		}
		
		System.out.print("]");
	}
	
	
	static int [] agregarAlFinal(int[] arr, int elem) {
		
	
		int [] cargar = new int [arr.length + 1];
		
		for (int i = 0; i < arr.length; i++) {
			
			cargar[i] = arr[i];
			cargar[cargar.length - 1] = elem;
			
		}
		
		return cargar;
		
		
	}
	
	
//	static int [] sinRepetidos(int[] arr) {
//		
//		
//		
//	}
	
	static void invertir(int[] arr){

		int aux;

		for (int i = 0; i < arr.length / 2; i++) {

			aux = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = aux;

		}

		
		System.out.print("[ ");
		
		for (int i = 0; i < arr.length; i++) {

			System.out.print( arr[i]+", ");

		}

		System.out.print(" ]");
	}
}
