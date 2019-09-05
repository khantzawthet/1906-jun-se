package com.jdc.student;

public enum Courses {

	JAVA_SE("Java Standard"),
	JAVA_EE("Java Enterprise"),
	SPRING("Spring Framework");
	
	private String courseName;
	
	private Courses(String courseName) {
		this.courseName = courseName;
	}
	
	@Override
	public String toString() {
		return courseName;
	}
}
