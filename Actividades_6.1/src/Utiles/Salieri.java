package Utiles;
import java.util.Scanner;

public class Salieri {
		Scanner teclado = new Scanner (System.in);
	public Salieri(){
		
	}
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
	
	}

