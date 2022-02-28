package com.arraylist;

import java.util.Comparator;

public class SortByRating implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return (int)(o1.ratings-o2.ratings);
	}
	

}
