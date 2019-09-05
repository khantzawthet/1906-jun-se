package com.jdc.student;

public class Student {

	private String name;
	private String phone;
	private String address;
	private Courses course;
	private int duration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", address=" + address + ", course=" + course
				+ ", duration=" + duration + "]";
	}

}
