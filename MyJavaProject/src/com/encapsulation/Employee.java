package com.encapsulation;

public class Employee {
	private String id;
	Employee(){
		
	}
	Employee(int id){
		this.id="CapG"+id;
	}
	String getId() {
		return id;
	}

}
