package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {

	public static void main(String[] args) {
		ArrayList<Employee> ls=new ArrayList<>();
		ls.add(new Employee("A",1,8000));
		ls.add(new Developer("B",2,5000,"Java"));
		ls.add(new Employee("C",3,25000));
		ls.add(new Developer("D",4,5000,"Python"));
		System.out.println(ls);
		//Accessing using get(int i)
		for(int i=0;i<ls.size();i++) {
			Employee ob = ls.get(i);
			System.out.println(ob);
		}
		System.out.println("++++++++++");
		//Accessing using for each loop
		for(Employee ob:ls) {
			System.out.println(ob);
		}
		//Accessing using iterator()
		System.out.println("++++++++++++");
		Iterator<Employee> n = ls.iterator();
//		while(n.hasNext()) {
//			System.out.println(n.next());
//		}
//		System.out.println("Accessing specifically ");
		//
		while(n.hasNext()) {
			Employee e=n.next();
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Stipend is "+e.stipend);
			
			if(e instanceof Developer)
			{
				Developer d=(Developer)e;
			System.out.println("Lang is " +d.lang);
		}
		}
	}

}
