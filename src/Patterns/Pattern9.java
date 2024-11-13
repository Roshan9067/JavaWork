package Patterns;

public class Pattern9 {
	public static void main(String [] args) {
		
		int n=5;
		
		for(int row=n; row>=1; row--) {
			for(int col=n; col>=row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
}
		
		
