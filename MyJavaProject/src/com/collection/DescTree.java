package com.collection;

import java.util.Comparator;

public class DescTree implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String )o2;
		int i=s2.compareTo(s1);
		return i;
	}
	

}
