package Patterns;

public class Pattern33 {
	public static void main(String[] args) {
		
		for(int row=1; row<=7;row++) {
			for(int col=1; col<=7;col++) {
				
				if((row==2) && (col==3) || (row==2) && (col==4) ||(row==2) && (col==5)) {
					System.out.print("  ");
				}else if((row==3) && (col==2) || (row==3) && (col == 4) || (row==3) && (col==6)){
					System.out.print("  ");
				}else if((row==4) && (col==2) || (row==4) && (col==3) || (row==4) && (col==5) || (row==4) && (col==6)){
					System.out.print("  ");
				}else if((row==5) && (col==2) || (row==5) && (col==4) || (row==5) && (col==6)){
					System.out.print("  ");
			    }else if((row==6) && (col==3) || (row==6) && (col==4) || (row==6) && (col==5)){
				System.out.print("  ");
			    }else {
					System.out.print(" *");
				}
				
			}
			System.out.println();
			
		}
	}

}
 