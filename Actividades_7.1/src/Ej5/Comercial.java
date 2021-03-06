package Ej5;

public class Comercial extends Empleado{
	
	private double sueldo;
	private double importe;
	
	Comercial(String nombre,String dni){
		super(nombre,dni);
	}
//Metodo que calcula el sueldo a aplicar a un comercial
	@Override
	public double calcularSueldo() {
		double a = sueldo+comisionCobrar();
		
		return a;
	}
	//Metodo que realiza la comision de el comercial
	public double comisionCobrar() {
		double comision=(importe*10)/100;
		return comision;
	}

	public double getSueldo() {
		return sueldo;
	}

	public double getImporte() {
		return importe;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
}
