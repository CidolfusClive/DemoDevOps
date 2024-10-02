package com.main.appdet;

public class Person {
	
 private String name, gender;
 private int age;
 
public Person(String name, String gender, int age) {
	this.name = name;
	this.gender = gender;
	this.age = age;
}

public void displayPersonDetails() {
	System.out.println("Name: " + getName());
	System.out.println("Gender: " + getGender());
	System.out.println("Age: " + getAge());

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
 
 

}
