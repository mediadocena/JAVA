package Ej6;

public class Obras {
	
	private String titulo;
	private int inventario;
	private String autor;
	private int año;
	Obras(String titulo,int inventario, String autor,int año){
		this.titulo=titulo;
		this.inventario=inventario;
		this.año=año;
		this.autor=autor;
		
	}
	public String toString() {
		
		return "titulo:"+" "+titulo+" "+"inventario:"+" "+inventario+" "+"autor:"+" "+autor+" "+"año"+" "+año;
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
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
}
