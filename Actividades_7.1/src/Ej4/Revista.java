package Ej4;

public class Revista extends Biblioteca{
	
	int numero;
	
	Revista(int numero,int codigo,String titulo,int año){
		super(codigo,titulo,año);
		this.numero=numero;
	}

	@Override
	public Object[]  cuentaPrestados() {
		return null;
		
		
	}

	@Override
	public Object[]  publicacionesAnterioresA() {
		return null;
		
		
	}
	
	public String toString() {
		
	return "Codigo:"+codigo+"titulo"+titulo+"año"+año+"numero"+numero;
		
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
