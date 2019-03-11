package Ej4;


import java.util.List;

public class Revista extends Biblioteca{
	
	private int numero;
	
	Revista(int numero,int codigo,String titulo,int ano){
		super(codigo,titulo,ano);
		this.numero=numero;
	}

	/**
	 * Calcula las publicaciones anteriores al introducido por parámetro
	 * @param a
	 * @param ano
	 * @return
	 */
	public int publicacionesAnterioresA(List<Biblioteca> a,int ano) {
		int cont=0;
		for (Biblioteca biblioteca : a) {
			if (biblioteca.getAno()<ano) {
				cont++;
			}
		}
		return cont;
		
	}
	
	
	public String toString() {
		
	return "Codigo:"+codigo+"titulo"+titulo+"aï¿½o"+ano+"numero"+numero;
		
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
	public int getAno() {
		return ano;
	}
}
