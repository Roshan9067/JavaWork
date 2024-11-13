package Patterns;

public class Pattern17 {
	public static void main(String[] args) {
		
		int num=5;
		for(int row=1; row<=5;row++) {
			
			for(int col=5;col>row;col--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(num+" ");
			}
			num--;
			System.out.println();
		}
		
	}

}

