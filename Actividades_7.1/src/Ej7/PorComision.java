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
	
	public double getVentab() {
		return ventab;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	@Override
	public double ingresos() {
		double total = ventas+ventab;
		return total;
	}
	public String toString() {
		return "Nombre"+":"+" "+getNombre()+","+"Apellido:"+
	" "+getApellido()+","+"Numero Seguro Social:"+
				" "+getNumeroSS()+", "+"Ventas: "+getVentas()+" Ventas brutas: "+getVentab();
		
	}
	
}
