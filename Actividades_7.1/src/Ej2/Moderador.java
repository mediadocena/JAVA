package Ej2;

public final class Moderador extends Usuario {

	private int papelera;
	
	public Moderador(int mensajes, String correo,String nick) {
		super(mensajes,correo,nick);
		this.papelera=0;
		
	}
	
	public void papeleraInc() {
		papelera++;
		System.out.println("Numero de elementos en la papelera:"+papelera);
	}
}
