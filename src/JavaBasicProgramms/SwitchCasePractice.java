package JavaBasicProgramms;

import java.util.*;
public class SwitchCasePractice {
	public static void main(String [] argd) {
		double num;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Any number to cheak positive ,negative and Zero.");
		num = s.nextInt();
		
		int cs;
		
		if(num > 0) {
			cs = 1;
		}else if(num < 0) {
			cs = 2;
		}else {
			cs = 3;
		}
		
		
		
		switch(cs) {
		
		case 1:
			System.out.println("The number is positive");
			break;
			
		case 2:
			System.out.println("The number is Negetive");
			break;
			
		case 3:
			System.out.println("The number is equal to Zero");
			break;
		}
		
	}

}
