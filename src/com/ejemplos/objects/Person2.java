package com.ejemplos.objects;

import java.util.Comparator;
import java.util.Objects;

public class Person2  implements Comparable<Person2> {
	
	private Integer id;
	private String name;
	private Integer age;
	
	
	public Person2( Integer id, String name,Integer age) {
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
	public int compareTo(Person2 o) {
		int res = 0;
		
		/*
		 if (this.getName().equals(o.getName()))
			 res = 0;
		 else if (this.getName().hashCode()< o.getName().hashCode())
			  res = -1;
		 else 
			 res = 1;
		*/ 
		 return this.getName().compareTo(o.getName());
			 
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;
		return Objects.equals(age, other.age) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	

	
	
	
	 
}
