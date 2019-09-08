package customsort;

public class Student implements Comparable<Student>{

	private String name;
	private int age;
	private String school;
	private double fees;
	
	public Student(String name, int age, String school, double fees) {
		this.name = name;
		this.age = age;
		this.school = school;
		this.fees = fees;
	}

	public String getName() {
		return name;
	}
	
	public String getSchool() {
		return school;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getFees() {
		return fees;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(fees);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((school == null) ? 0 : school.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(fees) != Double.doubleToLongBits(other.fees))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (school == null) {
			if (other.school != null)
				return false;
		} else if (!school.equals(other.school))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nStudent [name=" + name + "\nage=" + age + "\nschool=" + school + "\nfees=" + fees + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.getName());
	}
}
