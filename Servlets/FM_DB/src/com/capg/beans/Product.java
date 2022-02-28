package com.capg.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
	private Integer product_id;
	private String product_name;
	
	private long quantity;
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	Scanner sc = new Scanner(System.in);
	
//	public Product(Integer product_id, String product_name, String product_description) {
//		
//		this.product_id = product_id;
//		this.product_name = product_name;
//		this.product_description = product_description;
//	}
	public Product() {
		System.out.println("Enter product id");
		this.product_id= Integer.parseInt(sc.nextLine());
		System.out.println("Enter Product name");
		this.product_name = sc.nextLine();
		System.out.println("Enter product quantity");
		this.quantity=Long.parseLong(sc.nextLine());
		
		
		
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product product_id=" + product_id +"\n"+ ", product_name=" + product_name +"\n"+ ", product_quantity="
				+quantity+"\n"+ "======================";
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	

}
