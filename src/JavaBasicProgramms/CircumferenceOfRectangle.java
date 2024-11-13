package JavaBasicProgramms;

import java.util.Scanner;
public class CircumferenceOfRectangle {
	public static void main(String [] args) {
		double length,width,cir;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enther length");
		length = sc.nextDouble();
		
		System.out.println("Enter width");
		width = sc.nextDouble();
		
		cir = 2 * (length + width);
		
		System.out.println("Circumference of rectangle is: "+cir);
		
		
		
	}

}
