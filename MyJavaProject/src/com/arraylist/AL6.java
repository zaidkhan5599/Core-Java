package com.arraylist;

import java.util.ArrayList;

public class AL6 {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add('a');
		ls.add(false);
		for(Object i:ls) {
			System.out.println(i);
		}
	}

}
