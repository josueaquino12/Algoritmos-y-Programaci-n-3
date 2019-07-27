package Persona;



public class pMain {

	public static void main(String[] args) {
		
      Fecha f = new Fecha(2,3,1995);	
      Fecha f2 = new Fecha(1,2,1997);
      Fecha f3 = new Fecha(1,2,1994);
      Fecha f4 = new Fecha(1,2,1998);
      Fecha f5 = new Fecha(1,2,1992);
      Fecha f6 = new Fecha(1,2,1996);
		
		Persona p = new Persona("Julio", f);
		Persona p2 = new Persona("Josué", f2) ;
		Persona p3 = new Persona("Julio", f2);
		Persona p4 = new Persona("Julio", f);
		
		Persona p5 = new Persona ("Franco", f3);
		
		Persona p6 = new Persona ("Valentin", f4);
		Persona p7 = new Persona ("Fabian", f5);
		Persona p8 = new Persona ("Noelia", f6);
		
		System.out.println("Mas Joven: "+ p.masJovenQue(p2));
		System.out.println("Mas Joven 2: "+ p2.masJovenQue(p));
		
		System.out.println("Tocayo: "+ p.tocayo(p2));
		System.out.println("Tocayo 2: "+ p3.tocayo(p));
		
		System.out.println("Misma Persona: "+ p.mismaPersona(p3));
		System.out.println("Misma Persona 2: "+ p.mismaPersona(p4));
		
		/*--------------------------------------------------*/
		
		
		Persona [] grupo = new Persona [6];
		
		grupo[0] = p;
		grupo[1] = p2;
		grupo[2] = p5;
		grupo[3] = p6;
		grupo[4] = p7;
		grupo[5] = p8;
		
		System.out.println("Persona mas joven: "+ Persona.masJoven(grupo));
		
		System.out.println("Persona a buscar: "+ Persona.buscar(grupo, "José"));
		System.out.println("Persona a buscar 2 :"+ Persona.buscar(grupo, "Franco"));
		
		
	}
}
