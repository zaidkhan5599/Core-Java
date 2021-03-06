package com.ty.springcore.beans;

import java.util.List;

public class Tourist {
	private String name;
	private List<String> countryVisited;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCountryVisited() {
		return countryVisited;
	}
	public void setCountryVisited(List<String> countryVisited) {
		this.countryVisited = countryVisited;
	}
	@Override
	public String toString() {
		return "Tourist [name=" + name + ", countryVisited=" + countryVisited + "]";
	}
	

}
