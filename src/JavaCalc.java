
public class JavaCalc {

	public static void main(String[] args) {
		int n1=50, n2=100, a1= 5, a2= 10, a3= 0;
		
		
		// two variables
		//before swaping
		System.out.println("before swaping");
		System.out.println("n1:"+n1);
		System.out.println("n1:"+n2);
		
		n1= n1 + n2;
		n2= n1 - n2;
		n1= n1 - n2;
		//after swaping
		System.out.println("after swaping");
		System.out.println("n1:"+n1);
		System.out.println("n1:"+n2);
		
		
		//with three variables
		System.out.println("before swaping ");
		System.out.println("a1: "+a1);
		System.out.println("a2: "+a2);
		
		a3=a1;
		a1=a2;
		a2=a3;
		
		System.out.println("after swaping");
		System.out.println("a1: "+a1);
		System.out.println("a2: "+a2);
		
		
	}
}
