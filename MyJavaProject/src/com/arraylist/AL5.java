package com.arraylist;

import java.util.ArrayList;

public class AL5 {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add('a');
		ls.add(false);
		//System.out.println(ls);
//		Object ob= ls.get(0);
//		System.out.println(ob);
//		System.out.println(ls.get(3));
//		System.out.println(ls.get(1));
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i) instanceof Integer)
			{
				Integer x=(Integer)ls.get(i);
				System.out.println(x);
			}
			if(ls.get(i) instanceof Character) {
				Character ch=(Character)ls.get(i);
				System.out.println(ch);
			}
			if(ls.get(i) instanceof Boolean) {
				Boolean b=(Boolean)ls.get(i);
				System.out.println(b);
			}
			}

	}
}