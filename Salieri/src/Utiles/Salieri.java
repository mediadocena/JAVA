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
	 * Diversas utilidades para operar con arrays unidimensionales
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
	/**
	 *
	 * @param arreglo acepta como par�metro un array
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
	  * @param A acepta como par�metro un array
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
	  * @param n dimensi�n de la matriz cuadrada
	  * @param x numero con el que se iniciar� la matriz caracol
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
}
