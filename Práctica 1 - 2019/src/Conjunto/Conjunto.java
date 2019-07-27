package Conjunto;



public class Conjunto {
	
	int[] elementos;
	int cantidad;
	
	Conjunto(){
			
		this.elementos=new int[20];
		
		
	}
	
	
	
	void agregar(int n){
	boolean p=pertenece(n);	
	if (p==false ){
		if(elementos[cantidad]!=0){
			this.cantidad=this.cantidad+1;
			this.elementos[cantidad]=n;
		}
		else{
			this.elementos[cantidad]=n;
		}
	}
	}
	
	
	void imprimir(){
		for(int x=0;x<=cantidad;x++){
			System.out.print(elementos[x]+" ");
		}
		System.out.println("");
	}
	
	
	boolean pertenece(int n){
		for (int x=0; x<=cantidad;x++){
			if(elementos[x]==n){
				return true;
			}
		}
		return false;
	}
	
	
	
	
	void quitar(int n){
		boolean p=pertenece(n);
		int eliminar=0;
		int x=0;
		for (x=0; x<elementos.length;x++){
			if (p==true && elementos[x]==n){
				eliminar=x;
			}	
		}
		for(x=0;x<eliminar;x++){
			if(elementos[x]!=0){
				this.elementos[x]=elementos[x];	
			}
		}
		for(x=eliminar;x<elementos.length-1;x++){
			if(elementos[x]!=0){
				this.elementos[x]=elementos[x+1];	
			}
		}		
		this.cantidad=cantidad-1;
	}
	
	
	
	
	

	static Conjunto union(Conjunto c1, Conjunto c2){
		int x=0;int i=0;
		Conjunto contmp=new Conjunto();
		int tam=c1.cantidad+c2.cantidad+2;
		int temp[]=new int[tam+1];
		contmp.cantidad=c1.cantidad+c2.cantidad+1;
		for(x=0;x<=tam;x++){
			if(x<=c1.cantidad){
				temp[x]=c1.elementos[x];
			}
				
			if(x>c1.cantidad && i<tam){
				 temp[x]=c2.elementos[i];
				 i=i+1;	
			}
		}
		contmp.setElementos(temp);
		contmp.repetido(contmp);
	return contmp;
	}
	
	
	
	

	static Conjunto interseccion(Conjunto c1, Conjunto c2){
		int x=0;int cont=-1;int i=0;
		Conjunto contmp=new Conjunto();
		
		int tam=c1.cantidad+c2.cantidad+1;
		int temp[]=new int[tam+1];
		for(x=0;x<=c1.cantidad;x++){
			for(i=0;i<=c2.cantidad;i++){
				if(c1.elementos[x]==c2.elementos[i]){
					cont=cont+1;
					temp[cont]=c2.elementos[i];
				}
			}
		}
		contmp.setElementos(temp);
		contmp.cantidad=cont;
	return contmp;
	}
	
	

	static Conjunto resta(Conjunto c1, Conjunto c2){
		int x=0;int i=0;
		Conjunto contmp=new Conjunto();
		contmp=c1;
		for(x=0;x<=contmp.cantidad;x++){
			for(i=0;i<c2.cantidad;i++){
				if(contmp.elementos[x]==c2.elementos[i]){
					contmp.quitar(contmp.elementos[x]);
					contmp.quitar(c2.elementos[i]);
				}
			}
		}
	return contmp;	
	}
	
	
	
	
	void restar(Conjunto c){
	
		Conjunto.resta(this, c);
	}
	
	
	
	private void repetido(Conjunto c){
		int i=0;int x=0;
		for (x=0;x<c.cantidad;x++){
			for(i=x+1;i<=c.cantidad;i++){
				if (c.elementos[x]==c.elementos[i]){
					quitar(c.elementos[i]);
					break;
				}
			}
		}	
	}
	
	
	
	
	
	
	
	public int[] getElementos() {
		return elementos;
	}

	public void setElementos(int[] elementos) {
		this.elementos = elementos;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
