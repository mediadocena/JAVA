package Ej4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Biblioteca> a = new ArrayList<Biblioteca>();
		//Añadimos libros y revistas
		a.add(new Libro(1,"La boca del miedo",1989));
		a.add(new Libro(2,"En las montañas de la locura",1925));
		a.add(new Revista(1,3,"La cosa",1990));
		a.add(new Revista(2,4,"La cosa",1991));
		
		for (Biblioteca biblioteca : a) {
			if (biblioteca instanceof Libro) {
				if (biblioteca.getCodigo()==2) {
					((Libro)biblioteca).Prestar();
				}
			}
		}
		System.out.println(a+"\n");
		int z=0;
		int m=0;
		for (Biblioteca biblioteca : a) {
			if (biblioteca instanceof Libro) {
				m=((Libro)biblioteca).cuentaPrestados(a);
				z=((Libro)biblioteca).publicacionesAnterioresA(a, 1990);
			}
			
		}
		
		System.out.println("Publicaciones anteriores a 1990:"+" "+z);
		System.out.println("Libros prestados:"+" "+m);
	}

}
