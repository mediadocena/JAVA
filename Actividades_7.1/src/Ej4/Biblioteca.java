package Ej4;

public abstract class Biblioteca {
		
	int codigo;
	String titulo;
	int a�o;
	
	Biblioteca(int codigo,String titulo,int a�o){
		this.codigo=codigo;
		this.titulo=titulo;
		this.a�o=a�o;
	}
	
	
	abstract public void publicacionesAnterioresA(Biblioteca a,int a�o);
	
 	
}
