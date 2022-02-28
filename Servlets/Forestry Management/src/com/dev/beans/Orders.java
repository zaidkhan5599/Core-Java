package com.dev.beans;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Orders {
	
	private String delivery_date;
	@Override
	public String toString() {
		return "Orders delivery_date=" + delivery_date + "\n"+"list of orders"+list.toString();
	}

	//private Inventories list;
	private static List<Inventories> list;
	
	public List<Inventories> getList() {
		return list;
	}
	public void setList(List<Inventories> list) {
		this.list = list;
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
