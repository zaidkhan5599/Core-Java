package com.arraylist;

import java.util.ArrayList;

public class AL2 {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add('a');
		ls.add(false);
		ls.add("Hello World");
		Bike b=new Bike("Duke",20.5);
		ls.add(b);
		System.out.println(ls);
		
	}

}
