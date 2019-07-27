package Agenda;

import Persona.Persona;

public class Agenda {
	
	Persona [] contactos;
	String [] telefonos;
	
	
	
	public Agenda (int tamanio){
		this.contactos=new Persona[tamanio];
		this.telefonos=new String[tamanio];
		
	}

	

		void imprimir(){
			for (int i=0;i<contactos.length;i++){
				if(contactos[i]!=null){
					System.out.print(""+contactos[i].nombre + " "  );
					System.out.print(" fecha_nac: "+ contactos[i].fecha_nacimiento.dia + " " + contactos[i].fecha_nacimiento.mes+" "+contactos[i].fecha_nacimiento.anio );
					System.out.println(" telefono: "+ telefonos[i] + " "  );
				}
			}
		}
		

	void guardar(Persona contacto, String telefono){
		for(int x=0;x<contactos.length;x++){
			if(contactos[x]==null){
				this.contactos[x]=contacto;
				this.telefonos[x]=telefono;
				break;
			}
		}
	}
	
	
	void eliminar(Persona contacto){
		boolean misma=false;
		for (int j=0;j<contactos.length;j++){
			misma=contactos[j].mismaPersona(contacto);
			if(misma==true){
				contactos[j]=null;
				telefonos[j]=null;
				break;
			}
		}
	}
	
	
	

	boolean pertenece(Persona contacto){
		boolean resultado=false;
		int x=0;
		for (x=0;x<contactos.length;x++){
			if(contactos[x]!=null){
				if(contactos[x].equals(contacto)){
					resultado=true;
					break;
				}
			}
		}
		return resultado;
	}
	
	
	

	String dameTelefono(Persona contacto){
		String telefono=" ";
		boolean misma=false;
		boolean misma1=false;
		misma=pertenece(contacto);
			for(int i=0;i<contactos.length;i++){
				misma1=contactos[i].mismaPersona(contacto);
					if(misma==true && misma1==true){
						telefono=telefonos[i];
						break;
					}
		   }
		return telefono;
	   }

		

	
	
	public Persona[] getContactos() {
		return contactos;
	}

	public void setContactos(Persona[] contactos) {
		this.contactos=contactos;
	}

	public String[] getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(String[] telefonos) {
		this.telefonos = telefonos;
	}
	
}

