package Ej6;

public class Esculturas extends Obras {
	
	private String material;
	private double altura;
	
	Esculturas(String titulo, int inventario, String autor, int a�o,String material,double altura) {
		super(titulo, inventario, autor, a�o);
		this.material=material;
		this.altura=altura;
	}
	public String toString() {
		
	 return "titulo:"+" "+getTitulo()+" "+"inventario:"+" "+getInventario()+" "+"autor:"+" "+getAutor()+" "+"a�o"+" "+getA�o()+" "+"material:"+" "+material+" "+"altura:"+" "+altura;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
