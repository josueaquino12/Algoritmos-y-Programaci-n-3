package Fraccion;

public class fMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraccion f = new Fraccion(8,4);
		Fraccion f2 = new Fraccion(6,4);
		Fraccion f3 = new Fraccion(12,6);
		System.out.println("Imprimir------>");
		f.imprimir();
		
		System.out.println("Invertir Signo------>");
		f.invertirSigno();
		f.imprimir();
		
		System.out.println("Invertir ------>");
		f.invertir();
		
		System.out.println("Double--------->"+ f.dDouble());
		
		System.out.println("Producto------->"+f2.numerador+"/"+f2.denominador+" * "+f3.numerador+"/"+f3.denominador+" = "+ Fraccion.producto(f2, f3));
		System.out.println("Sumar---->"+f2.numerador+"/"+f2.denominador+" + "+f3.numerador+"/"+f3.denominador+" = "+ Fraccion.sumar(f2, f3));

	}

}
