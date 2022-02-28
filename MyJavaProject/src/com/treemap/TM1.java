package com.treemap;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TM1 {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(1,"Dinga");
		tm.put(2, "Dingi");
		tm.put(3, "Kaalu");
		//tm.put("Ssjlj", 11); ClassCastException
		tm.put(4, null);
		System.out.println(tm);
		//tm.put(null, "Kaali");NullPointerException
		System.out.println(tm.get(1));//Returns value Object ie String
		Set keys=tm.keySet();
		for(Object o:keys) {
			System.out.println(o);
		}
		Collection c = tm.values();
		System.out.println(c);
	}

}
