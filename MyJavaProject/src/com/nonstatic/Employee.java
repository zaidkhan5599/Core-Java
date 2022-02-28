package com.nonstatic;

public class Employee {
	static int count;
	String id="Capg";
	String name;
	double sal;
	Employee(){
		count++;
		this.id=this.id+count;
	}
	Employee(String name,double sal){
		this();
		this.name=name;
		this.sal=sal;
	}
}
