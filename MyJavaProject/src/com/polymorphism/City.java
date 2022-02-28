package com.polymorphism;

public class City extends Car {
	String type;
	City(){
		
	}
	public City(String name, double mileage, String color,String type) {
		super(name, mileage, color);
		this.type=type;
	}
	void move(String location) {
		System.out.println(type+" Car is moving towards "+location);
	}
	
	

}
