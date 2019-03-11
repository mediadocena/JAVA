package Ej4;

public abstract class Biblioteca {
		
	protected int codigo;
	protected String titulo;
	protected int a�o;
	
	Biblioteca(int codigo,String titulo,int a�o){
		this.codigo=codigo;
		this.titulo=titulo;
		this.a�o=a�o;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	
 	
}
