package com.hashmap;

public class Employee {
	int id;
	String name;
	Employee(){
		
	}

	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "\n id "+id+"\n name :"+name;
	}
}
