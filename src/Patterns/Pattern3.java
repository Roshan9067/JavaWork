package Patterns;

public class Pattern3 {
	public static void main(String [] srgs) {
		
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

}
