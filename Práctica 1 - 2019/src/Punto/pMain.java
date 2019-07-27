package Punto;

public class pMain {

	public static void main(String[] args) {
		
		
		Punto p = new Punto (5,3);
		
		Punto p1 = new Punto (3,2);
		Punto p2 = new Punto (7,8);
		
		p.imprimir();
		
		p.desplazar(1,1);
		
		p.imprimir();
		
		System.out.println("Distancia:----->" + Punto.distancia(p1, p2));;
		
		
		
		
	}
}
