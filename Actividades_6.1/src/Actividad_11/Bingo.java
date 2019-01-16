package Actividad_11;

public class Bingo {

	public static void main(String[] args) {
		int[] carton1=new int[15];
		int[] carton2=new int[15];
		boolean gana1=false;
		boolean gana2=false;
		//Asignamos números a los cartones:
		System.out.println("Cartones:");
		for (int i = 0; i < carton1.length; i++) {
			carton1[i] = (int)(Math.random()*89+1);
			carton2[i] =(int)(Math.random()*89+1);
		}
		//Imprimimos los cartones:
		System.out.println("Carton 1:");
		for (int i = 0; i < carton2.length; i++) {
		System.out.print(carton1[i]+" ");
		}
		System.out.println();
		System.out.println("Carton 2:");
		for (int i = 0; i < carton2.length; i++) {
			System.out.print(carton2[i]+" ");
		}
		System.out.println();
		do {
			int n= (int)(Math.random()*89+1);
			//Comprobamos jugador 1
			for (int i = 0; i < carton1.length; i++) {
				if(carton1[i]==n) {
					carton1[i]=0;
				}
			}
			//Comprobamos jugador 2
			for (int i = 0; i < carton2.length; i++) {
				if(carton2[i]==n) {
					carton2[i]=0;
				}
			}
			for (int i = 0; i < carton1.length; i++) {
				if(carton1[i]==0) {
					gana1 = true;
				}else {
					gana1=false;
					break;
				}
			}
			for (int i = 0; i < carton2.length; i++) {
				if(carton2[i]==0) {
					gana2 = true;
				}else {
					gana2=false;
					break;
				}
			}
		} while (gana1==false||gana2==false);
		//Imprimimos los cartones:
				System.out.println("Carton 1:");
				for (int i = 0; i < carton2.length; i++) {
				System.out.print(carton1[i]+" ");
				}
				System.out.println();
				System.out.println("Carton 2:");
				for (int i = 0; i < carton2.length; i++) {
					System.out.print(carton2[i]+" ");
				}
				System.out.println();
		if(gana1==true) {
			System.out.println("Gana el jugador 1");
		}else if(gana2==true){System.out.println("Gana el jugador 2");}
	}
}