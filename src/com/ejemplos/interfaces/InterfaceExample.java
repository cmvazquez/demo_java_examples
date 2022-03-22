package com.ejemplos.interfaces;

public interface InterfaceExample {
	
   
	
	public void behavior(String param1);
	
	default void methodDefault() {
		System.out.println("default method in InterfaceExample \n");
	}
}
