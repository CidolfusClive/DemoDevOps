package com.main.appdet;

public class Student  extends Person{

	private String Id, section, course;
	int year;
	
	public Student(String id,  String section, String course, int year, String name, String gender, int age) {
		super( name,  gender,  age);
		this.Id = id;
		this.section = section;
		this.course = course;
		this.year = year;
	}
	
	
	public void displayStudentDetails() {
		System.out.println("ID: " + getId());
		System.out.println("Section: " + getSection());
		System.out.println("Course: " + getCourse());
		System.out.println("Year: " + getYear());
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
	
}
