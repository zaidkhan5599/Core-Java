package com.hashset;

import java.util.HashSet;

public class HS1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet<>();
		hs.add(10);
		hs.add("Sheela");
		hs.add(20.0);
		hs.add(new Emloyee(1));
		hs.add(null);
		System.out.println(hs);
		System.out.println("Add 1"+hs.add(10));
		System.out.println(hs);
		System.out.println(hs.add(null));
		System.out.println(hs.remove("Sheela"));
		System.out.println(hs.size());
		hs.clear();
		System.out.println("Empty"+hs.isEmpty());
		
		
	}

}
