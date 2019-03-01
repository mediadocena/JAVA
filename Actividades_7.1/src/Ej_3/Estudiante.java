package Ej_3;

public class Estudiante extends Persona {
	
	int ID;
	
	Estudiante(){
		
	}
	
	Estudiante(int ID,String nombre,String apellidos,String nif,String direccion){
		super(nombre,apellidos,nif,direccion);
		this.ID=ID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
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
