package Ej4;

public abstract class Biblioteca {
		
	protected int codigo;
	protected String titulo;
	protected int año;
	
	Biblioteca(int codigo,String titulo,int año){
		this.codigo=codigo;
		this.titulo=titulo;
		this.año=año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	
 	
}
