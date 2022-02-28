package com.arraylist;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ALSongs {

	public static void main(String[] args) {
		ArrayList<Songs> al=new ArrayList<>();
		al.add(new Songs("Milne mujse hai",4.0,2019));
		al.add(new Songs("First CLass",5.0,2017));
		al.add(new Songs("Qurbaan",3.5,2015));
		//Accessing Songs Objects using Iterator
		System.out.println("Before Sorting of year field");
		Iterator<Songs> n = al.iterator();
		while(n.hasNext()) {
			System.out.println(n.next());
		}
		System.out.println("After Sorting of year field");
		Collections.sort(al);
		for(Songs s:al) {
			System.out.println(s);
		}
		//Accessing by get() method.
		System.out.println("After SortingBy Dutration");
		Collections.sort(al,new SortByDuration());
		for(int i=0;i<al.size();i++) {
			Songs ob = al.get(i);
			System.out.println(ob);
		}
		System.out.println("After SortingBy Name");
		Collections.sort(al,new SortByNames());
		//Accessing using for each loop
		for(Songs s:al) {
			System.out.println(s);
		}
		
		
		
	}

}
