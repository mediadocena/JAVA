package Ej4;

public abstract class Empleado {
	
	String nombre;
	String dni;
	
	Empleado(String nombre,String dni){
		this.dni=dni;
		this.nombre=nombre;
	}
	
	abstract public void calcularSueldo();
	
}
