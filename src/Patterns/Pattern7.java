package Patterns;

public class Pattern7 {
	public static void main(String [] args) {
		
		
		for(int row=1;row<=5;row++) {
			int num=5;
			for(int col=1;col<=row;col++) {
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}

}
