package Actividad_8;

import java.util.StringTokenizer;

public class Vector {

	public static void main(String[] args) {
		String strDatos = "Pepe \n 5.6 \n Juan \n 8.5";
		int contador=0;
		String nombre[] = new String[2];
		
		double[] nota =new double[2];
		StringTokenizer tokens=new StringTokenizer(strDatos, "\n");
		do {
		nombre[contador] =tokens.nextToken();
		nota[contador] = Double.parseDouble(tokens.nextToken());
		
		
		contador++;
	
		}while(contador<2);
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println("El alumno"+" "+nombre[i]+" "+"Ha sacado"+" "+nota[i]);
		}
	}

}
