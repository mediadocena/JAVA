package Ej6;

public class Obras {
	
	private String titulo;
	private int inventario;
	private String autor;
	private int a�o;
	Obras(String titulo,int inventario, String autor,int a�o){
		this.titulo=titulo;
		this.inventario=inventario;
		this.a�o=a�o;
		this.autor=autor;
		
	}
	public String toString() {
		
		return "titulo:"+" "+titulo+" "+"inventario:"+" "+inventario+" "+"autor:"+" "+autor+" "+"a�o"+" "+a�o;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getInventario() {
		return inventario;
	}
	public void setInventario(int inventario) {
		this.inventario = inventario;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
}
