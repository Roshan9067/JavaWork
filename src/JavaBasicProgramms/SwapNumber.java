package JavaBasicProgramms;

import java.util.Scanner;
public class SwapNumber {
	public static void main(String [] args) {
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		//With out third variable
		
		System.out.println("Before Swaping");
		System.out.println("Enter number 1");
		num1 = sc.nextInt();
		
		System.out.println("Enter number 2");
		num2 = sc.nextInt();
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		
		
		System.out.println("After Swapin");
		System.out.println("number 1: "+num1);
		System.out.println("number 2: "+num2);
		
	
		
	}

}
