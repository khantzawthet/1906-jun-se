package sample;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = Employee.getInstance();
		Employee emp2 = Employee.getInstance();
		
		if(emp == emp2) {
			System.out.println("Same obj");
		}else {
			System.out.println("Different obj");
		}
		
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		
		emp.setName("Aung");
//		emp2.setName("Mg Mg");
		
		System.out.println(emp.getName());
		System.out.println(emp2.getName());
	}
}
