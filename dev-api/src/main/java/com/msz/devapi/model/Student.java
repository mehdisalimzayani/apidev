package com.msz.devapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "students")
public class Student {
	
	@Id
	private String id;
	
	private String firstName;
	private String lastName;
	private int age;
	private boolean nightCourses;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isNightCourses() {
		return nightCourses;
	}
	public void setNightCourses(boolean nightCourses) {
		this.nightCourses = nightCourses;
	}
	public Student() {
		super();
	
	}
	
	

}
