package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> link=new LinkedHashSet<>();
		link.add("leela");
		link.add("laila");
		link.add("neela");
		link.add(null);
		link.add("rangeela");
		link.add("ramleela");
		link.add("leela");
		
		
		Iterator<String> it=link.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}
