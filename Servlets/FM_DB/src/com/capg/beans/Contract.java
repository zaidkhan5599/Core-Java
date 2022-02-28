package com.capg.beans;

public class Contract {
	private Integer contract_id;
	public Integer getContract_id() {
		return contract_id;
	}
	public void setContract_id(Integer contract_id) {
		this.contract_id = contract_id;
	}
	private String Contact_no;
	private String placedondate;
	private String delivery_date;
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}
	private Inventories list;
	private Haulier haulier;
	public Haulier getHaulier() {
		return haulier;
	}
	public void setHaulier(Haulier haulier) {
		this.haulier = haulier;
	}
	public Inventories getList() {
		return list;
	}
	public void setList(Inventories list) {
		this.list = list;
	}
	public String getContact_no() {
		return Contact_no;
	}
	public void setContact_no(String contact_no) {
		Contact_no = contact_no;
	}
	
	
	
	public String getPlacedondate() {
		return placedondate;
	}
	public void setPlacedondate(String placedondate) {
		this.placedondate = placedondate;
	}
	public Contract(String contact_no, String placedondate) {
		super();
		Contact_no = contact_no;
		this.placedondate = placedondate;
		
		
	}
	@Override
	public String toString() {
		return "Contract :Contact_no="+"\n" + Contact_no +"\n"+ ",   placedondate="
				+ placedondate +"\n"+"delivery_date"+delivery_date+ "\n"+ "================";
	}
	public Contract() {
		// TODO Auto-generated constructor stub
	}
	
	 

}
