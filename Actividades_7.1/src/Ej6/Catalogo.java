package Ej6;

import java.util.ArrayList;

import Utiles.Salieri;

public class Catalogo {
	Salieri ex = new Salieri();
	ArrayList<Obras> a = new ArrayList<Obras>(10);
	
	public void anñadeObra() {
		int opcion=0;
		int inventario=0;
		
		System.out.println("¿Que tipo de obra desea introducir?");
		System.out.println("1-Escultura");
		System.out.println("2-pintura");
		opcion=ex.controlaentero();
		switch (opcion) {
		case 1:
			
			a.add(inventario,new Esculturas(ex.controlaStringSt("Titulo:"),inventario,ex.controlaStringSt("Autor:"),ex.controlaenteroSt("Año:"),ex.controlaStringSt("Material:"),ex.controladoubleSt("Altura:")));
			System.out.println("La obra se ha añadido con éxito");
			inventario++;
			break;
		case 2:
			a.add(inventario,new Pinturas(ex.controlaStringSt("Titulo:"),inventario,ex.controlaStringSt("Autor:"),ex.controlaenteroSt("Año:"),ex.controladoubleSt("Ancho:"),ex.controladoubleSt("Alto:"),ex.controlaStringSt("Soporte")));
			System.out.println("La obra se ha añadido con éxito");
			inventario++;
			break;
		default:
			System.out.println("Opcion no válida");
			break;
		}
		
		
	}
	public void eliminaObra(int inventario) {
		try {
		for (Obras obras : a) {
			if(obras.getInventario()==inventario) {
				a.remove(inventario);
				System.out.println("La obra se ha eliminado");
			}else if(a.get(inventario)==null) {
				System.out.println("La obra no fué encontrada");
			}
		}
		}catch(IndexOutOfBoundsException p) {
			System.out.println("No se ha encontrado el numero de inventario");
		}
		
		
	}
	public void buscarObra(int inventario) {
		try {
		for (Obras obras : a) {
			if(obras.getInventario()==inventario) {
				Obras o= a.get(inventario);
				System.out.println("Obra encontrada:"+" "+o.toString());
			}else if(a.get(inventario)==null) {
				System.out.println("La obra no fué encontrada");
			}
		}
		}catch(IndexOutOfBoundsException p) {
			System.out.println("No se ha encontrado el numero de inventario");
		}
		
		
	}
	public double Superficie() {
		double alt=0;
		double an=0;
		double superficie=0;
		for (Obras obras : a) {
			 if(obras instanceof Pinturas) {
				Pinturas r= (Pinturas) obras;
				alt+=r.getAlto();
				an+=r.getAncho();
			}
		}
		superficie=alt*an;
		return superficie;
	}
	public int masAlta() {
		double alt=0;
		double antalt=0;
		int inv=0;
		for (Obras obras : a) {
			if (obras instanceof Esculturas) {
				Esculturas e= (Esculturas) obras;
				alt=e.getAltura();
				if(alt>=antalt) {
					antalt=alt;
					inv=e.getInventario();
				}	
		}
		
	}
		System.out.println("Escultura mas alta:"+inv);
		return inv;
   }
}