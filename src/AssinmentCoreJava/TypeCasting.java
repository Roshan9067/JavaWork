package AssinmentCoreJava;

public class TypeCasting {
	public static void main(String [] args) {
		byte age=32;
		
		int num = age; // byte automatically cast into intiger
		System.out.println("Value of num: "+num);
		
		long num1 = 123456789;
		num = (int) num1;  //long converted into int
		
		System.out.println("num: "+num);
		
		String amount = "52000";
		
		System.out.println(amount+100);
		System.out.println(Integer.parseInt(amount)+100);
		//convert String into int using (Integer.parseInt();
		
		System.out.println(Double.parseDouble(amount)+500);
		//Convert string into Double using (Double.parseDouble();
		
		
		int num2 = 50;
		System.out.println(Double.parseDouble(String.valueOf(num2))+10);
		
		
		
	}

}
