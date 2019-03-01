package Ej_3;

public class Profesor extends Persona{
	
	String despacho;
	
	Profesor(){
		
	}
	Profesor(String despacho){
		
	}
	public String getDespacho() {
		return despacho;
	}
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	
	
	@Override
	public String toString() {
		return "Profesor despacho=" + despacho + " "+"Tipo:"+" "+"Profesor";
	}
	@Override
	public void Indentificate() {
		toString();
		
	}
	
	
	
}
