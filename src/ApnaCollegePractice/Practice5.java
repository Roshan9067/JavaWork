package ApnaCollegePractice;
import java.util.*;

public class Practice5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		int zero = 0;
		char choise;
		
		do { 
			System.out.print("Enter number: ");
			int number = sc.nextInt();
			
			if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
			
			System.out.print("Do you want to enter another number? (y/n): ");
            choise = sc.next().charAt(0);
			
		}while(choise == 'y' || choise == 'Y');
		
		System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
		
			
			 
		
		
		
		

       

    }
}