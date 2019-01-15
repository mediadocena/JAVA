package Actividad_17;

import Utiles.Salieri;

public class Caracol {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		int n = ex.controlaentero();
		int[][] array = new int[n][n];
		int contador=0;
		for (int i = 0; i < array.length; i++) {
			array[i][0]=contador;
			contador++;
		}
		for (int i = 0; i < array.length; i++) {
			array[0][i]=contador;
		}
		for (int i = array.length; i <0 ; i--) {
			array[i][0]=contador;
		}
		for (int i = 0; i < array.length-1; i++) {
			array[0][i]=contador;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
	}
}


