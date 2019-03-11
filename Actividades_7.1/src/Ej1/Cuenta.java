package Ej1;
//Método abstracto Para las cuentas 
public abstract class Cuenta {
	
		private long numerocuenta;
		private double saldo;
		Persona cliente = new Persona();
		//Constructor de la clase
		Cuenta(long numerocuenta,Persona cliente){
		this.cliente=cliente;
		this.numerocuenta=numerocuenta;
		}
		
		/**
		 * Método para ingresar dinero a la cuenta
		 * @param ingreso
		 * @return
		 */
		public double Ingresar(double ingreso) {
			this.saldo=+ingreso;
			return saldo;
		}
		//Métodos abstractos
		abstract double retirar(double saldo);
		
		abstract void actualizar();
		
	
		/**
		 * 
		 * @return numerocuenta
		 */
		public long getNumerocuenta() {
			return numerocuenta;
		}
		/**
		 * 
		 * @param numerocuenta
		 */
		public void setNumerocuenta(long numerocuenta) {
			this.numerocuenta = numerocuenta;
		}
		/**
		 * 
		 * @return saldo
		 */
		public double getSaldo() {
			return saldo;
		}
		/**
		 * 
		 * @param saldo
		 */
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		/**
		 * 
		 * @return cliente
		 */
		public Persona getCliente() {
			return cliente;
		}
		/**
		 * 
		 * @param cliente
		 */
		public void setCliente(Persona cliente) {
			this.cliente = cliente;
		}
		
}
