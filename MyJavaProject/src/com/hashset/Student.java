package com.hashset;

public class Student {
	int rollno;
	String name;
	Student(){
		
	}
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public String toString() {
		return "rollno :"+rollno+"\nname :"+name;
	}
	public int hashCode() {
		int hc=rollno+name.hashCode();
		return hc;
	}
	public boolean equals(Object ob) {
		Student o=(Student) ob;
		return this.rollno==o.rollno && this.name==o.name;
	}
}
