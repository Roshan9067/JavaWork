package AssinmentCoreJava;

import java.util.Scanner;
public class Calculator {
	public static void main(String [] args) {
		double num1,num2;
		int choise;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		num1 = sc.nextDouble();
		
		System.out.println("Enter number 2:");
		num2 = sc.nextDouble();
		
		
		
		System.out.println("Choose the operation between 1 to 7"); 
		System.out.println("1.Addition");
		System.out.println("2.Substration");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Less then number 1");
		System.out.println("6.Greater then number 1");
		System.out.println("7. Equal ");

		
		System.out.println("Choose number Which operation you want to perform");
		choise = sc.nextInt();
		
		switch (choise) {
			case 1:
				System.out.println("Addition: "+(num1+num2));
			break;
			
			case 2:
				System.out.println("Substraction: "+(num1-num2));
			break;
			
			case 3:
				System.out.println("Multiplication: "+(num1*num2));
			break;
			
			case 4:
				if(num2 > 0) {
					System.out.println("Division: "+(num1/num2));
				}else {
					System.out.println("Please enter valid number not divisible  by 0");
				}
				break;
			
			case 5:
				System.out.println("Number 2 is less then number 1: "+(num1 > num2 ));
				break;
				
			case 6:
				System.out.println("Number 2 is greater then number 2: "+(num1 < num2));
				break;
				
			case 7:
				System.out.println("Number 1 is equal to number2: "+(num1 == num2));
				break;
				
			default:
				System.out.println("Please enter valid number between 1 to 7");
				
		}
		
	}

	
}
