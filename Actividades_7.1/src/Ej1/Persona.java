package Ej1;

public final class Persona {
	
	private String nombre;
	private String apellidos;
	private String NIF;
	private String Cliente;
	
	Persona(String nombre,String apellidos,String NIF){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.NIF=NIF;
	}
	Persona(){
		
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

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}
	public String toString(){
		return "Nombre:"+getNombre()+"Apellidos:"+getApellidos()+"NIF:"+getNIF();
	}
	
}
