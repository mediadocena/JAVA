package Ej4;

public class Revista extends Biblioteca{
	
	int numero;
	
	Revista(int numero,int codigo,String titulo,int a�o){
		super(codigo,titulo,a�o);
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
	public int getA�o() {
		return a�o;
	}
}
