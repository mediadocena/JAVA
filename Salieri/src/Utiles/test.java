package Utiles;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<Integer> t = new ArrayList<Integer>();
		Salieri ex = new Salieri();
		String a = "JUAN";
		int cap = 1111;
		int[] array=new int[12];
		
			
		System.out.println();
		/*System.out.println(ex.invertirString(a));
		System.out.println(ex.esCapicua(cap));
		ex.controladouble();
		ex.controlaentero();
		ex.controlanegativo();
		ex.controlapositivo();
		ex.vectorUtil(array, 1);
		ex.vectorUtil(array, 2);*/
		ex.llenarListIntRandom(t,100, 100);
		ex.mostrarListInt(t);
		t.clear();
		ex.llenarListIntTeclado(t, 10);
		ex.mostrarListInt(t);
		
		
		
		
	}

}
