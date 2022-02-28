package com.dev.beans;

import java.util.List;

public class Inventories {
	
	private List<Product>ls;
	@Override
	public String toString() {
		return ls.toString();
	}
	public List<Product> getLs() {
		return ls;
	}
	public void setLs(List<Product> ls) {
		this.ls = ls;
	}

}
