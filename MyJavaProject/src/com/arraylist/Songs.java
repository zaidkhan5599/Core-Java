package com.arraylist;

public class Songs implements Comparable<Songs>{
	@Override
	public int compareTo(Songs o) {
		return this.year-o.year;
	}
	String name;
	double duration;
	int year;

	 public Songs() {
		 
	 }
	 public Songs(String name, double duration, int year) {
		this.name = name;
		this.duration = duration;
		this.year = year;
	}
	public String toString() {
		return "Song name "+name+"\n Duration : "+duration+"\n and year is "+year;
	}
	
}
