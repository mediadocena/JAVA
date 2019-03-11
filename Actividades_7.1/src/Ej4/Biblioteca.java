package Ej4;

public abstract class Biblioteca {
		
	protected int codigo;
	protected String titulo;
	protected int ano;
	
	Biblioteca(int codigo,String titulo,int ano){
		this.codigo=codigo;
		this.titulo=titulo;
		this.ano=ano;
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
 	
}
