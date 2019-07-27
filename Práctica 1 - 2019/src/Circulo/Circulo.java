package Circulo;


import Punto.Punto;

public class Circulo {

	
	double radio;
	Punto centro;
	
	
	public Circulo(double centro_x, double centro_y, double radio) {
		
		this.centro = new Punto (centro_x,centro_y);
		this.radio = radio;
		
	}
	
	void imprimir() {
		
		System.out.println("Centro: x: "+this.centro.x+" y: "+this.centro.y+" Radio: "+this.radio);
	}
	
	double perimetro() {
		double perimetro = 2 * Math.PI * this.radio;
		return perimetro;
	}

	double superficie() {

		double superficie = Math.PI * Math.pow(this.radio, 2);
		return superficie;

	}
	
	void escalar(double factor) {

		this.radio = this.radio + factor;

	}

	void desplazar(double desp_x, double desp_y) {

		this.centro.x += desp_x;
		this.centro.y += desp_y;

	}

	static double distancia(Circulo c1, Circulo c2) {
		double dx = Math.pow(c2.centro.x - c1.centro.x, 2);
		double dy = Math.pow(c2.centro.y - c1.centro.y, 2);
		double distancia = Math.sqrt(dx + dy) - c1.radio - c2.radio;
		return distancia;
	}
	
	static boolean seTocan (Circulo c1, Circulo c2) {
		
		if(Circulo.distancia(c1, c2)<=0.0)
			return true;
		else
			return false;
		
	}
	
	
    boolean loContiene (Circulo otro) {
		
		if(this.radio>= Punto.distancia(this.centro, otro.centro) + otro.radio)
			return true;
		else
			return false;
		
	}
}
