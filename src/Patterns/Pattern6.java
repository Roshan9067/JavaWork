package Patterns;

public class Pattern6 {
	public static void main(String [] args) {
		int num=1;
		
		for(int row=1; row<=5; row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
