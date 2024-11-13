package JavaBasicProgramms;


import java.util.*;
public class SwitchCase{
	public static void main(String [] args) {
		int subjects = 5;
		int totalmarks;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Total Marks :");
		totalmarks = s.nextInt();
		
		int avg = totalmarks/subjects;
		
		if(totalmarks <= 500 && totalmarks >= 0) {
			System.out.println("The Average is : "+(avg));
		}else {
			System.out.println("Invalid marks");
		}
		
		int n = avg/10;
		
		switch(n) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("A Grade");
			break;
			
		case 6:
		case 5:
		
			System.out.println("B Grade");
			break;
			
		case 4:
		case 3:
			System.out.println("C Grade ");
			break;
			
		case 2:
		case 1:
		case 0:
			System.out.println("Failed ");
			break;
		
		
		}
		
	}
	
}