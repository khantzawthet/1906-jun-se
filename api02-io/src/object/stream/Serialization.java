package object.stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
		
		employees[0] = new Employee("EMP-01", "U Mya", 8, 700_000);
		employees[2] = new Employee("EMP-02", "U Hla", 6, 500_000);
		employees[1] = new Employee("EMP-03", "U Min Thu", 5, 400_000);
		
		
		try(ObjectOutputStream output = new ObjectOutputStream(
				new FileOutputStream("emp.obj"))) {
			
			output.writeObject(employees);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
