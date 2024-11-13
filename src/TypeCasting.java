

//Typecasting in Java is the process of converting one data type to another data type using the casting operator. 
//
//1. Widening type casting (automatically)
//
//byte -> short -> char -> int -> long -> float -> double
//
//2. Narrow type casting (manually)
//double -> float -> long -> int -> char -> short -> byte

public class TypeCasting {
	

	public static void main(String[] args) {

		byte age = 34;

		int num = age; // byte automatically cast into int
		System.out.println("value of num : " + num);

		long num1 = 34563434;
		num = (int) num1; // long converted into int

		System.out.println("num : "+num);
		
		// Converting String into int and double

		String amount = "32000";

		System.out.println(amount + 100);
		System.out.println(Integer.parseInt(amount) + 100); // we can convert String into int by using
															// "Integer.parseInt()"
		System.out.println(Double.parseDouble(amount) + 100); // we can convert String into double by using
																// "Double.parseDouble()"

		// converting int and double into String by using toString() and
		// String.valueOf()

		// System.out.println(Double.parseDouble(String.valueOf(num)) + 10);

	}

}
