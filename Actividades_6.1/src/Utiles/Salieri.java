package Utiles;
import java.util.Scanner;

public class Salieri {
		Scanner teclado = new Scanner (System.in);
	public Salieri(){
		
	}
	/**
	 * Lee un n�mero entero por teclado y controla las exepciones
	 * @return Retorna el n�mero entero
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
					System.out.println("ERROR, introduzca un n�mero");
					}
				}while(exc);
		 return a;
	}
	/**
	 * Lee un n�mero por teclado y determina si es double o no
	 * @return Retorna el n�mero double
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
					System.out.println("ERROR, introduzca un n�mero");
					}
				}while(exc);
		 return a;
	}
	/**
	 * Lee un n�mero por teclado y determina si es positivo o no
	 * @return Retorna el n�mero positivo
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
				System.out.println("Error, introduzca un n�mero positivo");
				exc=true;
			}
				}catch(Exception e){
					teclado.nextLine();
					System.out.println("ERROR, introduzca un n�mero entero positivo");
					}
				}while(exc);
		 return a;
	}
	/**
	 * Lee un n�mero por teclado y determina si es negativo o no
	 * @return Retorna el n�mero negativo
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
				System.out.println("Error, introduzca un n�mero negativo");
				exc=true;
			}
				}catch(Exception e){
					teclado.nextLine();
					System.out.println("ERROR, introduzca un n�mero entero negativo");
					}
				}while(exc);
		 return a;
	}
	/**
	 * Lee un String por teclado y controla las excepciones
	 * @return Retorna un String
	 */
	public String controlaString(){
		 boolean exc = true;
		String a="";
		 do {
			try {
			a=teclado.next();
			exc = false;
				}catch(Exception e){
					teclado.nextLine();
					System.out.println("ERROR, introduzca una cadena de caracteres");
					}
				}while(exc);
		 return a;
	}
	/**
	 *  Invierte un String
	 * @param cadena Acepta como par�metro un String 
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
	 * Determina si un n�mero es capic�a
	 * @param capicua Acepta como par�metro un entero
	 * @return Retorna true si es capic�a o false si no
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
	/**
	 * Rellena un array con n�meros aleatorios entre 0 y 100
	 * @param vector Acepta como par�metro un array de enteros
	 */
	
	/**
	 * Muestra en pantalla el contenido de un vector de numeros enteros
	 * @param vector Acepta como par�metro un array de enteros.
	 */
	
	public void rellenaVectornum(int[] vector) {
		 for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*101);
		}
	}
	/**
	 * 
	 * @param vector Acepta como par�metro un array de enteros
	 * @param opcion Acepta como par�metro un n�mero entero:
	 * 				1_Rellena un array con n�meros aleatorios entre 0 y 100.
	 * 				2_Muestra en pantalla el contenido de un vector de numeros enteros.
	 */
	public void vectorUtil(int[] vector,int opcion) {
		switch (opcion) {
		case 1:
			for (int i = 0; i < vector.length; i++) {
				vector[i]=(int)(Math.random()*101);
			}
			
			break;
		case 2:
			for (int i = 0; i < vector.length; i++) {
				System.out.println(vector[i]);
			}
		default:
			break;
		}
			
		
	}
	
}

