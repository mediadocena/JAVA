package Ej1;

import Utiles.Salieri;

public final class CuentaAhorro extends Cuenta {
	Salieri ex = new Salieri();
	private double interesv;
	private double saldom=100;
	Persona cliente = new Persona();
	//Constructor de la clase 
	CuentaAhorro(long numerocuenta, Persona cliente) {
		super(numerocuenta, cliente);
		this.cliente=cliente;
		setSaldo(100);
	}
	/**
	 * 
	 * @return
	 */
	public double getSaldom() {
		return saldom;
	}
	/**
	 * 
	 * @param saldom
	 */
	public void setSaldom(double saldom) {
		this.saldom = saldom;
	}
	/**
	 * Retira el saldo de la cuenta
	 * @param retirar
	 */
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
	/**
	 * Actualiza el saldo de la cuenta
	 */
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
