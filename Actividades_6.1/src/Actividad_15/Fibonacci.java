package Actividad_15;


public class Fibonacci {
	int y;
	public int Factor(int x) {
		y=x-1;
		if(y==1) {
			return x;
		}else {
			return x*Factor(x-1);
		}
	}

	public static void main(String[] args) {
		
		
	}

}
