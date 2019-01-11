package Actividad_4;

import java.util.regex.Matcher;

import Utiles.Salieri;

public class OperacionesCadena {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		String cadena="Texto De Ejemplo";
		byte contadorA=0;
		byte contadorO=0;
		byte contadorE=0;
		System.out.println("Cadena de texto al revés:");
		
		for(int i = cadena.length()-1;i>=0;i--) {
			System.out.print(cadena.charAt(i));
			if(cadena.charAt(i)=='a') {
				contadorA++;
			}else if(cadena.charAt(i)=='o') {
				contadorO++;
			}else if(cadena.charAt(i)=='e'){
				contadorE++;
			}
		}
		System.out.println("");
		System.out.println("Numero de e:"+contadorE);
		System.out.println("Numero de a:"+contadorA);
		System.out.println("Numero de o:"+contadorO);
		if (contadorE>3) {
			System.out.println("Exceso de e");
		}
		if(contadorA>10) {
			System.out.println("Exceso de a");
		}
		if(contadorO>5) {
			System.out.println("Exceso de o");
		}
		System.out.println("Introduzca una cadena para comparar:");
		String a= ".*"+ex.controlaString()+".*";
		if(cadena.matches(a)==false) {
			System.out.println("No hay concidencia:");
		}else{
			System.out.println("Hay coincidencia:"+cadena);
		}
		
	}

}
