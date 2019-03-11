package Ej6;

public class Esculturas extends Obras {
	
	private String material;
	private double altura;
	
	Esculturas(String titulo, int inventario, String autor, int año,String material,double altura) {
		super(titulo, inventario, autor, año);
		this.material=material;
		this.altura=altura;
	}
	public String toString() {
		
	 return "titulo:"+" "+getTitulo()+" "+"inventario:"+" "+getInventario()+" "+"autor:"+" "+getAutor()+" "+"año"+" "+getAño()+" "+"material:"+" "+material+" "+"altura:"+" "+altura;
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
