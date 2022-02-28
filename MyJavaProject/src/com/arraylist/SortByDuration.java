package com.arraylist;

import java.util.Comparator;

public class SortByDuration implements Comparator<Songs>{

	@Override
	public int compare(Songs o1, Songs o2) {
		return (int)(o1.duration-o2.duration);
	}
	

}
