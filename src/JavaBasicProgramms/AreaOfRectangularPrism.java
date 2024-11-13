package JavaBasicProgramms;

import java.util.Scanner;

public class AreaOfRectangularPrism {
	public static void main(String [] args) {
		double w,l,h,area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter height");
		h = sc.nextDouble();
		

		System.out.println("Enter length");
		l = sc.nextDouble();
		

		System.out.println("Enter width");
		w = sc.nextDouble();
		
		area = 2 * (w*l+h*l+h*w);
		
		System.out.println("The area of rectangular prism is: " +area);
		
		
		
		
		
		
	}

}
