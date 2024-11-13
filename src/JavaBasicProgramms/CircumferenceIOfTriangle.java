package JavaBasicProgramms;

import java.util.Scanner;
public class CircumferenceIOfTriangle {
	public static void main(String [] args) {
		double a, b, c,circum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of A");
		a = sc.nextDouble();
		
		System.out.println("Enter value of B");
		b = sc.nextDouble();
		
		System.out.println("Enter value of C");
		c = sc.nextDouble();
		
		circum = a + b + c;
		
		System.out.println("Circumference of the triangle is:" +circum);
		
		
		
		
		
	}
	

}
