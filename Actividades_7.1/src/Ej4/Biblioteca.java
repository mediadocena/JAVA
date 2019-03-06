package Ej4;

public abstract class Biblioteca {
		
	int codigo;
	String titulo;
	int año;
	
	Biblioteca(int codigo,String titulo,int año){
		this.codigo=codigo;
		this.titulo=titulo;
		this.año=año;
	}
	abstract public  void cuentaPrestados();
	abstract public void publicacionesAnterioresA();
	
 	
}
