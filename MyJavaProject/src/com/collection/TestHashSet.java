package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet set=new HashSet<>();
		set.add("name");
		//set.add(true);
		set.add(10==10);
		set.add("true");
		set.add(56);
		set.add(56.89);
		set.add(null);
		set.add("name");
		set.add(null);
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
