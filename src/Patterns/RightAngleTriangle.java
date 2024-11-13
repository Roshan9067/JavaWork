package Patterns;

public class RightAngleTriangle {
	public static void main(String [] args) {
		int num = 5;
		
		for(int raw = 1; raw <=5; raw++) {
			for(int col = 1; col <= raw; col++) {
				System.out.print(" * ");
			}
	
			System.out.println();
		}
	}

}
