package Ej_3;

public abstract class Persona implements Humano {
	
	private String nombre;
	private String apellidos;
	private String nif;
	private String direccion;
	
	Persona(){
		
	}
	Persona(String nombre,String apellidos,String nif,String direccion){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nif=nif;
		this.direccion=direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public abstract String Indentificate();
		
	
	
}
