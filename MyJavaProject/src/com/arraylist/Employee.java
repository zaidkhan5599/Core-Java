
package com.arraylist;

public class Employee {
	String name;
	int id;
	double stipend;
	Employee(){
		
	}
	Employee(String name,int id,double stipend){
		this.name=name;
		this.id=id;
		this.stipend=stipend;
	}
	public String toString() {
		return "Name is :"+name+" id is :"+id+" stipend is :"+stipend;
	}
}
