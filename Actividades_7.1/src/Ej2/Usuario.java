package Ej2;

import Utiles.Salieri;

public  class Usuario {
	Salieri ex = new Salieri();
	private int mensajes;
	private String correo;
	private String nick;
	//Constructor de la clase
	Usuario(int mensajes, String correo,String nick){
		this.mensajes=mensajes;
		this.correo=correo;
		this.nick=nick;
	}
	//Aumenta el numero de mensajes
	public void InnumeroMensajes() {
		mensajes++;
		System.out.println("Numero de mensajes actuales:"+mensajes);
	}
	//Decrementa el numero de mensajes
	public void DenumeroMensajes() {
		mensajes--;
		System.out.println("Numero de mensajes actuales:"+mensajes);
	}
	//Modifica el correo
	public void modifiCorreo() {
		correo = ex.controlaStringSt("Introduce el nuevo correo:");
		System.out.println("Correo:"+correo);
	}

	public int getMensajes() {
		return mensajes;
	}

	public void setMensajes(int mensajes) {
		this.mensajes = mensajes;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
}
