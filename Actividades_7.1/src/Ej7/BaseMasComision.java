package Ej7;

public class BaseMasComision extends PorComision{
	
	

	double ventab;
	double tarifa;
	double salariob;
	
	BaseMasComision(String nombre, String apellido, int numeroSS, double ventas, double salariob,double tarifa) {
		super(nombre, apellido, numeroSS, ventas, salariob);
		this.salariob=salariob;
		this.tarifa=tarifa;
	}
	
	//metodo para calcular el sueldo total
	@Override
	public double ingresos() {
		double total = (tarifa*ventas)+salariob;
		return total;
	}

	public double getSalariob() {
		return salariob;
	}

	public void setVentasb(double ventas) {
		this.salariob = ventas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public void setSalariob(double salariob) {
		this.salariob = salariob;
	}
	public String toString() {
		return "Nombre"+":"+" "+getNombre()+","+"Apellido:"+" "+
	getApellido()+","+"Numero Seguro Social:"+" "+getNumeroSS()+
	", "+"Ventas:"+" "+getVentas()+" salario base: "+getSalariob()+" Tarifa: "+getTarifa();
		
	}

}
