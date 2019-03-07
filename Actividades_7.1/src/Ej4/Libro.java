package Ej4;

import java.util.ArrayList;
import java.util.List;

public class Libro extends Biblioteca implements Prestable{
	
	boolean prestado;
	
	Libro(int codigo,String titulo,int a�o){
		
		super(codigo,titulo,a�o);
		prestado=false;
		
	}

	
	public void cuentaPrestados(ArrayList<Biblioteca> a) {
		int contador=0;
		for (Biblioteca biblioteca : a) {
			if (a instanceof Libro) {
				Libro c = (Libro) b;
				if (((Libro) b).isPrestado()) {
					contador++;
				}
			}
		}
		System.out.println("Libros prestados:"+" "+contador);
		
	}

	@Override
	public void publicacionesAnterioresA(Biblioteca a,int a�o) {
		
		
		
	}
	
	
	public boolean isPrestado() {
		return prestado;
	}

	public String toString() {
		
	return "Codigo:"+codigo+"titulo"+titulo+"a�o"+a�o+"prestado"+prestado;
		
	}	
	public String getTitulo() {
		return titulo;
	}
	public int getCodigo() {
		return codigo;
	}
	public int getA�o() {
		return a�o;
	}

	@Override
	public void Prestar() {
		
		
	}

	@Override
	public void Devolver() {
		
		
	}

	@Override
	public void Prestado() {
		
		
	}
}
