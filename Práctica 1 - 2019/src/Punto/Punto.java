package Punto;

public class Punto {
	public double x;
	public double y;

	public Punto(double x, double y) {

		this.x = x;
		this.y = y;
	}
	
	
	public Punto() {
		// TODO Auto-generated constructor stub
	}


	void imprimir() {
		System.out.println("x: "+this.x +" y: "+this.y);
	}
	
	void desplazar(double x , double y) {
		
		this.x+= x;
		this.y+= y;
		
	}
	
	
	public static double distancia(Punto p1, Punto p2) {
		
		double dx = p2.x - p1.x;
		double dy = p2.y - p1.y;

		double resul = Math.sqrt(dx * dx + dy * dy);

		return resul;
		
	}

}
