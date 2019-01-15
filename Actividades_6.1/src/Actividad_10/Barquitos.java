package Actividad_10;
import Utiles.Salieri;
public class Barquitos {
	Salieri ex = new Salieri();
	int[][] tablero1 = new int[10][10];
	int[][] tablero2 = new int[10][10];
	int[] a=new int[] {1,2,3,4,5,6,7,8,9,10};
	int portaavion = 6;
	int destructor = 4;
	int patrullero = 2;
	int submarino = 3;
	
	Barquitos(){
		
	}
	
	public void PosicionarBarcos() {
		System.out.println("  1 2 3 4 5 6 7 8 9 10");
		for (int i = 0; i < tablero1.length; i++) {
			System.out.print(a[i]+" ");
			for (int j = 0; j < tablero1[i].length; j++) {
				tablero1[i][j]=0;
				
				System.out.print(tablero1[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("Jugador 1, coloque los barcos en el tablero:");
		System.out.println("Posición del portaaviones(ocupa 6 huecos):");
		
	}
}
