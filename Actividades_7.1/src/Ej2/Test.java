package Ej2;


import java.util.ArrayList;

import java.util.List;

import Utiles.Salieri;

public class Test {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		String nick;
		List <Usuario> a =new ArrayList <Usuario>();
		int opcion=ex.controlaenteroSt("Seleccione una opcion:\n1-Añadir usuario\n2-Añadir Moderador\n3-Añadir Administrador\n4-Acceder a una cuenta");
		int contador;
		switch (opcion) {
		case 1:
			nick = ex.controlaStringSt("Introduzca el nick");
			a.add(contador,new Usuario(0,ex.controlaStringSt("Introduzca el correo"),nick),nick);
			contador++;
			break;
		case 2:
			nick = ex.controlaStringSt("Introduzca el nick");
			a.add(contador,new Moderador(0,ex.controlaStringSt("Introduzca el correo"),nick),nick);
			break;
		case 3:
			nick = ex.controlaStringSt("Introduzca el nick");
			a.add(new Admins(0,ex.controlaStringSt("Introduzca el correo"),nick),nick);
			break;
		case 4:
			nick=ex.controlaStringSt("Introduzca el nick de la cuenta");
			for (int i = 0; i < contador; i++) {
				Usuario ur = a.get(i);
				
				if(nick==ur.getNick()) {
					Usuario u = a.get(i);
				}
			}
			System.out.println("Ha accedido a la cuenta, ¿Que desea hacer?");
			System.out.println("1-");
			break;
		default:
			break;
		}
	}

}
