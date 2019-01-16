package Actividad_18;

import Utiles.Salieri;

public class Burbuja {

	public static void main(String[] args) {
		int[][]array=new int[5][5];
		int[] arraya=new int[5];
		int[] arr = new int[5];
		int n=0;
		Salieri ex = new Salieri();
		//Rellenamos la matriz
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j]=(int)(Math.random()*10);
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Indique el nº de la fila a ordenar:");
		n=ex.controlaentero();
		//Para el orden por burbuja:
		for (int j = 0; j < arraya.length; j++) {
				arraya[j]=array[n][j];
			}
		//Para el orden por inserción:
		for (int i = 0; i < arraya.length; i++) {
			arr[i]=array[i][i];
		}
		//Burbuja:
		ex.burbuja(arraya);
		for (int i = 0; i < arraya.length; i++) {
			array[i][n]=arraya[i];
		}
		System.out.println("Matriz ordenada por burbuja:");
		for (int i = 0; i < arraya.length; i++) {
			for (int j = 0; j < arraya.length; j++) {
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
		//Insercion directa:
		ex.insercionDirecta(arr);
		for (int i = 0; i < arraya.length; i++) {
			array[i][i]=arr[i];
		}
		System.out.println("Diagonal de la matriz ordenada por insercion:");
		for (int i = 0; i < arraya.length; i++) {
			for (int j = 0; j < arraya.length; j++) {
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
	}


}


