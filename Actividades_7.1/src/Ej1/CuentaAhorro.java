package Ej1;

import Utiles.Salieri;

public final class CuentaAhorro extends Cuenta {
	Salieri ex = new Salieri();
	private double interesv;
	private double saldom=100;
	Persona cliente = new Persona();
	CuentaAhorro(long numerocuenta, Persona cliente) {
		super(numerocuenta, cliente);
		this.cliente=cliente;
		setSaldo(100);
	}

	public double getSaldom() {
		return saldom;
	}

	public void setSaldom(double saldom) {
		this.saldom = saldom;
	}

	@Override
	public double retirar(double retirar) {
		double a=getSaldo()-retirar;
		if(a>=saldom) {
			
			setSaldo(a);
		}
		else {
			System.out.println("No es posible retirar mas cantidad que el mínimo");
		}
		return getSaldo();
	}

	@Override
	public void actualizar() {
		System.out.println("Introduzca el interes variable:");
		interesv=ex.controladouble();
		double intereses = getSaldo()/100*interesv;
		setSaldo(getSaldo()+intereses);
		
	}
	
	@Override
	public String toString() {
		cliente.toString();
		return "Cuenta ahorro:\n"+"----------------- \n"+"Nº Cuenta:"+" "+getNumerocuenta()+"\n Saldo:"+" "+getSaldo()+" "+"Saldo minimo:"+getSaldom();
	}
	 
}
