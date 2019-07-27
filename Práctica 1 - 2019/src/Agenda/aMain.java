package Agenda;


import Persona.Fecha;
import Persona.Persona;

public class aMain {
	public static void main(String[] args) {

		
		
		int tam=10;
		boolean busqueda;
		Agenda agenda0=new Agenda(tam);
		Persona grupo[] = new Persona[tam];
		String tel[]=new String[tam];
		
		Fecha fe0=new Fecha(18,10,86);
		grupo [0]=new Persona("gaston",fe0);
		tel[0]="011-0000-0000";
		Fecha fe1=new Fecha(19,12,85);
		grupo[1]=new Persona("josue",fe1);
		tel[1]="011-0000-0001";
		Fecha fe2=new Fecha(20,11,86);
		grupo[2]=new Persona("carlos",fe2);
		tel[2]="011-0000-0002";
		Fecha fe3=new Fecha(20,11,86);
		Persona otrocontacto=new Persona("carlos",fe2);
		String otrotel="011-0000-0003";
		Persona buscarpersona=new Persona("haston",fe0);
		
		
		
		
				
		agenda0.setContactos(grupo);
		agenda0.setTelefonos(tel);
		
		agenda0.guardar(otrocontacto, otrotel);
		
		agenda0.eliminar(otrocontacto);
		agenda0.imprimir();
		
		
		
		busqueda=agenda0.pertenece(buscarpersona);
		System.out.println(" pertenece a agenda? = "+busqueda);
		
		
		
		
		System.out.println();
		
		System.out.println("telefono de contacto: " + grupo[1].nombre+ " telefono: "   +  agenda0.dameTelefono(grupo[1])  );
		
		
	}
}
