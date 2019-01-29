package lista_personas;

public class Persona {
	
	public int idPersona;
	public String nombre;
	public int altura;
	
	public Persona(int idPersona,String nombre,int altura) {
		this.idPersona = idPersona;
		this.nombre=nombre;
		this.altura=altura;
	}
	
	public String toString() {
		return "Persona-> ID:"+idPersona+"Nombre:"+nombre+"Altura:"+altura+"\n"; 
	}
}
