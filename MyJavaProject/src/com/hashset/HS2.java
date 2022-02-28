package com.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HS2 {

	public static void main(String[] args) {
		HashSet hs=new HashSet<>();
		hs.add(10);
		hs.add("Sheela");
		hs.add(20.0);
		System.out.println("Accessing using for each");
		//Accessing using for each
		for(Object o:hs) {
			System.out.println(o);
		}
		System.out.println("Accessing using Iterator");
		//Accessing using Iterator
		Iterator n = hs.iterator();
		while(n.hasNext()) {
			System.out.println(n.next());
		}
		
	}

}
