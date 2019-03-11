package Ej7;

import Utiles.Salieri;

public class PorHoras extends Empleado {
	Salieri ex = new Salieri();
	private double sueldoHora;
	private double horas;
	
	PorHoras(String nombre, String apellido, int numeroSS,double sueldoHora,double horas) {
		super(nombre, apellido, numeroSS);
		this.sueldoHora=this.sueldoHora;
		this.horas=this.horas;
	}
	
	@Override
	public double ingresos() {
		double ingresos=0;
		if(horas<=40) {
		 ingresos= sueldoHora*horas;
		}else if(horas>40) {
			double horamas= horas-40;
			ingresos= (sueldoHora*40)*horamas;
		}
		System.out.println("Ingresos empleado por horas:"+ingresos);
		return ingresos;
	}

	public double getSueldoHora() {
		return sueldoHora;
	}

	public void setSueldoHora() {
		System.out.println("Introduzca el sueldo:");
		this.sueldoHora = ex.controlapositivo();
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		if(horas>=0 && horas<=168) {
		this.horas = horas;
		}else {
			System.out.println("Hora no válida, el valor debe estar entre 0 y 168");
		}
	}
	@Override
	public String toString() {
		return "Nombre"+":"+" "+getNombre()+","+"Apellido:"+" "+getApellido()+","+"Numero Seguro Social:"+" "+getNumeroSS()+", "+"Sueldo por horas"+" "+getSueldoHora()+", "+"Horas:"+" "+getHoras();
		
	}

}
