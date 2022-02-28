package com.arraylist;

import java.util.ArrayList;

public class AL3 {

	public static void main(String[] args) {
		ArrayList ls1=new ArrayList();
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		System.out.println("Ls1"+ls1);//10,20,30
		ArrayList ls2=new ArrayList();
		ls2.add(10);
		ls2.add(20);
		System.out.println("LS2"+ls2);
		ls1.addAll(ls2);
		
		System.out.println("After add all "+ls1);//[10,20,30,10,20]
		ls1.retainAll(ls2);
		System.out.println("Retain All "+ls1);
		System.out.println(ls1.containsAll(ls2));//[10,20,10,20]
		System.out.println("After contains all "+ls1);
		System.out.println(ls2);
		
		ls1.removeAll(ls2);//[]
		System.out.println(ls1);
	}

}
