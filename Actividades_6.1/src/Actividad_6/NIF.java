package Actividad_6;

public class NIF {

	public static void main(String[] args) {
		String nif ="49523059a";
		char letra = 'a';
		boolean válido=false;
		char esdigito='a';
		if (nif.length()==9) {
			letra = nif.charAt(8);
		
		if(Character.isAlphabetic(letra)==true) {
			válido = true;
			for (int i = 0; i < 8; i++) {
				esdigito=nif.charAt(i);
				if(Character.isDigit(esdigito)==false) {
					válido=false;
					System.out.println("NIF no válido");
				}else {válido=true;}
			}
		}else {System.out.println("NIF no válido"); válido=false;}
		if(válido==true) {
			for (int i = 0; i < 8; i++) {
				System.out.print(nif.charAt(i));
			}
		}
		}else {
			System.out.println("NIF no válido");
		}
	}

}
