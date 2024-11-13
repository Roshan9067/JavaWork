package Patterns;

public class Pattern39 {
	public static void main(String[] args) {
		
		for(int row=1; row<=5; row++) {
			for(int col=0; col<row; col++) {
				System.out.print((char)('A' + col) + " ");
			}
			System.out.println();
		}
	}

}
