package Ej4;

public class Libro extends Biblioteca {
	
	boolean prestado;
	
	Libro(int codigo,String titulo,int a�o){
		
		super(codigo,titulo,a�o);
		prestado=false;
		
	}

	@Override
	public void cuentaPrestados() {
		
		
	}

	@Override
	public void publicacionesAnterioresA() {
		
		
	}
	
	public String toString() {
		
		return titulo;
		
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
