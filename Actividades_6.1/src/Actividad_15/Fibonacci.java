package Actividad_15;

import Utiles.Salieri;

public class Fibonacci {
	public int fibonacci(int n){
		    
		    if (n==1|| n==0){
		       return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
		    }
		    else{ 
		        return 1;
		    }
		   
		
	}

	public static void main(String[] args) {
		Salieri es = new Salieri();
		Fibonacci ex = new Fibonacci();
		int n = es.controlaentero();
		for(int i = 0;i<n;i++) {
		System.out.println(ex.fibonacci(n)+",");
		}
	}

}
