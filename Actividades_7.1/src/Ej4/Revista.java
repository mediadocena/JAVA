package Ej4;

import java.util.ArrayList;
import java.util.List;

public class Revista extends Biblioteca{
	
	private int numero;
	
	Revista(int numero,int codigo,String titulo,int a�o){
		super(codigo,titulo,a�o);
		this.numero=numero;
	}

	
	public int publicacionesAnterioresA(List<Biblioteca> a,int a�o) {
		int cont=0;
		for (Biblioteca biblioteca : a) {
			if (biblioteca.getA�o()<a�o) {
				cont++;
			}
		}
		return cont;
		
	}
	
	
	public String toString() {
		
	return "Codigo:"+codigo+"titulo"+titulo+"a�o"+a�o+"numero"+numero;
		
	}

	public int getNumero() {
		return numero;
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
}
