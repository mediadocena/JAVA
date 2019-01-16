package Actividad_6;

public class NIF {

	public static void main(String[] args) {
		String nif ="49523059a";
		char letra = 'a';
		boolean válido=false;
		char esdigito='a';
		//Controlamos la cantidad de digitos:
		if (nif.length()==9) {
			letra = nif.charAt(8); //Posición de la letra
		
		//Determinamos si el ultimo digito es una letra
		if(Character.isAlphabetic(letra)==true) {
			válido = true;
			//Determinamos si el resto de digitos son números
			for (int i = 0; i < 8; i++) {
				esdigito=nif.charAt(i);
				if(Character.isDigit(esdigito)==false) {
					válido=false;
					System.out.println("NIF no válido");
				}else {válido=true;}
			}
		}else {System.out.println("NIF no válido"); válido=false;}
		//Imprimimos los números del dni si es válido
		if(válido==true) {
			for (int i = 0; i < 8; i++) {
				System.out.print(nif.charAt(i));
			}
		}
		//Si no es válido:
		}else {
			System.out.println("NIF no válido");
		}
	}

}
