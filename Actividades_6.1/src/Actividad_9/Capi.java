package Actividad_9;

public class Capi {
public boolean esCapicua(int capicua) {
	//Convertimos el n�mero a String:
	String Capicua = Integer.toString(capicua);
	String aCapicua = "" ;
	//le damos la vuelta al n�mero:
	for (int i = Capicua.length()-1; i >= 0  ; i--) {
		aCapicua+=Capicua.charAt(i);
		
		}
	//Comparamos el n�mero:
	if(Capicua.compareTo(aCapicua)==0) {
		
	System.out.println("Es capicua");
	return true;
	
	}else {System.out.println("Falso");}
	return false;
	}
	
}

