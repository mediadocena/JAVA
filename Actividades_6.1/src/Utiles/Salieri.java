package Utiles;
import java.util.Scanner;



public class Salieri {
		Scanner teclado = new Scanner (System.in);
	public Salieri(){
		
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
	/**
	 * Rellena un array con números aleatorios entre 0 y 100
	 * @param vector Acepta como parámetro un array de enteros
	 */
	
	/**
	 * Muestra en pantalla el contenido de un vector de numeros enteros
	 * @param vector Acepta como parámetro un array de enteros.
	 */
	
	public void rellenaVectornum(int[] vector) {
		 for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*101);
		}
	}
	/**
	 * Diversas utilidades para operar con arrays unidimensionales
	 * @param vector Acepta como parámetro un array de enteros
	 * @param opcion Acepta como parámetro un número entero:
	 * 				1_Rellena un array con números aleatorios entre 0 y 100.
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
	 * @param arreglo acepta como parámetro un array
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
	  * @param A acepta como parámetro un array
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
	  * @param n dimensión de la matriz cuadrada
	  * @param x numero con el que se iniciará la matriz caracol
	  * @return retorna una matriz de enteros con la matriz caracol ya generada.
	  */
	 public int[][] generarMatrizCaracol(int n, int x) {
	     int[][] M = new int[n + 1][n + 1];
	     
	     for (int a = 1; a <= n/2 ; a++) {
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
	  * Crea la serie de fibonacci
	  * @param n nº de veces a repetir la sucesión
	  * @return valor de fibonacci en esa posición
	  */
	public int fibonacci(int n){
		    
		    if (n==1||n==0){
		    	return n;
		    }
		    else{ 
		    	return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
		    }
	}
	/**
	 * Método para imprimir fibonacci en pantalla,
	 * llama al método fibonacci() directamente
	 */
	public void imprimirFibonacci() {
		int n = controlaentero();
		for(int i = 0;i<n;i++) {
		System.out.print(fibonacci(i)+",");
		}
	
	}
	public int[] vectorParImpar(int[] array) {
		int contador1=0;
		int contador2=0;
	for (int i = 0; i < array.length; i++) {
		if(array[i]%2==0) {
			contador1++;
		}else {
			contador2++;
		}
		
	}
	contador1=0;
	contador2=0;
	int[] pares=new int[contador1];
	int[] impares=new int[contador2];
	for (int i = 0; i < pares.length; i++) {
		 if(array[i]%2==0) {
				pares[contador1]=array[i];
			}
	
		if(array[i]%2!=0) {
				impares[contador2]=array[i];
		}
		contador1++;
		contador2++;
	}
	for (int j = 0; j > pares.length; j++) 
	for (int i = 0; i <array.length; i++) {
		array[i]=pares[j];
	}
	for (int j = 0; j > impares.length; j++) {
	for (int i = array.length; i > 0; i--) {
		array[i]=impares[j];
	}
	}
	return array;
	}
	
}

