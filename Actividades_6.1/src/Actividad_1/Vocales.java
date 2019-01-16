package Actividad_1;

public class Vocales {

	public static void main(String[] args) {
		String a = "Hola que tal";
		int contador = 0;
		//Bucle para comparar las vocales y contarlas.
		for (int i = 0; i < a.length()-1; i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				contador++;
			}
			
		}
		System.out.println("Número de vocales:"+contador);
	}

}
