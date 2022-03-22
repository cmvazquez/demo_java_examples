package com.ejemplos.objects;



public class Person implements Comparable<Person> {
	
	private Integer id;
	private String name;
	private Integer age;
	
	
	public Person( Integer id, String name,Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

	@Override
	public String toString() {
		
		return  getId()+ " - "+ getName() + " - " + getAge();
	}

	@Override
	public int hashCode() {
		
		return (int) id * name.hashCode() * age.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean equalsId = false;
		boolean equalsName = false;
		boolean equalsAge = false;
		
		if(this == obj)
			return true;
		
		if(! (obj instanceof Person))
			return false;
		
		Person other = (Person) obj;		
		if( (other == null && this != null) || (other != null && this == null))
			return false;
						
		equalsName = (this.name == null && this.name.equals(other.name)) || 
				(this.name != null && this.name.equals(other.name));
		equalsAge = (this.age == null && this.age.equals(other.age)) || 
				(this.age != null && this.age.equals(other.age));
		equalsId = (this.id == null && this.id.equals(other.id)) || 
				(this.id != null && this.id.equals(other.id));
		
		if(equalsId && equalsName && equalsAge )
			return true;
		else 
			return false;
	}

	@Override
	public int compareTo(Person o) {
		
		return this.name.compareTo(o.getName());
	}
	 
}
