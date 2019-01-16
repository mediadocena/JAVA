package Actividad_14;

public class Factorial {
	int x;
	int y=x-1;
	Factorial(){
	
	}
	
	public int Factor(int x) {
		y=x-1;
		if(y==1) {
			return x;
		}else {
			return x*Factor(x-1);
		}
	}
}
