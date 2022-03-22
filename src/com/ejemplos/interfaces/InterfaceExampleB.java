package com.ejemplos.interfaces;

public interface InterfaceExampleB {

	public void behavior(String param1);
	
	default void methodDefault() {
		System.out.println("default method in InterfaceExampleB \n");
	}
}
