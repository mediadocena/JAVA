package Ej4;

public class Libro extends Biblioteca implements Prestable{
	
	boolean prestado;
	
	Libro(int codigo,String titulo,int a�o){
		
		super(codigo,titulo,a�o);
		prestado=false;
		
	}

	@Override
	public Object[] cuentaPrestados() {
		return null;
		
		
	}

	@Override
	public Object[] publicacionesAnterioresA() {
		return null;
		
		
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
