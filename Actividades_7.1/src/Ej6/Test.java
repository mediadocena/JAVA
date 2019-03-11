package Ej6;

import Utiles.Salieri;

public class Test {

	public static void main(String[] args) {
		Catalogo g = new Catalogo();
		Salieri ex = new Salieri();
		g.anñadeObra();
		g.anñadeObra();
		g.buscarObra(ex.controlaenteroSt("Introduzca el nº de inventario a buscar"));
		g.eliminaObra(ex.controlaenteroSt("Introduzca el nº de inventario a borrar"));
		g.Superficie();
		g.masAlta();

	}

}
