package com.treeset;

import java.util.Comparator;

public class SortByRatings implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.ratings-o2.ratings;
	}
	

}
