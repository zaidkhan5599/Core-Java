package com.ToString;

public class Employee {
	String name;
	int id;
	double sal;
	Employee(){
		
	}
	public Employee(String name, int id, double sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public boolean equals(Object ob) {
		Employee e=(Employee)ob;
		return this.name==e.name && this.id==e.id && this.sal==sal;
	}
	public String toString() {
		return " Employee name : "+name+ " Id is :"+id+" Salary is: "+sal;
	}

	

}