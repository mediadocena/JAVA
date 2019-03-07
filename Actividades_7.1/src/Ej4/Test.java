package Ej4;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Biblioteca> a = new ArrayList<Biblioteca>();
		a.add(1,new Libro(1,"La llamada de Cthulhu",1925));
		a.add(2,new Libro(2,"Nyarlatothep",1926));
		a.add(3,new Revista(1,123,"EL coso",2015));
		a.add(4,new Revista(2,123,"EL coso",2016));
		Libro b = (Libro) a.get(1);
		b.cuentaPrestados(a);
	}

}
