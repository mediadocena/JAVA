package Ej1;

public final class CuentaCorriente extends Cuenta{
	
	private double interes=1.5;
	Persona cliente = new Persona();
	//Constructor de la clase 
	CuentaCorriente(long numerocuenta,Persona cliente){
		super(numerocuenta,cliente);
		this.cliente=cliente;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getInteres() {
		return interes;
	}

	/**
	 * 
	 * @param interes
	 */
	public void setInteres(double interes) {
		this.interes = interes;
	}


	@Override
	public double retirar(double saldo) {
		
		return 0;
	}
	/**
	 * Actualiza el saldo de la cuenta
	 */
	@Override
	public void actualizar() {
		double intereses = getSaldo()/100*interes;
		setSaldo(getSaldo()+intereses);
	}
	
	@Override
	public String toString() {
		System.out.println(cliente.toString());
		return "Cuenta corriente:\n"+"----------------- \n"+"N� Cuenta:"+" "+getNumerocuenta()+"\n Saldo:"+" "+getSaldo()+"\n Interes:"+" "+getInteres();
	}
	
}
