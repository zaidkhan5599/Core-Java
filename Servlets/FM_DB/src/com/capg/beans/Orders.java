package com.capg.beans;

import java.util.Date;
import java.util.Scanner;

public class Orders {
	@Override
	public String toString() {
		return "Orders order_no="+ order_no +"\n"+ ", delivery_date=" + delivery_date 
				+"\n" +"==============================";
	}
	private Integer order_no=0;
	private String delivery_date;
	private Product product;
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	Scanner sc = new Scanner(System.in);
	public Integer getOrder_no() {
		return order_no;
	}
	public void setOrder_no(Integer order_no) {
		this.order_no = order_no;
	}
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}
	
	public Orders() {
//		System.out.println("Enter order no");
//		this.order_no = Integer.parseInt(sc.nextLine());
		Date nom = new Date();
		this.delivery_date=nom.toString();
			
		
		
		
		
	}
	
	
	
	

}
