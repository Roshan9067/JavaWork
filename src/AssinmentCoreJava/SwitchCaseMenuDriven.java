//creating ATM.
package AssinmentCoreJava;

import java.util.*;

public class SwitchCaseMenuDriven {
	public static void main(String [] args) {
		double Balence =100000,withdrawal,deposite,balancecheak,Updatedbal;
		int atm;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Withdraw the money");
		System.out.println("2. deposite money");
		System.out.println("3. cheak Balence");
		
		
		
		System.out.println("Press button to perform task");
		atm = sc.nextInt();
		
		
		switch(atm) {
		case 1:
			System.out.println("Enter Amount To Withdraw");
			withdrawal = sc.nextDouble();
			if(withdrawal <= Balence) {
			Updatedbal = Balence - withdrawal;
			System.out.println("Withdrawal Succeful reaming Balence is: "+Updatedbal);
			}
			break;
			
			case 2:
				System.out.println("Enter Amount To Deposite");
				deposite = sc.nextDouble();
				Updatedbal = Balence + deposite;
				System.out.println("Deposite Succeful updated Balence is: "+Updatedbal);
				break;
				
			case 3:
				System.out.println("Balence is:"+Balence);
				
				
			}
			
		}
	}
				
				
		

