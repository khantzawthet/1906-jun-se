package enums;

public class After {
	
	public static void main(String[] args) {
		
		Hobby hobby = Hobby.Reading;
		System.out.println(hobby.toString());
		
		
		Hobby[] values = Hobby.values();
		for (Hobby hobby2 : values) {
			System.out.println(hobby2);
		}
		
		Hobby hob = Hobby.valueOf("Other");
		System.out.println("Custom: " + hob);
	}
}
