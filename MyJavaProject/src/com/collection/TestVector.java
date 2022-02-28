package com.collection;

import java.util.Iterator;
import java.util.Vector;


public class TestVector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Dingi");
		v.add("Dinga");
		v.add("Mangi");
		v.add("Manga");
		v.add("pinki");
		v.add("pinka");
		
		System.out.println(v);
		
		Iterator it=v.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(v);
	}

}
