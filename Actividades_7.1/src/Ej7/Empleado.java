package Ej7;

public abstract class Empleado {
	
	private String nombre;
	private String apellido;
	private int numeroSS;
	
	Empleado(String nombre,String apellido,int numeroSS){
		this.apellido=apellido;
		this.nombre=nombre;
		this.numeroSS=numeroSS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellidos) {
		this.apellido = apellidos;
	}

	public int getNumeroSS() {
		return numeroSS;
	}

	public void setNumeroSS(int numeroSS) {
		this.numeroSS = numeroSS;
	}
	@Override
	public String toString() {
		return "Nombre"+":"+" "+getNombre()+","+"Apellido:"+" "+getApellido()+","+"Numero Seguro Social:"+" "+getNumeroSS();
		
	}
	public abstract void ingresos();
	
	
}
