package Patterns;

public class Pattern8 {
	public static void main(String [] args) {
		int num = 5;
	    
	    for(int row = 1; row <= num; row ++){
	        for(int col = num-row+1; col >= 1; col -= 1)
	        {
	        	System.out.print(col +" ");
	        	}
	        System.out.println();
	        }
	        
	}

}
