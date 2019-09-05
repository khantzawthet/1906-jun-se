package generic;

public class GenericStudent {

	public static void main(String[] args) {
		Student<String> student = 
				new Student<String>();
		
		student.setName("Kyaw Kyaw");
//		student.setName(12);
		
		System.out.println(student.getName());
		
		Student<Integer> intData = 
				new Student<Integer>();
		
		intData.setName(12);
		
		MyClass obj = new MyClass();
		obj.setName("Kyaw Kyaw");
		obj.setName(12);
		
		
		
	}
}
