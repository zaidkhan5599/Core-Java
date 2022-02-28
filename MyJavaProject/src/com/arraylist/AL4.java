package com.arraylist;

import java.util.ArrayList;

public class AL4 {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add("Rita");
		ls.add(20.0);
		ls.add(false);
		System.out.println(ls);
		Object ob= ls.get(0);
		System.out.println(ob);
		System.out.println(ls.get(3));
		System.out.println(ls.get(1));
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
	}

}
