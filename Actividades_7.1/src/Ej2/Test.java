package Ej2;


public class Test {

	public static void main(String[] args) {
		Usuario a = new Usuario(1, "abcd@hotmail.com","cde");
		a.InnumeroMensajes();
		a.DenumeroMensajes();
		a.modifiCorreo();
		Usuario c= new Admins(0,"JAJA@JOJO.com","lel");
		Admins b = (Admins) c;
		b.Ban();
		b.modificarNick();
		Usuario g = new Moderador(0,"JAJA@JOJO.com","lel");
		Moderador p =(Moderador) g;
		p.papeleraInc();
		
	}

}
