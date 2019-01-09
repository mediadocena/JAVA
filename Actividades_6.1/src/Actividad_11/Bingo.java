package Actividad_11;

public class Bingo {

	public static void main(String[] args) {
		int[][]numplayer = new int[5][5];
		int[][]numplayer2 = new int[5][5];
		int numa = 0;
		boolean bingo = false;
		boolean bingo2 = false;
		//Generamos los números del jugador
		//Generamos las filas y columnas:
		System.out.println("Estos son tus números:");
		for (int i = 0; i < 5; i++) {
			numplayer[i][0]=(int) (Math.random()*101);
			numplayer2[i][0]=(int) (Math.random()*101);
			System.out.print(numplayer[i][0]);
			System.out.print(" ");
			for (int j = 0; j < 5; j++) {
				numplayer[0][j]=(int) (Math.random()*101);
				numplayer2[0][j]=(int) (Math.random()*101);
				System.out.print(numplayer[0][j]);
				
				System.out.print(" ");
			}
			
			System.out.println("");
		}
		do {
			numa=(int)(Math.random()*101);
			//Marcamos los números correctos
			for (int i = 0; i < 5; i++) {
				if(numplayer[0][i]==numa) {
					numplayer[0][i]=-1;
				}
				if(numplayer2[0][i]==numa) {
					numplayer2[0][i]=-1;
				}
				if(numplayer[i][0]==numa) {
					numplayer[i][0]=-1;
				} 
				if(numplayer2[i][0]==numa){
					numplayer2[i][0]=-1;
				}
			}
			for (int i = 0; i < 5; i++) {
				if(numplayer[i][0]==-1) {
					bingo=true;
				}else {bingo=false;break;}
				if(numplayer2[i][0]==-1) {
					bingo2=true; 
					}else {bingo2=false;break;}
				if(numplayer[0][i]==-1) {
					bingo=true;
				}else {bingo=false;break;}
					if(numplayer2[0][i]==-1) {
					bingo2=true; 
					}else {bingo2=false;break;}
			}
			
		}while(bingo == false && bingo2==false);
		if(bingo=true) {
			System.out.println("Gana el jugador 1");
			
		}else {System.out.println("Gana el jugador 2");}
	}

}
