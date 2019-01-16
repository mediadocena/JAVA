package Actividad_5;

public class Palindromo {

	public static void main(String[] args) {
		String cadena ="no subas abuson";
		cadena=cadena.replaceAll(" ", "");
		String cadenainv="";
		//invertimos el string
		for (int i = cadena.length()-1; i >=0 ; i--) {
			cadenainv+=cadena.charAt(i);
		}
		//Comparamos la cadena invertida con la original y determinamos si es o no palíndromo
		if(cadena.compareToIgnoreCase(cadenainv)==0) {
			System.out.println("Es palíndromo");
		}else {System.out.println("No es palíndromo");}
		
	}

}
