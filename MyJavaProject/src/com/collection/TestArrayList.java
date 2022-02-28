package com.collection;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		Object ob=new Object();
		ArrayList list = new ArrayList();
		list.add(12);
		list.add("Suyash");
		list.add(true);
		list.add(4.67);
		list.add(null);
		list.add(ob);
		list.add(null);
		list.add(12);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
