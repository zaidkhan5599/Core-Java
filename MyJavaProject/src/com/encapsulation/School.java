package com.encapsulation;

import java.util.Scanner;

public class School {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Student1 s=new Student1();
		System.out.println("Enter the name");
		s.name=sc.next();
		System.out.println("Enter the age");
		s.setAge(sc.nextInt());
		System.out.println("name "+s.name+" age "+s.getAge());
	}
}
