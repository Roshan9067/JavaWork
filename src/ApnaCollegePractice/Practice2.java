package ApnaCollegePractice;
import java.util.Scanner;
public class Practice2 {
	public static void main(String[] args) {
		
		
		Scanner c = new Scanner(System.in);
		
		System.err.println("Enter number whic you want sunm of odd number: ");
		int a = c.nextInt(); 
		
		
		 int sum = 0;
		for(int b=1; b<=a; b++) {
			if(b % 2 != 0) {
			    sum += b;
			}
		}
		System.out.print(sum);
	}

}
