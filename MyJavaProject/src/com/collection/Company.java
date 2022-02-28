package com.collection;

import java.util.ArrayList;

public class Company {

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Dinga",17000);
		Employee emp2=new Employee(101,"Dinga",17285);
		Employee emp3=new Employee(103,"Pinka", 18000);
		Employee emp4=new Employee(104,"Pinki",19000);
		Employee emp5=new Employee(105,"Mangi",2332230);
		
		ArrayList<Employee> ls=new ArrayList<>();
		ls.add(emp1);
		ls.add(emp2);
		ls.add(emp3);
		ls.add(emp4);
		ls.add(emp5);
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
	}

}
