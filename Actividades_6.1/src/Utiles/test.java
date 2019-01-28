package Utiles;

public class test {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		String a = "JUAN";
		int cap = 1111;
		int[] array=new int[12];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*10);
			System.out.print(array[i]+",");
			
			}
		System.out.println();
		/*System.out.println(ex.invertirString(a));
		System.out.println(ex.esCapicua(cap));
		ex.controladouble();
		ex.controlaentero();
		ex.controlanegativo();
		ex.controlapositivo();
		ex.vectorUtil(array, 1);
		ex.vectorUtil(array, 2);*/
		
		
		System.out.print(ex.vectorParImpar(array));	
		
		
		
	}

}
