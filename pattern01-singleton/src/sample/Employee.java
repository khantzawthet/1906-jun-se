package sample;

public class Employee {

	private String empId;
	private String name;
	private int experience;
	private static Employee INSTANCE = new Employee();
	
	private Employee() {
	}

	public static Employee getInstance() {
//		if(null == INSTANCE) {
//			INSTANCE = new Employee();
//		}
		return INSTANCE;
	}
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
