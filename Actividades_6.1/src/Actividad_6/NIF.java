package Actividad_6;

public class NIF {

	public static void main(String[] args) {
		String nif ="49523059a";
		char letra = 'a';
		boolean v�lido=false;
		char esdigito='a';
		//Controlamos la cantidad de digitos:
		if (nif.length()==9) {
			letra = nif.charAt(8); //Posici�n de la letra
		
		//Determinamos si el ultimo digito es una letra
		if(Character.isAlphabetic(letra)==true) {
			v�lido = true;
			//Determinamos si el resto de digitos son n�meros
			for (int i = 0; i < 8; i++) {
				esdigito=nif.charAt(i);
				if(Character.isDigit(esdigito)==false) {
					v�lido=false;
					System.out.println("NIF no v�lido");
				}else {v�lido=true;}
			}
		}else {System.out.println("NIF no v�lido"); v�lido=false;}
		//Imprimimos los n�meros del dni si es v�lido
		if(v�lido==true) {
			for (int i = 0; i < 8; i++) {
				System.out.print(nif.charAt(i));
			}
		}
		//Si no es v�lido:
		}else {
			System.out.println("NIF no v�lido");
		}
	}

}
