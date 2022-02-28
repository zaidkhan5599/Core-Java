package com.arraylist;

public class Movie implements Comparable<Movie>{

	String name;
	int year;
	double ratings;
	Movie(){
		
	}
	Movie(String name, int year, double ratings) {
		this.name = name;
		this.year = year;
		this.ratings = ratings;
	}
	public String toString() {
		return "\n Name :"+name+"\n year of release :"+year+
				"\n Ratings :"+ratings;
	}
	@Override
	public int compareTo(Movie o) {
		return this.year-o.year;
	}

}
