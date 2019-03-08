package Ej4;

import java.util.ArrayList;
import java.util.List;

public class Revista extends Biblioteca{
	
	private int numero;
	
	Revista(int numero,int codigo,String titulo,int año){
		super(codigo,titulo,año);
		this.numero=numero;
	}

	
	public int publicacionesAnterioresA(List<Biblioteca> a,int año) {
		int cont=0;
		for (Biblioteca biblioteca : a) {
			if (biblioteca.getAño()<año) {
				cont++;
			}
		}
		return cont;
		
	}
	
	
	public String toString() {
		
	return "Codigo:"+codigo+"titulo"+titulo+"año"+año+"numero"+numero;
		
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
	public int getAño() {
		return año;
	}
}
