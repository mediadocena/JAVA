package Ej1;

public abstract class Cuenta {

		private long numerocuenta;
		private double saldo;
		Persona cliente = new Persona();
		
		Cuenta(long numerocuenta,Persona cliente){
		this.cliente=cliente;
		this.numerocuenta=numerocuenta;
		}
		
		
		public double Ingresar(double ingreso) {
			this.saldo=+ingreso;
			return saldo;
		}
		
		abstract double retirar(double saldo);
		abstract void actualizar();
		
	

		public long getNumerocuenta() {
			return numerocuenta;
		}

		public void setNumerocuenta(long numerocuenta) {
			this.numerocuenta = numerocuenta;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public Persona getCliente() {
			return cliente;
		}

		public void setCliente(Persona cliente) {
			this.cliente = cliente;
		}
		
}
