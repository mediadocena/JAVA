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
	public void ingresos() {
		
		
	}

	public double getSueldoHora() {
		return sueldoHora;
	}

	public void setSueldoHora(double sueldoHora) {
		this.sueldoHora = sueldoHora;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}


}
