package Ej4;

public class Libro extends Biblioteca {
	
	boolean prestado;
	
	Libro(int codigo,String titulo,int año){
		
		super(codigo,titulo,año);
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
	public int getAño() {
		return año;
	}
}
