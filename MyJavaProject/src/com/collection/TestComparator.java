package com.collection;

import java.util.TreeSet;

public class TestComparator {

	public static void main(String[] args) {
		DescTree comp=new DescTree();
		
		TreeSet ts=new TreeSet<>(comp);
		ts.add("david");
		ts.add("charles");
		ts.add("martin");
		ts.add("john");
		ts.add("pablo");
		ts.add("escobar");
		
		for(Object s:ts) {
			System.out.println(s);
		}
	}

}
