package com.hashset;

import java.util.HashSet;

public class HS4 {

	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<>();
		hs.add(new Student(1,"A"));
		hs.add(new Student(2,"B"));
		hs.add(new Student(1,"A"));
		hs.add(new Student(3,"C"));
		for(Student s:hs)
			System.out.println(s);
		
	}

}
