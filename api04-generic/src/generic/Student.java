package generic;

public class Student <T> {

	private T name;

	public Student() {
	}
	
	public Student(T name) {
		this.name = name;
	}
	
	public T getName() {
		return name;
	}
	
	public void setName(T name) {
		this.name = name;
	}
	
}
