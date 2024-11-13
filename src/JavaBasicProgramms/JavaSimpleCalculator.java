package JavaBasicProgramms;

import java.util.Scanner;
public class JavaSimpleCalculator {
	public static void main(String [] args) {
		double num1,num2,Sum,Sub,Multi,Div,Mod;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		num1=sc.nextDouble();
		
		System.out.println("Enter Number 2: ");
		num2=sc.nextDouble();
		
		Sum = num1 + num2;
		Sub = num1 - num2;
		Multi = num1 * num2;
		Div = num1 / num2;
		Mod = num1 % num2;
		
		
		
		System.out.println("Addition of num1 and num2: "+Sum);
		System.out.println("Substraction of num1 and num2: "+Sub);
		System.out.println("Mutliplication of num1 and num2: "+Multi);
		System.out.println("Divisin of num1 and num2: "+Div);
		System.out.println("Modulo of num1 and num2: "+Mod);
		
		
		
		
		
		
		
		
	}
		

}
