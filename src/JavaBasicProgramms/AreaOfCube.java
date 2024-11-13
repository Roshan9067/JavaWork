package JavaBasicProgramms;

import java.util.Scanner;
public class AreaOfCube {
	public static void main(String [] args) {
		double num,cube;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find cube");
		
		num = sc.nextDouble();
		cube = num * num * num;
		
		System.out.println("The cube of the number is: "+cube);
		
		
	}

}
