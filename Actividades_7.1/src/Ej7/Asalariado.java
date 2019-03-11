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
	public void ingresos() {
		System.out.println("Ingresos:"+getSalarioSemanal()+", "+"A la semana");
		
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = ex.controlapositivo();
	}

}
