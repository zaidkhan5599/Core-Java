package com.arraylist;

import java.util.Comparator;

public class SortByName implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
