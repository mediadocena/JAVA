package Ej2;

public final class Admins extends Usuario{
	
	int papelera;
	int bans;
	
	public Admins(int mensajes, String correo,String nick) {
		super(mensajes,correo,nick);
		this.papelera=0;
		this.bans=0;
	}
	
	public int getPapelera() {
		return papelera;
	}

	public void setPapelera(int papelera) {
		this.papelera = papelera;
	}

	public int getBans() {
		return bans;
	}

	public void setBans(int bans) {
		this.bans = bans;
	}

	public void modificarNick() {
		setNick(ex.controlaStringSt("Introduzca el nuevo nick:"));
	}
	public void Ban() {
		bans++;
		System.out.println("Numero de baneos"+bans);
	}
}
