package Ej7;

public class BaseMasComision extends Empleado{
	
	double ventasb;
	double tarifa;
	double salariob;
	
	BaseMasComision(String nombre, String apellido, int numeroSS,double ventasb,double tarifa, double salariob) {
		super(nombre, apellido, numeroSS);
		this.salariob=salariob;
		this.tarifa=tarifa;
		this.ventasb=ventasb;
	}

	@Override
	public double ingresos() {
		double total = (tarifa*ventasb)+salariob;
		return total;
	}

	public double getVentasb() {
		return ventasb;
	}

	public void setVentasb(double ventasb) {
		this.ventasb = ventasb;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getSalariob() {
		return salariob;
	}

	public void setSalariob(double salariob) {
		this.salariob = salariob;
	}
	

}
