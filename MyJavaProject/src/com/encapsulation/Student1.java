package com.encapsulation;
public class Student1 {
	String name;
	private int age;
	public Student1() {
		
	}
	Student1(String name){
		this.name=name;
		setAge(age);
	}
	void setAge(int age) {
		if(age>4 && age<=60) {
		this.age=age;
		}	
		else {
			System.out.println("Invalid Age ");
			System.out.println("Enter valid age ");
			setAge(School.sc.nextInt());
		}
	}
	int getAge() {
		return age;
	}
}