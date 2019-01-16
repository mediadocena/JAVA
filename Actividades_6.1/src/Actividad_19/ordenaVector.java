package Actividad_19;

public class ordenaVector {

	public static void main(String[] args) {
		int[][]matr = new int[][] {{1,2},{3,4}};
		int[] vector = new int[] {1,2};
		int numcol=1;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				if(matr[i][j]==vector[j]) {
					numcol=i;
				}
				if(matr[i][j]==vector[j]){
				numcol=i;	
				}
			}
		}
		System.out.println(numcol);
		
	}

}
