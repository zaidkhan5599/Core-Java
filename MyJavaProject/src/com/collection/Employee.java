package com.collection;

public class Employee {
	int id;
	String name;
	double sal;
	
	Employee(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	@Override
	public String toString() {
		return "id :"+id+" name :"+name+" Salary :"+sal;
	}

}
