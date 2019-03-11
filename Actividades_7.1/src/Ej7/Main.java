package Ej7;


import java.util.ArrayList;

import Utiles.Salieri;



public class Main {

	public static void main(String[] args) {
			Salieri ex = new Salieri();
		ArrayList<Empleado> a=new ArrayList<Empleado>();
		int opcion =0;
		int contador=0;
		do {
		System.out.println("1-Añadir Asalariado");
		System.out.println("2-Añadir Empleado por comision");
		System.out.println("3-Añadir Empleado por horas");
		System.out.println("4-Añadir Empleado base mas comision");
		System.out.println("5-Buscar Empleado");
		System.out.println("6-Salir");
		opcion = ex.controlaentero();
		switch (opcion) {
		case 1:
			a.add(contador,new Asalariado("Antonio","Jues",contador,1200));
			contador++;
			break;
		case 2:
			a.add(contador,new PorComision("Antonia","Jues",contador,1200,300));
			contador++;
			break;
		case 3:
			a.add(contador,new PorHoras("Antonia","Jues",contador,1200,40));
			contador++;
			break;
		case 4:
			a.add(contador,new BaseMasComision("Antonia","Jues",contador,1200,300,150));
			break;
		case 5:
			int ss = ex.controlaenteroSt("Introduzca el numero de la SS del empleado a buscar");
			for (Empleado empleado : a) {
				if (empleado.getNumeroSS()==ss) {
					 Empleado e =a.get(ss);
					 if (e instanceof Asalariado) {
						 ((Asalariado) e).ingresos();
						((Asalariado) e).setSalarioSemanal();
						System.out.println(((Asalariado) e).toString());
					}else if(e instanceof PorComision) {
						((PorComision) e).ingresos();
						((PorComision) e).setVentas(ex.controladoubleSt("Introduzca las ventas:"));
						System.out.println(((PorComision) e).toString());
					}else if(e instanceof PorHoras) {
						((PorHoras) e).ingresos();
						((PorHoras) e).setHoras(ex.controladoubleSt("Introduzca las horas"));
						((PorHoras) e).setSueldoHora();
						System.out.println(((PorHoras) e).toString());
					}else if(e instanceof BaseMasComision) {
						((BaseMasComision) e).ingresos();
						((BaseMasComision) e).setTarifa(ex.controladoubleSt("Introduzca la tarifa"));
						((BaseMasComision) e).setVentas(ex.controladoubleSt("Introduzca las ventas"));
						((BaseMasComision) e).setSalariob(ex.controladoubleSt("Introduzca el salario base"));
						((BaseMasComision) e).setVentasb(ex.controladoubleSt("Introduzca las ventas brutas"));
						System.out.println(((BaseMasComision) e).toString());
					}
				}
			}
			break;
		default:
			break;
		}
		
		}while(opcion!=6);
		
	}
}
	

