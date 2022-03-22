package com.ejemplos.objects;

import java.util.Objects;

public class Cat extends Dog {
	
	public Cat(String pname, String pbreed, int page) {
		super(pname, pbreed, page);
		
	}

	private int age;
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void showBehavior() {		
		System.out.println(" child class Cat (different Behavior )");
	}

	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return age == other.age;
	}

}
