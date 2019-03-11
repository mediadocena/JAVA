package Ej7;

import Utiles.Salieri;

public class Asalariado extends Empleado{
	Salieri ex = new Salieri();
	private double salarioSemanal;
	
	Asalariado(String nombre, String apellido, int numeroSS,double salarioSemanal) {
		super(nombre, apellido, numeroSS);
		this.salarioSemanal=salarioSemanal;
		
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	@Override
	public double ingresos() {
		double ingresos= getSalarioSemanal();
		System.out.println("Ingresos:"+getSalarioSemanal()+", "+"A la semana");
		return ingresos;
	}

	public void setSalarioSemanal() {
		System.out.println("Introduzca el salario:");
		this.salarioSemanal = ex.controlapositivo();
	}

}
