package Ej6;

import Utiles.Salieri;

public class Test {

	public static void main(String[] args) {
		Catalogo g = new Catalogo();
		Salieri ex = new Salieri();
		g.an�adeObra();
		g.an�adeObra();
		g.buscarObra(ex.controlaenteroSt("Introduzca el n� de inventario a buscar"));
		g.eliminaObra(ex.controlaenteroSt("Introduzca el n� de inventario a borrar"));
		g.Superficie();
		g.masAlta();

	}

}
