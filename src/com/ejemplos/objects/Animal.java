package com.ejemplos.objects;

public abstract class Animal {
	
	private String name;
	private String breed;
	
	public Animal(String pname,String pbreed ) {
		this.name = pname;
		this.breed = pbreed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public abstract void showBehavior() ;
	
}
