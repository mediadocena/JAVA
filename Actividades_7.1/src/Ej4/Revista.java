package Ej4;

public class Revista extends Biblioteca{
	
	int numero;
	
	Revista(int numero,int codigo,String titulo,int a�o){
		super(codigo,titulo,a�o);
		this.numero=numero;
	}


	public void publicacionesAnterioresA(Biblioteca a,int a�o) {
		
		
		
	}
	
	public String toString() {
		
	return "Codigo:"+codigo+"titulo"+titulo+"a�o"+a�o+"numero"+numero;
		
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
