package com.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HM3 {

	public static void main(String[] args) {
		HashMap<Integer,Employee> emp=new HashMap<>();
		emp.put(1,new Employee(1,"Dinga"));
		emp.put(2, new Employee(2,"Dingi"));
		System.out.println(emp);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of the employee id to be searched ");
		int i=sc.nextInt();
		if(emp.containsKey(i)) {
		//System.out.println("Employee Details "+emp.get(i));//returns value object that employee
			Employee e=emp.get(i);
			System.out.println(e.id);
			System.out.println(e.name);
		}
		
		
	}

}
