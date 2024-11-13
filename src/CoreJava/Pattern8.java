package CoreJava;

public class Pattern8 {
	public static void main(String[] args) {
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(" ");
			}
			for(int col=row;col<=5;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
