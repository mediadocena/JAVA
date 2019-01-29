/**
 * @Author Alejandro García Leiva
 */
package almacenes;

public class Ventas {
	
	private String mes;
	private int ventas;
	
	Ventas(String mes,int ventas){
		this.mes = mes;
		this.ventas = ventas;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	@Override
	public String toString() {
		return "mes:"+" "+mes+" "+"ventas:"+ " "+ventas;
	}
	
}
