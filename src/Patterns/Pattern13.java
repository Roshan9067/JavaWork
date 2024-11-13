 package Patterns;

public class Pattern13 {
	public static void main(String [] args) {
		int num = 5;
		for(int row=1; row<=5; row++) {
			for(int col=1; col < row; col++) {
				System.out.print("-");
			}
			for(int col=1; col<= num - row +1; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}

