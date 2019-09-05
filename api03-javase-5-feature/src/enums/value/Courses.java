package enums.value;

public enum Courses {
	
	JAVA_SE("Java Standard Edition", 180_000), 
	JAVA_EE("Java Enterprise Edition", 300_000), 
	SPRING("Spring Framework", 300_000), 
	ANDROID("Android Fundamental", 200_000),
	KOTLIN("Kotlin Fundamental", 180_000);
	
	private String courseName;
	private int fees;
	
	private Courses(String courseName, int fees) {
		this.courseName = courseName;
		this.fees = fees;
	}
	
	public int getFees() {
		return fees;
	}
	
	@Override
	public String toString() {
		return courseName;
	}

}
