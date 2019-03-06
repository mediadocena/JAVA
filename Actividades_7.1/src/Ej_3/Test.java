package Ej_3;

import java.util.ArrayList;
import java.util.List;

import Utiles.Salieri;

public class Test {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		List <Persona> a = new ArrayList<Persona>();
		int opcion=0;
		int ID=0;
		int despacho=0;
		do {
		System.out.println("Seleccione una opcion:");
		System.out.println("1-Introducir Alumnos");
		System.out.println("2-Introducir Profesores");
		System.out.println("3-Ver informacion");
		System.out.println("4-Salir");
		opcion = ex.controlaentero();
		
		switch (opcion) {
		case 1:
			a.add(ID, new Estudiante(ID,ex.controlaStringSt("Introduzca el nombre:"),ex.controlaStringSt("Introduzca los apellidos:"),ex.controlaStringSt("Introduzca el nif:"),ex.controlaStringSt("Introduzca la direccion:")));
			ID++;
			break;
		case 2:
			a.add(despacho, new Profesor(despacho,ex.controlaStringSt("Introduzca el nombre:"),ex.controlaStringSt("Introduzca los apellidos:"),ex.controlaStringSt("Introduzca el nif:"),ex.controlaStringSt("Introduzca la direccion:")));
			despacho++;
			break;
		case 3:
			for (int j = 0; j < a.size(); j++) {
				Persona c = a.get(j);
				System.out.println(c.toString()+"\n");
			}
			break;
		case 4:
			System.out.println("Saliendo...");
			break;
		default:
			break;
		}
		}while(opcion!=4);
	}

}
