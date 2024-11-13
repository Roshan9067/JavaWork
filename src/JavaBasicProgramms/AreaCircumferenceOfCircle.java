package JavaBasicProgramms;

import java.util.Scanner;
public class AreaCircumferenceOfCircle {
	public static void main(String [] args) {
		double radius,area,circumference;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Radius");
		radius = s.nextDouble();
		System.out.println("Area of the circle");
		area = 3.14 * radius * radius;
		System.out.println("Area : "+area);
		
		
		System.out.println("Circumference of the circle");
		circumference = 2 * 3.14 * radius;
		System.out.println("Circumference : "+circumference);
		
		
		
	}
	
	

}
