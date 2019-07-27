package Circulo;

public class cMain {

	public static void main(String[] args) {
		
		
		Circulo c1 =  new Circulo (3.0,3.0,1.0);
		Circulo c2 =  new Circulo (3.0,2.0,1.0);
		Circulo c3 =  new Circulo (5.0,3.0,2.0);
		Circulo c4 =  new Circulo (5.0,3.0,1.0);
		Circulo c5 =  new Circulo (8.0,3.0,2.0);
		c1.imprimir();
		
		System.out.println("Perimetro: "+ c1.perimetro());
		System.out.println("Superficie: "+ c1.superficie());
		
		System.out.println("Escalar: ");
		c1.escalar(1);
		c1.imprimir();
		System.out.println("Desplazar: ");
		c1.desplazar(3, 3);
		c1.imprimir();
		System.out.println("Distancia: "+ Circulo.distancia(c2, c3));
		System.out.println("Se Tocan: "+ Circulo.seTocan(c2, c3));
		System.out.println("Se Tocan 2 : "+ Circulo.seTocan(c5, c2));
		System.out.println("Lo contiene :"+ c2.loContiene(c3));
		System.out.println("Lo contiene 2 :"+ c3.loContiene(c4));
		

		
	}
	
	
	
      
}
