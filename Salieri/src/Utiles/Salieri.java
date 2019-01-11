package Utiles;
import java.util.Scanner;

public class Salieri {
		Scanner teclado = new Scanner (System.in);
	Salieri(){
		
	}
	/**
	 * Lee un número entero por teclado y controla las exepciones
	 * @return Retorna el número entero
	 */
	public int controlaentero(){
		 boolean exc = true;
		 int a=0;
		 do {
			try {
			a=teclado.nextInt();
			exc = false;
				}catch(Exception e){
					teclado.nextLine();
					System.out.println("ERROR, introduzca un número");
					}
				}while(exc);
		 return a;
	}
	/**
	 * Lee un número por teclado y determina si es double o no
	 * @return Retorna el número double
	 */
	public double controladouble(){
		 boolean exc = true;
		double a=0;
		 do {
			try {
			a=teclado.nextDouble();
			exc = false;
				}catch(Exception e){
					teclado.nextLine();
					System.out.println("ERROR, introduzca un número");
					}
				}while(exc);
		 return a;
	}
	/**
	 * Lee un número por teclado y determina si es positivo o no
	 * @return Retorna el número positivo
	 */
	public int controlapositivo() {
		 boolean exc = true;
		 int a=0;
		 do {
			try {
			a=teclado.nextInt();
			exc = false;
			if(a>=0) {
				exc=false;
			}else{
				System.out.println("Error, introduzca un número positivo");
				exc=true;
			}
				}catch(Exception e){
					teclado.nextLine();
					System.out.println("ERROR, introduzca un número entero positivo");
					}
				}while(exc);
		 return a;
	}
	/**
	 * Lee un número por teclado y determina si es negativo o no
	 * @return Retorna el número negativo
	 */
	public int controlanegativo() {
		 boolean exc = true;
		 int a=0;
		 do {
			try {
			a=teclado.nextInt();
			exc = false;
			if(a<0) {
				exc=false;
			}else{
				System.out.println("Error, introduzca un número negativo");
				exc=true;
			}
				}catch(Exception e){
					teclado.nextLine();
					System.out.println("ERROR, introduzca un número entero negativo");
					}
				}while(exc);
		 return a;
	}
	/**
	 *  Invierte un String
	 * @param cadena Acepta como parámetro un String 
	 * @return Retorna el String invertido
	 */
	public String invertirString(String cadena) {
		String cadenainv="";
		for (int i = cadena.length()-1; i>=0; i--) {
			cadenainv += cadena.charAt(i);
		}
		
		return cadenainv;
	}
	/**
	 * Determina si un número es capicúa
	 * @param capicua Acepta como parámetro un entero
	 * @return Retorna true si es capicúa o false si no
	 */
	public boolean esCapicua(int capicua) {
		boolean capi=false;
		String Capicua = Integer.toString(capicua);
		String aCapicua = "" ;
		
	for (int i = Capicua.length()-1; i >= 0  ; i--) {
		aCapicua+=Capicua.charAt(i);
		
		}
	if(Capicua.compareTo(aCapicua)==0) {
		
	capi=true;;	
	
	}else {capi=false;}
		
		return capi;
	}
	
	
	}

