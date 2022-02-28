package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class BoxOffice {
	public static void main(String[] args) {
		ArrayList<Movie> ls=new ArrayList<>();
		ls.add(new Movie("Bahubali 2",2017,5));
		ls.add(new Movie("Sholey",1971,3.5));
		ls.add(new Movie("Avengers",2019,4.5));
		ls.add(new Movie("Sairat",2018,1));
		ls.add(new Movie("Krik Part",2016,4.5));
		System.out.println("Before Sorting");
		for(Movie m:ls) {
			System.out.println(m);
		}
		Collections.sort(ls);
		System.out.println("After Sorting by year");
		for(Movie m:ls) {
			System.out.println(m);
		}
		System.out.println("++++++++++");
		System.out.println("sorted by ratings ");
		Collections.sort(ls, new SortByRating());
		for(Movie m:ls) {
			System.out.println(m);
		}
		System.out.println("++++++++++");
		System.out.println("sorted by Name ");
		Collections.sort(ls, new SortByName());
		for(Movie m:ls) {
			System.out.println(m);
		}
		
	}
}
