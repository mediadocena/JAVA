package Ej4;


import java.util.List;

public class Libro extends Biblioteca implements Prestable{
	
	boolean prestado;
	
	Libro(int codigo,String titulo,int año){
		
		super(codigo,titulo,año);
		prestado=false;
		
	}

	
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
		
	return "Codigo:"+getCodigo()+"titulo"+getTitulo()+"año"+getAño()+"prestado"+prestado;
		
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
			System.out.println("El libro está prestado");
		}else {System.out.println("El libro no esta prestado");}
		
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	
}
