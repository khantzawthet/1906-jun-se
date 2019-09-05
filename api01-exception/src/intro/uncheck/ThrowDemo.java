package intro.uncheck;

public class ThrowDemo {
	
	public static void main(String[] args) {
		showLength(null);
	}
	
	static void showLength(String str) {
//		System.out.println("Size: " + ("".length()));
		
		if(str == null)
			throw new RuntimeException("String should not be empty");
		
		System.out.println("Totals Alphabet: " + str.length());
		
	}

}
