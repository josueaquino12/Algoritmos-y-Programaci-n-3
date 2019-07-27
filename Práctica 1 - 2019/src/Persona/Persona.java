package Persona;

public class Persona {

	public String nombre;
	public Fecha fecha_nacimiento;

	public Persona(String nombre, Fecha fecha_nac) {
		super();
		this.nombre = nombre;
		this.fecha_nacimiento = new Fecha(fecha_nac.dia, fecha_nac.mes, fecha_nac.anio);
	}

	boolean masJovenQue(Persona otro) {

		return this.fecha_nacimiento.masJovenQue(otro.fecha_nacimiento);

	}

	boolean tocayo(Persona otro) {

		if (this.nombre.equals(otro.nombre))
			return true;
		else
			return false;

	}

	public boolean mismaPersona(Persona otro) {

		if (this.nombre.equals(otro.nombre) && this.fecha_nacimiento.anio == otro.fecha_nacimiento.anio
				&& this.fecha_nacimiento.mes == otro.fecha_nacimiento.mes
				&& this.fecha_nacimiento.dia == otro.fecha_nacimiento.dia)
			return true;
		else
			return false;

	}

	static Persona masJoven(Persona[] grupo) {

		Persona joven = null;

		for (int i = 0; i < grupo.length; i++) {

			for (int j = i + 1; j < grupo.length; j++) {

				if (grupo[i].masJovenQue(grupo[j]))

					joven = grupo[i];

			}
		}

		return joven;

	}

	static Persona buscar(Persona[] grupo, String nombre) {

		

		for (int i = 0; i < grupo.length; i++) {

			if (grupo[i].nombre.equals(nombre)) 

				return grupo[i];

		}

		return null;
	}

	public String toString() {

		return this.nombre + " " + this.fecha_nacimiento;
	}

}
