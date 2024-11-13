package JavaBasicProgramms;
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String [ ] args) {
		double base, height,Area;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the base of the triangle");
		base = sc.nextDouble();
		
		System.out.println("Enter the height of the triangle");
		height = sc.nextDouble();
		
		Area = base * height * 0.5;
		
		System.out.println("The area of triangle is: "+Area);
		
	}

}
