package com.ejemplos.objects;

public class Teacher extends Person3 {
	
	private String name;
	private String shoolName;
	
	public Teacher(String name) {
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
