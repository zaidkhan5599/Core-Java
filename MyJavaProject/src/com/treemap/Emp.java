package com.treemap;

public class Emp {
	Id id;
	String name;
	double sal;
	Emp(){
		
	}
	public Emp(Id id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString() {
		return ""+name+" "+sal;
	}

}
