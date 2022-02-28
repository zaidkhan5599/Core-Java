package com.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TS2 {

	public static void main(String[] args) {
		TreeSet<P1> ts=new TreeSet<>();
		ts.add(new P1(10));
		ts.add(new P1(5));
		ts.add(new P1(15));
		ts.add(new P1(20));
		System.out.println(ts);
		for(P1 o:ts)//Accessing using for each
			System.out.println(o);
		Iterator<P1> n = ts.iterator();//Accessing using iterator
		while(n.hasNext()) {
			System.out.println(n.next());
		}
	}

}
