package Ej_3;

public class Estudiante extends Persona {
	
	String ID;
	
	Estudiante(){
		
	}
	
	Estudiante(String ID){
		
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	@Override
	public String toString() {
		
		
		return"ID:"+ID+" "+"Tipo:"+" "+"Estudiante";
		
	}

	@Override
	public void Indentificate() {
		
		toString();
	}
	
	
	
}
