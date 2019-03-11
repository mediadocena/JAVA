package Ej5;

public class Directivo extends Empleado{
	
	private double sueldo;
	private double comision;
	
	Directivo(String nombre,String dni){
		super(nombre,dni);
	}
	
	public double getSueldo() {
		return sueldo;
	}



	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	public double getComision() {
		return comision;
	}



	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public double calcularSueldo() {
		double calc= sueldo+comision;
		return calc;
	}
	

}
