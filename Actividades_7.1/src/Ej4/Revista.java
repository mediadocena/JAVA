package Ej4;

public class Revista extends Biblioteca{
	
	int numero;
	
	Revista(int numero,int codigo,String titulo,int año){
		super(codigo,titulo,año);
		this.numero=numero;
	}

	@Override
	public void cuentaPrestados() {
		
		
	}

	@Override
	public void publicacionesAnterioresA() {
		
		
	}
	
	public String toString() {
		
		return titulo;
		
	}

	public int getNumero() {
		return numero;
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
}
