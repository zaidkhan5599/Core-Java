package com.arraylist;

import java.util.ArrayList;

public class AL1 {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ArrayList ls1=new ArrayList();
		System.out.println(ls.isEmpty());
		System.out.println(ls.size());
		Object ob=new Object();
		ls.add(10);
		ls.add(20.0);
		ls.add("rani");
		System.out.println(ls);
		System.out.println(ls.size());
		ls.add(2, "Raja");
		System.out.println(ls);
		System.out.println(ls.set(2, "kjkljkjkg"));
		System.out.println(ls);
		System.out.println(ls.remove(2));
		//System.out.println(ls);
		System.out.println(ls.remove((Object)10));
		System.out.println(ls.contains(10));
		System.out.println("+++++++++++++");
		System.out.println(ls.subList(1,2 ));
		ls.add(2, "Hi");
		ls.add(ob);
		//System.out.println(ls.get(2));
		System.out.println(ls.indexOf(10));
		System.out.println(ls.lastIndexOf(10));
		System.out.println(ls.add(null));
		System.out.println(ls.add(10));
		
		ls1.addAll(ls);
		for(int i=0;i<ls1.size();i++) {
			System.out.println(ls1.get(i));
		}
		
		System.out.println(ls);
		ls.clear();
		System.out.println(ls);
		
	}

}
