package com.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HS3 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		//Accessing using for each
		for(Integer i:hs) {
			System.out.println(i);
		}
		System.out.println("+++++++++++");
		//Accessing using Iterator
		Iterator<Integer> n = hs.iterator();
		while(n.hasNext()) {
			System.out.println(n.next());
		}
		}

}
