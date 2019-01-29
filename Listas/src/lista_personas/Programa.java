package lista_personas;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import Utiles.Salieri;

public class Programa {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		List<Persona>Lp=new ArrayList<Persona>();
		Random r = new Random();
		Persona temp = null;
		int sumaaltura = 0;
		int opcion=0;
		do {
		System.out.println("Seleccione una opcion:");
		System.out.println("1-Añadir personas");
		System.out.println("2-Ver la media de alturas:");
		System.out.println("3-Salir");
		opcion = ex.controlaentero();
		switch(opcion) {
		case 1:
		for(int i =0;i<1000;i++) {
			Lp.add(new Persona(i,"Persona"+i,r.nextInt(100)+100));
			}
			Iterator<Persona> it=Lp.iterator();
			while(it.hasNext()){
				temp = it.next();
				System.out.println(temp);
				sumaaltura+=temp.altura;
			}
			break;
		case 2:
		System.out.println("La media de altura del conjunto de Personas es:"+sumaaltura/Lp.size());
		break;
		case 3:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("Opcion no válida.");
			break;
		}
		}while(opcion!=3);
	
	}

}
