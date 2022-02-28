package com.capg.beans;

import java.util.List;

public class Inventories {
	private Integer inventoryId;
	private List<Product>ls;
	public Integer getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}
	public List<Product> getLs() {
		return ls;
	}
	public void setLs(List<Product> ls) {
		this.ls = ls;
	}

}
