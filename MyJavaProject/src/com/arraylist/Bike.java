package com.arraylist;

public class Bike {
	String name;
	double mileage;
	Bike(){
		
	}

	Bike(String name,double mileage){
		this.name=name;
		this.mileage=mileage;
	}
	public String toString() {
		return "Name of the bike is "+name+" and mileage is :"+mileage;
	}
}
