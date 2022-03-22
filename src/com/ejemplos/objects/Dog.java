package com.ejemplos.objects;

public class Dog extends Animal {
	
	private int age;
	
	public Dog(String pname,String pbreed,int page) {
		super(pname,pbreed);
		this.age = page;		
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void showBehavior() {
	
		System.out.println(" child class dog (different Behavior )");
	}

}
