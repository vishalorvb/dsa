package com.streamapi;

public class Student {
	String name;
	Integer marks;
	Integer age;
	Integer roll;
	public Student(String name, Integer marks, Integer age, Integer roll) {
		super();
		this.name = name;
		this.marks = marks;
		this.age = age;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return this.name;
	}
	

}
