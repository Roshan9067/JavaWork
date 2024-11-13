package Patterns;

public class Pattern37 {
	public static void main(String[] args) {
		
		for(int row=1; row<=9;row++) {
			for(int col=1; col<=9; col++) {
				
				if((row==2) && (col%2==0)) {
					System.out.print("  ");
				}else if((row==3 && col==4) || (row==3 && col==6) || (row==3 && col==8)){
					System.out.print("  ");
				}else if((row==4 && col==2) || (row==4 && col==3) || (row==4 && col==4) || (row==4 && col==6) || (row==4 && col==8)){
					System.out.print("  ");
				}else if((row==5 && col==6) || (row==5 && col==8)) {
					System.out.print("  ");
				}else if((row==6 && col==2) || (row==6 && col==3) || (row==6 && col==4) || (row==6 && col==5) || (row==6 && col==6)|| (row==6 && col==8)){
					System.out.print("  ");
				}else if(row==7 && col==8) {
					System.out.print("  ");
				}else if((row==8 && col==2) || (row==8 && col==3) || (row==8 && col==4) || (row==8 && col==5) || (row==8 && col==6)|| (row==8 && col==7) || (row==8 && col==8)){
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
			
		}
		
	}

}
