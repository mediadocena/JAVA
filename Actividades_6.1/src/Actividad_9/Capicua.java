package Actividad_9;

public class Capicua {

	public static void main(String[] args) {
		int capicua = 3113;
		String Capicua = Integer.toString(capicua);
		String aCapicua = "" ;
		
	for (int i = Capicua.length()-1; i >= 0  ; i--) {
		aCapicua+=Capicua.charAt(i);
		
		}
	
	if(Capicua.compareTo(aCapicua)==0) {
		
	System.out.println("Es capicua");	
	
	}else {System.out.println("Falso");}
	
	}

}
