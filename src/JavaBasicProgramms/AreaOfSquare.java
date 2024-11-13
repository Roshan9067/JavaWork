package JavaBasicProgramms;

import java.util.Scanner;
public class AreaOfSquare {
	public static void main(String [] args) {
		double num,Square;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find square");
		num = sc.nextDouble();
		Square = num * num;
		System.out.println("The square of the number is: "+Square);
		
		
	}

}
