package Actividad_6;

public class NIF {

	public static void main(String[] args) {
		String nif ="49523059B";
		char letra = nif.charAt(8);
		boolean v�lido=false;
		char esdigito='a';
		if(Character.isAlphabetic(letra)==true) {
			v�lido = true;
			for (int i = 0; i < 8; i++) {
				esdigito=nif.charAt(i);
				if(Character.isDigit(esdigito)==false) {
					v�lido=false;
					System.out.println("NIF no v�lido");
				}else {v�lido=true;}
			}
		}else {System.out.println("NIF no v�lido"); v�lido=false;}
		if(v�lido==true) {
			for (int i = 0; i < 8; i++) {
				System.out.print(nif.charAt(i));
			}
		}
	}

}
