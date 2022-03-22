package com.ejemplos.objects;

import java.math.BigDecimal;

public  class Developer {

	public String name = "field in super class";
	private BigDecimal salary;
	public String fieldPublic;
	private String fieldPrivate;
	protected String fieldProtected;
	
	public Developer(){ }
	
	protected void messagesProtected() {
		System.out.println(" method superclass: protected void messagesProtected() \n");
		System.out.println("testing protected method inside the super class \n");
		System.out.println("calling private method in the superclass \n");
		messagesPrivate();
	}
	
	private void messagesPrivate() {
		System.out.println(" method superclass: private void messagesPrivate()\n");
		System.out.println("testing private method inside the super class");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public String getFieldPublic() {
		return fieldPublic;
	}
	public void setFieldPublic(String fieldPublic) {
		this.fieldPublic = fieldPublic;
	}
	public String getFieldPrivate() {
		return fieldPrivate;
	}
	public void setFieldPrivate(String fieldPrivate) {
		this.fieldPrivate = fieldPrivate;
	}
	public String getFieldProtected() {
		return fieldProtected;
	}
	public void setFieldProtected(String fieldProtected) {
		this.fieldProtected = fieldProtected;
	}
}
