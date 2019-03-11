package Ej5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Comercial a = new Comercial("Halfonso","49523059A");
		Directivo d = new Directivo("Jorse","52304920C");
		
		System.out.println("Retencion del comercial:"+" "+a.getNombre()+":"+a.retencion()+"%");
		System.out.println("Gratificacion del comercial"+" "+a.getNombre()+":"+a.gratificacion(4));
		System.out.println("Importe a cobrar del comercial"+" "+a.getNombre()+":"+a.calcular()+a.gratificacion(4));
		System.out.println(" ");
		System.out.println("Retencion del Directivo:"+" "+d.getNombre()+":"+d.retencion()+"%");
		System.out.println("Gratificacion del Directivo"+" "+d.getNombre()+":"+d.gratificacion(3));
		System.out.println("Importe a cobrar del Directivo"+" "+d.getNombre()+":"+d.calcular()+d.gratificacion(3));
		

	}

}
