package Arreglo;

import Arreglo.Arreglo;
public class aMain {

	public static void main(String[] args) {
		
		
		int[] a = {4,34,5,9,75,14,7,4,64};
		int[] a2 = {4,34,5,9,75,14,7,43,64};
		
		System.out.println("sinRepetidos: "+ Arreglo.esSinRepetidos(a));
		System.out.println("sinRepetidos 2: "+ Arreglo.esSinRepetidos(a2));
		
	
		System.out.print("Pegar: "); Arreglo.mostrar(Arreglo.pegar(a, a2));	
		System.out.println();
       
		System.out.print("AgregarAlFinal: "); Arreglo.mostrar(Arreglo.agregarAlFinal(a2, 123));	
		System.out.println();
		System.out.print("Invertir:");
	    Arreglo.invertir(a);
		
		
	}
}
