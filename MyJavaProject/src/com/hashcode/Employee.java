/*
 * Write a program to create a class know as Employee(name,id,salary) and a sub class Developer(language).
Override toString(), equals(), hashCode().
 */
package com.hashcode;

public class Employee {
	String name;
	int id;
	double sal;
	boolean stipend;
	Employee(){
		
	}
	public Employee(String name, int id, double sal,boolean stipend) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.stipend=stipend;
	}
	public boolean equals(Object ob) {
		Employee e=(Employee)ob;
		return this.name==e.name && this.id==e.id && this.sal==sal
				&& this.stipend==e.stipend;
	}
	public String toString() {
		return " Employee name : "+name+ " Id is :"+id+" Salary is: "+sal+" stipend :"+stipend;
	}
	public int hashCode() {
		int hc;
		if(stipend) {
			hc=1;
		}
		else
			hc=0;
		return hc+id+name.hashCode()+(int)sal;
	}

}
