package Ej7;

public class PorComision extends Empleado{
		
	double ventas;
	double ventab;
	
	PorComision(String nombre, String apellido, int numeroSS,double ventas,double ventab) {
		super(nombre, apellido, numeroSS);
		this.ventas=ventas;
		this.ventab=ventab;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	@Override
	public double ingresos() {
		double total = ventas+ventab;
		return total;
	}
	 
	
}
