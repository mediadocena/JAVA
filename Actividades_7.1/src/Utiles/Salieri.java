package Utiles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;





public class Salieri {
		Scanner teclado = new Scanner (System.in);
	public Salieri(){

	}
	/**
	 * Lee un String e imprime un mensaje.
	 * @param m
	 * @return
	 */
	public String controlaStringSt(String m){
		System.out.println(m);
		 boolean exc = true;
		 String a="";
		 do {
			try {
			a=teclado.next();
			exc = false;
				}catch(Exception e){
					teclado.nextLine();
					System.out.println("ERROR, introduzca un caracter");
					}
				}while(exc);
		 return a;
	}
	/**
	 * Lee un numero entero por teclado y controla las exepciones, imprimiendo un mensaje
	 * @return Retorna el numero entero
	 */
	public int controlaenteroSt(String m){
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
	 * Lee un numero entero por teclado y controla las exepciones
	 * @return Retorna el numero entero
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
					System.out.println("ERROR, introduzca un nï¿½mero");
					}
				}while(exc);
		 return a;
	}
	public String controlaString(){
		 boolean exc = true;
		 String a="";
		 do {
			try {
			a=teclado.next();
			exc = false;
				}catch(Exception e){
					teclado.nextLine();
					System.out.println("ERROR, introduzca un caracter");
					}
				}while(exc);
		 return a;
	}
	/**
	 * Lee un numero por teclado y determina si es double o no
	 * @return Retorna el numero double
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
					System.out.println("ERROR, introduzca un nï¿½mero");
					}
				}while(exc);
		 return a;
	}
	/**
	 * Lee un numero por teclado y determina si es positivo o no
	 * @return Retorna el numero positivo
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
				System.out.println("Error, introduzca un nï¿½mero positivo");
				exc=true;
			}
				}catch(Exception e){
					teclado.nextLine();
					System.out.println("ERROR, introduzca un nï¿½mero entero positivo");
					}
				}while(exc);
		 return a;
	}
	/**
	 * Lee un numero por teclado y determina si es negativo o no
	 * @return Retorna el numero negativo
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
				System.out.println("Error, introduzca un numero negativo");
				exc=true;
			}
				}catch(Exception e){
					teclado.nextLine();
					System.out.println("ERROR, introduzca un numero entero negativo");
					}
				}while(exc);
		 return a;
	}
	/**
	 *  Invierte un String
	 * @param cadena Acepta como parametro un String
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
	 * Determina si un numero es capicua
	 * @param capicua Acepta como parametro un entero
	 * @return Retorna true si es capicua o false si no
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
	 * Rellena un array con numeros aleatorios entre 0 y 100
	 * @param vector Acepta como parametro un array de enteros
	 */

	/**
	 * Muestra en pantalla el contenido de un vector de numeros enteros
	 * @param vector Acepta como parametro un array de enteros.
	 */

	public void rellenaVectornum(int[] vector) {
		 for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*101);
		}
	}
	/**
	 * Diversas utilidades para operar con arrays unidimensionales
	 * @param vector Acepta como parametro un array de enteros
	 * @param opcion Acepta como parametro un numero entero:
	 * 				1_Rellena un array con numeros aleatorios entre 0 y 100.
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
	/**
	 *
	 * @param arreglo acepta como parametro un array
	 */
	 public void burbuja(int arreglo[]) {
	        for(int i = 0; i < arreglo.length - 1; i++){
	            for(int j = 0; j < arreglo.length - 1; j++){
	                if (arreglo[j] < arreglo[j + 1]){
	                    int tmp = arreglo[j+1];
	                    arreglo[j+1] = arreglo[j];
	                    arreglo[j] = tmp;
	                }
	            }
	        }
	        for(int i = 0;i < arreglo.length; i++){
	            System.out.print(arreglo[i]+"\n");
	        }
	    }
	 /**
	  *
	  * @param A acepta como parametro un array
	  */
	 public void insercionDirecta(int A[]){
		    int p, j;
		    int aux;
		    for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
		              aux = A[p]; // el final, guardamos el elemento y
		              j = p - 1; // empezamos a comprobar con el anterior
		              while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el
		                                                                    // valor de aux sea menor que los
		                             A[j + 1] = A[j];       // de la izquierda, se desplaza a
		                             j--;                   // la derecha
		              }
		              A[j + 1] = aux; // colocamos aux en su sitio
		    }
		}
	 /**
	  * Genera Una Matriz Caracol.
	  * @param n dimension de la matriz cuadrada
	  * @param x numero con el que se iniciara la matriz caracol
	  * @return retorna una matriz de enteros con la matriz caracol ya generada.
	  */
	 public int[][] generarMatrizCaracol(int n, int x) {
	     int[][] M = new int[n + 1][n + 1];
	     for (int a = 1; a <= n / 2; a++) {
	         for (int i = a; i <= n - a; i++) {
	             M[a][i] = x;
	             x++;
	         }
	         for (int i = a; i <= n - a; i++) {
	             M[i][n - a + 1] = x;
	             x++;
	         }
	         for (int i = n - a + 1; i >= a + 1; i--) {
	             M[n - a + 1][i] = x;
	             x++;
	         }
	         for (int i = n - a + 1; i >= a + 1; i--) {
	             M[i][a] = x;
	             x++;
	         }
	     }
	     if (n % 2 == 1) {
	         M[n / 2 + 1][n / 2 + 1] = x;
	     }
	     return M;
	 }

	 /**
	  * Muestra Una Matriz Cualquiera Por Consola A Partir De La Fila 1 y Columna 1
	  * @param M matriz a mostrar
	  * @param f numero de filas de la matriz
	  * @param c numero de columnas de la matriz
	  */
	 public void mostrarMatriz(int[][] M, int f, int c) {
	     for (int i = 1; i <= f; i++) {
	         for (int j = 1; j <= c; j++) {
	             System.out.print("\t" + M[i][j]);
	         }
	         System.out.println();
	     }
	 }
	 /**
	  * Metodo para rellenar un arraylist con numeros aleatorios, controlando los parámetros
	  * @param longitud longitud del arraylist a llenar
	  * @param num numero limite para generar numeros
	  * @param t arraylist a llenar
	  */
	 public void llenarListIntRandom(List<Integer> t,int longitud,int num) {
		 for (int i = 0; i < longitud; i++) {
			 t.add((int)(Math.random()*num+1));
		}
	 }
	 /**
	  * Metodo para mostrar en pantalla un arraylist 
	  * @param a Arraylist a mostrar
	  */
	 public void mostrarListInt(List a) {
		 for(int i=0;i<a.size();i++) {
			 System.out.println(a.get(i));
		 }
	 }
	 /**
	  * Metodo para llenar un arraylist por teclado, controlando los parametros
	  * @param t arraylist a mostrar
	  * @param longitud longitud del arraylist a llenar
	  */
	 public void llenarListIntTeclado(List<Integer> t,int longitud) {
		 for (int i = 0; i < longitud; i++) {
			 System.out.println("Introduzca un número para la posición:"+" "+i);
			 t.add(controlaentero());
		}
	 }
}
