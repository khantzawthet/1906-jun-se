package object.stream;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 123L;
	private String code;
	private String name;
	private int experience;
	private transient double salary;
	
	public Employee(String code, String name, int experience, double salary) {
		this.code = code;
		this.name = name;
		this.experience = experience;
		this.salary = salary;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getExperience() {
		return experience;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [code=" + code + 
				"\nname=" + name + 
				"\nexperience=" + experience + 
				"\nsalary=" + salary + "]";
	}

	
}
