package Patterns;

public class Pattern35 {
	public static void main(String[] args) {
		
		for(int row=1; row<=5;row++) {
			for(int col=1; col<=5;col++) {
				
				if((row==1) && (col==2) ||(row==1) && (col==3) ||(row==1) && (col==4)) {
					System.out.print("  ");
				}else if((row==2) && (col==1) ||(row==2) && (col==3) ||(row==2) && (col==5)) {
					System.out.print("  ");
				}else if((row==3) && (col==1) ||(row==3) && (col==2) ||(row==3) && (col==4) ||(row==3) && (col==5)){
					System.out.print("  ");
				}else if((row==4) && (col==1) ||(row==4) && (col==3) ||(row==4) && (col==5)) {
					System.out.print("  ");
				}else if((row==5) && (col==2) ||(row==5) && (col==3) ||(row==5) && (col==4)) {
					System.out.print("  ");
				}else {
					System.out.print(" *");
				}
				
			}
			System.out.println();
			
		}
	}

}
