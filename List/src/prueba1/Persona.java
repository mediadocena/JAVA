package prueba1;

public class Persona{
	
	private int idPersona;
	private String nombre;
	private int altura;

	public Persona(int idPersona, String nombre, int altura) {
		
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
}
@Override
	public String toString() {
	return "Persona-> ID: "+idPersona+" Nombre: "+nombre+" Altura:"+altura+"\n";
	}
	public int getIdPersona() {
	return idPersona;
}
	 String getNombre() {
	return nombre;
}
	int getAltura() {
	return altura;
}
}
