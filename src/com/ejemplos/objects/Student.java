package com.ejemplos.objects;

public class Student extends Teacher {
	
	private String name;
	private String shoolName;
	
	public Student(String name) {
		super(name);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShoolName() {
		return shoolName;
	}

	public void setShoolName(String shoolName) {
		this.shoolName = shoolName;
	}

	void showMessage() {
		
		System.out.println(getName() + " - "+ getShoolName());
	}
}
