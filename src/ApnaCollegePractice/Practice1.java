package ApnaCollegePractice;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		
		double num1, num2, num3;
		
		Scanner c = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		num1 = c.nextDouble();
		
		System.out.println("Enter number 2:");
		num2 = c.nextDouble();
		
		System.out.println("Enter number 3: ");
		num3 = c.nextDouble();
		
		double avg;
		
		avg = (num1+num2+num3) /(3);
		
		System.out.println("The average is: "+ avg);
		
	}

}
