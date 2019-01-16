package Actividad_17;

import Utiles.Salieri;

public class Caracol {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		System.out.println("Introduzca la dimension de la matriz:");
		int n = ex.controlaentero();
		ex.mostrarMatriz(ex.generarMatrizCaracol(n, 1), n, n);
	}

}
