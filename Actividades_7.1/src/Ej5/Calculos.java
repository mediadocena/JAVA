package Ej5;

import Utiles.Salieri;

public interface Calculos {
	Salieri ex = new Salieri();
	public double calcularSueldo();
	/**
	 * Calcular la retencion 
	 * @return
	 */
	public default double retencion() {
		double porcentaje=0;
		double sueldob = calcularSueldo();
		if(sueldob<1000) {
			porcentaje=12;
			
		}else if (sueldob>=1000 && sueldob<2500) {
			porcentaje=15;
			
		} else if(sueldob>=1500 && sueldob<2500){
			porcentaje=18;
			
		}else if(sueldob>=2500) {
			porcentaje=20;
			
		}
		return porcentaje;
	}
		public default double gratificacion(int nhijos) {
			int n=nhijos;
			double gratificacion=0;
			if(n==0) {
				System.out.println("Sin gratificacion");
			}else if(n>=1&&n<=3) {
				gratificacion=200;
			}else if(n>3) {
				gratificacion=300;
			}
			
			return gratificacion;
		}
		
		
		public default double calcular() {
			double sueldo = calcularSueldo();
			double retencion = (retencion()*sueldo)/100;
			double total = sueldo-retencion;
		
			
			return total;
		}
	
}
