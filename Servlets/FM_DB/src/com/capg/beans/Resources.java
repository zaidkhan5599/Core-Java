package com.capg.beans;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Resources {
	private String resourceName;
	private String resourceDescription;
	private long resource_quantity;
	private Integer product_id;
	Scanner sc = new Scanner(System.in);
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceDescription() {
		return resourceDescription;
	}
	@Override
	public String toString() {
		return "Resources :resourceName=" + resourceName+"\n" + ", resourceDescription=" + resourceDescription
				+"\n"+ ", resource_quantity=" + resource_quantity +"\n"+ ", product_id=" + product_id +"\n"+ "======================";
	}
	public void setResourceDescription(String resourceDescription) {
		this.resourceDescription = resourceDescription;
	}
	public Resources() {
		System.out.println("Enter resources name");
		this.resourceName= sc.nextLine();
		System.out.println("Enter resource description");
		this.resourceDescription= sc.nextLine();
		System.out.println("Enter resource quantity");
		this.resource_quantity=Long.parseLong(sc.nextLine());
		System.out.println("Enter resource id assigned");
		this.product_id= Integer.parseInt(sc.nextLine());
		
	}
	public Long getResource_quantity() {
		return resource_quantity;
	}
	public void setResource_quantity(long resource_quantity) {
		this.resource_quantity = resource_quantity;
	}
	
	

}
