package Patterns;

public class Pattern32 {
	public static void main(String[] args) {
		
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				
				if((row==3) && (col==2)) {
					System.out.print(" ");
				} else if((row == 4 && col == 2) || (row == 4 && col == 3)){
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
	}

}
