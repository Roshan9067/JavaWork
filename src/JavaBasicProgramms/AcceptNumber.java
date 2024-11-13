package JavaBasicProgramms;

import java.util.Scanner;
public class AcceptNumber {
	public static void main(String [] args){
		int Student,Apple;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of student");
		Student = sc.nextInt();
		
		Apple = 5 * Student;
		
		System.out.println("Total Apple is :"+Apple);
		
		
	}

}
