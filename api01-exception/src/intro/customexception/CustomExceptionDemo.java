package intro.customexception;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		showLength(null);
	}

	private static void showLength(String name) {
		
		if(name == null)
			throw new JDCException("String should not be empty !!!");
		
		System.out.println("Length: " + name.length());
	}
	
	
}
