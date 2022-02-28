package com.dev.beans;

import java.util.Scanner;

public class Haulier {
	@Override
	public String toString() {
		return "Haulier haulier_id="+ haulier_id + "\n"+" haulier_name=" + haulier_name+"\n" + " streetAddress="
				+ streetAddress+"\n" + "town_city=" + town_city +"\n"+ "postcode=" + postcode +"\n"+ "telephone=" + telephone
				+"\n"+ "email=" + email +"\n"+ "status=" + status +"\n" +"====================";
	}
	private Integer haulier_id;
	private String haulier_name;
	private String streetAddress;
	private String town_city;
	private String postcode;
	private String telephone;
	private String email;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	Scanner sc = new Scanner(System.in);
	public Integer getHaulier_id() {
		return haulier_id;
	}
	public void setHaulier_id(Integer haulier_id) {
		this.haulier_id = haulier_id;
	}
	public String getHaulier_name() {
		return haulier_name;
	}
	public void setHaulier_name(String haulier_name) {
		this.haulier_name = haulier_name;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getTown_city() {
		return town_city;
	}
	public void setTown_city(String town_city) {
		this.town_city = town_city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
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
//	public Haulier(Integer haulier_id, String haulier_name, String streetAddress, String town_city, String postcode,
//			String telephone, String email) {
//		
//		this.haulier_id = haulier_id;
//		this.haulier_name = haulier_name;
//		this.streetAddress = streetAddress;
//		this.town_city = town_city;
//		this.postcode = postcode;
//		this.telephone = telephone;
//		this.email = email;
//	}
	public Haulier() {
		
		System.out.println("Enter haulier id");
		this.haulier_id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter haulier_name ");
		this.haulier_name=sc.nextLine();
		System.out.println("Enter street address");
		this.streetAddress=sc.nextLine();
		System.out.println("Enter town_city");
		this.town_city=sc.nextLine();
		System.out.println("Enter email address");
		this.email=sc.nextLine();
		System.out.println("Enter telephone ");
		this.telephone= sc.nextLine();
		System.out.println("Enter postcode");
		this.postcode=sc.nextLine();
	
		// TODO Auto-generated constructor stub
	}
	
	
	
}
