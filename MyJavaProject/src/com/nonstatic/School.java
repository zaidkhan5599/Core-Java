package com.nonstatic;

public class School {

	public static void main(String[] args) {
		Student s=new Student();
		s.id=1;
		s.marks=99;
		s.name="Zaid";
		System.out.println(s);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.marks);
		Student s1=new Student();
		s1.id=2;
		s1.marks=10;
		s1.name="Khan";
		System.out.println(s1);
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		
	}

}
