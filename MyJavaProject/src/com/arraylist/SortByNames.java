package com.arraylist;

import java.util.Comparator;

public class SortByNames implements Comparator<Songs>{
		public int compare(Songs o1,Songs o2) {
			return o1.name.compareTo(o2.name);
		}
}		
