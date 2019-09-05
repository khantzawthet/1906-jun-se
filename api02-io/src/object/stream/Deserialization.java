package object.stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String[] args) {
		
		try (ObjectInputStream input = new ObjectInputStream(
				new FileInputStream("emp.obj"))){
			
			Employee[] employees = (Employee[]) input.readObject();
			
//			System.out.println(employee);
			for(int i = 0; i < employees.length; i++) {
				System.out.println(employees[i]);
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
