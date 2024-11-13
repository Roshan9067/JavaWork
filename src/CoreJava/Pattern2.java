package CoreJava;

public class Pattern2 {
	public static void main(String[] args) {
		
		

		for(int row=1;row<= 5;row++) {
			int num = row;
			for(int col=1;col<=row;col++) {
				System.out.print(num--);
				
				
			}
			System.out.println();
			
			
		}
	}

}


 