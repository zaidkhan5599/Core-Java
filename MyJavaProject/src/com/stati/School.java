package com.stati;

public class School {

	public static void main(String[] args) {
		Student.id=1;
		Student.name="Zaid Khan";
		Student.marks=99;
		System.out.println("Name ="+Student.name);
		System.out.println("Id ="+Student.id);
		System.out.println("Marks ="+Student.marks);
		Student.id=2;
		Student.name="Zaid";
		Student.marks=100;
		System.out.println("Name ="+Student.name);
		System.out.println("Id ="+Student.id);
		System.out.println("Marks ="+Student.marks);
	}

}
