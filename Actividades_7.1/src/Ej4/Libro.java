package Ej4;

import java.util.List;

public class Libro extends Biblioteca implements Prestable{
	
	boolean prestado;
	
	Libro(int codigo,String titulo,int ano){
		
		super(codigo,titulo,ano);
		prestado=false;
		
	}

	/**
	 * Cuenta el numero de prestados
	 * @param a
	 * @return
	 */
	public int cuentaPrestados(List<Biblioteca> a) {
		int cont=0;
		for (Biblioteca biblioteca : a) {
			if (biblioteca instanceof Libro) {
				if (((Libro)biblioteca).isPrestado()==true) {
					cont++;
				}
			}
		}
		return cont;
		
	}

	
	public boolean isPrestado() {
		return prestado;
	}

	/**
	 * Cuenta las publicaciones anteriores al valor pasado por par�metro
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
		
	return "Codigo:"+getCodigo()+"titulo"+getTitulo()+"ano"+getAno()+"prestado"+prestado;
		
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

	@Override
	public void Prestar() {
		setPrestado(true);
		System.out.println("Libro prestado");
	}

	@Override
	public void Devolver() {
		setPrestado(false);
		System.out.println("Libro devuelto");
		
	}

	@Override
	public void Prestado() {
		if (isPrestado()==true) {
			System.out.println("El libro est� prestado");
		}else {System.out.println("El libro no esta prestado");}
		
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	
}
