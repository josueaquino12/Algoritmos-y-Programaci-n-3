package Persona;

public class Fecha {

	public int dia;
	public int mes;
	public int anio;

	public Fecha(int d, int m, int a) {

		this.dia = d;
		this.mes = m;
		this.anio = a;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	boolean masJovenQue(Fecha otro) {

		if(this.anio > otro.anio)
		{
			return true;
		}
		else if(this.anio == otro.anio)
		{
			if(this.mes > otro.mes)
			{
				return true;
			}
			else if(this.mes == otro.mes)
			{
				if(this.dia > otro.dia)
				{
					return true;
				}
			}
		}
		
		return false;
	}

	public String toString() {

		return this.dia + " - " + this.mes + " -" + this.anio;

	}

}
