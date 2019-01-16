package Actividad_19;

import Utiles.Salieri;

public class ordenaVector {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		int[][]matr = new int[][] {{1,2,5},{3,4,6}};
		int[] vector = new int[] {1,2};
		int numcol=1;
		//Comparamos el vector con cada columna de la matriz:
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				if(matr[i][j]==vector[j]) {
					numcol=i;
				}
				if(matr[j][i]==vector[j]){
				numcol=i;	
				}
			}
		}
		//Imprimimos el menú para determinar el método de ordenación:
		System.out.println("Selecciona un método para ordenarlo");
		System.out.println("1-Burbuja");
		System.out.println("2-Insecion");
		int opcion = ex.controlaentero();
		switch (opcion) {
		case 1:
			ex.burbuja(vector);
			
			break;
		case 2:
			ex.insercionDirecta(vector);
			for (int i = 0; i < vector.length; i++) {
				matr[i][i]=vector[i];
			}
			System.out.println("Diagonal de la matriz ordenada por insercion:");
			for (int i = 0; i < vector.length; i++) {
				for (int j = 0; j < vector.length; j++) {
					System.out.print(matr[j][i]+" ");
				}
				System.out.println();
			}
		default:
			break;
		}
		System.out.println("El vector se encuentra en la columna:"+(numcol+1));
		
	}

}
