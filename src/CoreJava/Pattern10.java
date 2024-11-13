package CoreJava;

public class Pattern10 {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int col=5;col>=row;col--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				if(col%2==0) {
					System.out.print("0");
				}else {
					System.out.print("1");
				}
				
			}
			System.out.println();
		}
	}

}
