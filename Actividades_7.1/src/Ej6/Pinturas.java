package Ej6;

public class Pinturas extends Obras{
	
	private double ancho;
	private double alto;
	String soporte;
	
	Pinturas(String titulo, int inventario, String autor, int a�o,double ancho,double alto,String soporte) {
		super(titulo, inventario, autor, a�o);
		this.alto=alto;
		this.ancho=ancho;
		this.soporte=soporte;
	}
	
	public String toString() {
	 return "titulo:"+" "+getTitulo()+" "+"inventario:"+" "+getInventario()+" "+"autor:"+" "+getAutor()+" "+"a�o"+" "+getA�o()+" "+"ancho:"+" "+ancho+" "+"alto"+" "+alto+" "+"soporte"+" "+soporte;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public String getSoporte() {
		return soporte;
	}

	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}
}
