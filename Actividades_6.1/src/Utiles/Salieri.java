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
					System.out.println("ERROR, introduzca un n�mero");
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
					System.out.println("ERROR, introduzca un n�mero");
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
	
	}

