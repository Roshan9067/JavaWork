package Patterns;

public class Pattern20 {
	public static void main(String[] args) {
		
	
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(" ");
			}
			for(int col = 1; col<=row;col++) {
				if(col == row) {
					System.out.print(col);
				}
			}
			System.out.println();
		}
	}
}
