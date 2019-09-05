package autoboxing;

public class Test {

	public static void main(String[] args) {
		int i = 10;
		
		Integer n = 20;
		Integer n1 = new Integer(20);
		
		int number = n;
		System.out.println(number);
		
		int num = n1.intValue();
		
	}
}
