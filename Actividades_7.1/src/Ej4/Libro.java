package Ej4;

public class Libro extends Biblioteca implements Prestable{
	
	boolean prestado;
	
	Libro(int codigo,String titulo,int año){
		
		super(codigo,titulo,año);
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
		
	return "Codigo:"+codigo+"titulo"+titulo+"año"+año+"prestado"+prestado;
		
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
		
		
	}

	@Override
	public void Devolver() {
		
		
	}

	@Override
	public void Prestado() {
		
		
	}
}
