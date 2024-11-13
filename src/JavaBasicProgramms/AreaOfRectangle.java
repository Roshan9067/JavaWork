package JavaBasicProgramms;

import java.util.Scanner;
public class AreaOfRectangle {
	public static void main(String [] args) {
		double length, width, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
		length = sc.nextDouble();
		
		System.out.println("Enter the width");
		width = sc.nextDouble();
		
		area = length * width;
		
		System.out.println("The Ara od rectangle is: "+area);
	}

}
