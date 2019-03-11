package Ej_3;

public class Profesor extends Persona{
	
	private int despacho;
	
	Profesor(){
		
	}
	
	Profesor(int despacho,String nombre,String apellidos,String nif,String direccion){
		super(nombre,apellidos,nif,direccion);
		this.despacho=despacho;
	}
	public int getDespacho() {
		return despacho;
	}
	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}
	
	
	@Override
	public String toString() {
		return "despacho=" + despacho + " "+"Tipo:"+" "+Indentificate();
	}
	@Override
	public String Indentificate() {
		return "Profesor";
		
	}
	
	
	
}
