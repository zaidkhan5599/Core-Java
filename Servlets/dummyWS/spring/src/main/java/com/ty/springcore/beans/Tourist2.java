package com.ty.springcore.beans;

import java.util.List;
import java.util.Map;

public class Tourist2 {
	private String name;
	private Map<Integer,String> countryVisited;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Integer, String> getCountryVisited() {
		return countryVisited;
	}
	public void setCountryVisited(Map<Integer, String> countryVisited) {
		this.countryVisited = countryVisited;
	}
	@Override
	public String toString() {
		return "Tourist2 [name=" + name + ", countryVisited=" + countryVisited + "]";
	}
	
	

}
