package Actividad_9;

public class Capicua {

	public static void main(String[] args) {
		int capicua = 3113;
		boolean escapicua=false;
		int contador =0;
		String Capicua = Integer.toString(capicua);
		System.out.println(Capicua.length());
		char[] aCapicua = new char[Capicua.length()] ;
	for (int i = Capicua.length(); i > 0  ; i--) {
		aCapicua[contador]=Capicua.charAt(i);
		contador++;
		
		}
	if(Capicua.compareToIgnoreCase(String.valueOf(aCapicua))==0) {
	System.out.println("Es capicua");	
	}else {System.out.println("Falso");}
	}

}
