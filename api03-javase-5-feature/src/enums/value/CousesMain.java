package enums.value;

public class CousesMain {
	
	public static void main(String[] args) {
		
		Courses[] courses = Courses.values();
		int total = 0;
		
		for (Courses c : courses) {
			System.out.println(c);
			total += c.getFees();
		}
		
		System.out.println("Total : " + total);
	}

}
