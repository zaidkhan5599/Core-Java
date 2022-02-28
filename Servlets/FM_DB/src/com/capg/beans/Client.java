package com.capg.beans;

import java.util.Scanner;

public class Client {
	private int id;
	private String cust_name;
	private String address;
	private String telephone;
	private String email;
	private String password;
    private Orders order;
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	Scanner sc = new Scanner(System.in);
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private Contract con;
	
	

	public Contract getCon() {
		return con;
	}
	public void setCon(Contract con) {
		this.con = con;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Client(int id, String cust_name, String address, String telephone, String email) {
		
		this.id = id;
		this.cust_name = cust_name;
		this.address = address;
		this.telephone = telephone;
		this.email = email;
		
	}
	public Client() {
		
		
		
	}
	@Override
	public String toString() {
		return "Customer id=" + id +"\n" +", cust_name=" + cust_name +"\n"+ ", address=" + address +"\n"+ ", telephone=" + telephone
				+"\n"+ ", email=" + email +"\n"+"============="+"";
	}
	
	

}
