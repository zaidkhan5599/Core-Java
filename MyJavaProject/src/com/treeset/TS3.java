package com.treeset;

import java.util.Collections;
import java.util.TreeSet;

public class TS3 {

	public static void main(String[] args) {
		TreeSet<Movie> ts=new TreeSet();
		ts.add(new Movie("Bahubali 2",2017,5));
		ts.add(new Movie("Sholey",1971,3));
		ts.add(new Movie("Avengers",2019,4));
		ts.add(new Movie("Sairat",2018,1));
		ts.add(new Movie("Krik Part",2016,8));
		System.out.println(ts);
		System.out.println("++++++++++++++");
		//Sorting based on rating
		TreeSet<Movie> ts1=new TreeSet<>(new SortByRatings());
		System.out.println("Sorting using TreeSet comparator Sort By rating");
		ts1.addAll(ts);
		System.out.println(ts1);
		System.out.println("++++++++++++++");
		//Sorting based on rating
		TreeSet<Movie> ts2=new TreeSet<>(new SortByName());
		System.out.println("Sorting using TreeSet comparator Sort By Name");
		ts2.addAll(ts);
		System.out.println(ts2);
		
	}

}
