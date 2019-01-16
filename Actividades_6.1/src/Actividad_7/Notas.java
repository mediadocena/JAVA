package Actividad_7;

import java.util.StringTokenizer;

public class Notas {

	public static void main(String[] args) {
		String strDatos = "Pepe \n 5.6 \n Juan \n 8.5";
		int contador=0;
		//Dividimos el texto a partir de /n
		StringTokenizer tokens=new StringTokenizer(strDatos, "\n");
		//Ordenamos e imprimimos el texto:
		do {
		String nombre =tokens.nextToken();
		String nota = tokens.nextToken();
		System.out.println("El alumno"+" "+nombre+" "+"Ha sacado"+" "+nota);
		contador++;
	
		}while(contador<2);
	}

}
