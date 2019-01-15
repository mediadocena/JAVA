package Actividad_13;

public class PuntoSilla {

	public static void main(String[] args) {
		int[][] silla=new int[4][4];
		int sillant=0;
		
		for (int i = 0; i < silla.length; i++) {
			for (int j = 0; j<silla[0].length; j++) {
				silla [i][j]=(int)(Math.random()*101);
				System.out.print(silla[i][j]+" ");
			}
			System.out.println("");
		}
		for (int i = 0; i < silla.length; i++) {
			
			if(silla[i][0]>sillant) {
				sillant=silla[i][0];
			}
			
		}
		
	}

}
