package Patterns;

public class HalfOfSquare {
	
		public static void main(String [] args) {
			int num = 5;
			
			for(int row=1;row<=5;row++) {
				for(int col=5;col>=row;col--) {
					System.out.print(col+" ");
				}
				System.out.println();
			}
		}
	}



