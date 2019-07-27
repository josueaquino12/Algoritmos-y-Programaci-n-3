package Conjunto;

public class cMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=20;
		Conjunto conjun=new Conjunto();
		Conjunto conjun2=new Conjunto();		
		int c1[]=new int[tam];
		
		c1[0]=1;
		c1[1]=2;
		c1[2]=4;
		c1[3]=6;
		c1[4]=8;
		conjun.setElementos(c1);
		conjun.cantidad=4;
		
		
		System.out.println("");
		System.out.println("impresion del conjunto c1");
		conjun.imprimir();
		
		System.out.println();
		System.out.println("el Nº pertenece al conjunto c1? = "+conjun.pertenece(3));
		
		System.out.println("");
		System.out.println("Quitando el 6 e impresion de conjunto c1");
		conjun.quitar(6);
		conjun.imprimir();
		
		System.out.println("");
		System.out.println("agregando el 23 e impresion del conjunto c1");
		conjun.agregar(23);
		conjun.imprimir();
		
		System.out.println("");
		System.out.println("creando conjunto c2 ");
		conjun2.imprimir();
		
		System.out.println("");
		System.out.println("Agregando elementos al conjunto c2 e impresion");
		conjun2.agregar(2);
		conjun2.agregar(91);
		conjun2.agregar(4);
		conjun2.agregar(8);
		conjun2.agregar(93);
		conjun2.agregar(1);
		conjun2.imprimir();
		
		System.out.println("");
		System.out.println("Union de conjunto c1 y c2");
		Conjunto conjuntemp=new Conjunto();
		conjuntemp=Conjunto.union(conjun, conjun2);
		conjuntemp.imprimir();
		
		System.out.println("");
		System.out.println("interseccion de conjunto c1 y c2");
		conjuntemp=Conjunto.interseccion(conjun, conjun2);
		conjuntemp.imprimir();
		
		System.out.println("");
		System.out.println("resta de c1-c2 e impresion");
		conjuntemp=Conjunto.resta(conjun, conjun2);
		conjuntemp.imprimir();
		
		System.out.println("");
		System.out.println("restar conjunto pasado por parametro e impresion");
		conjun.agregar(75);
		conjun.setElementos(c1);
		conjun.restar(conjun2);
		conjun.imprimir();
		
		
	}
}
