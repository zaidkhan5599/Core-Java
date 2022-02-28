package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
//		ls.add(new Employee(1));
//		ls.add(new Student(101));
//		ls.add(new Bik(15));
//		ls.add(new Employee(2));
//		ls.add(new Student(102));
//		ls.add(new Bik(12));
//		System.out.println(ls);
		for(int i=0;i<ls.size();i++) {
			Object ob = ls.get(i);
			System.out.println(ob);
		}
		System.out.println("++++++++++");
		for(Object ob:ls) {
			System.out.println(ob);
		}
		System.out.println("+++++++++++++++");
		Iterator n = ls.iterator();
		while(n.hasNext()) {
			System.out.println(n.next());
		}
		
	}

}
