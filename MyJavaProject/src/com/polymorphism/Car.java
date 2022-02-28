package com.polymorphism;

public class Car extends Vehicle {
	String type;
	public Car() {
	
	}
	public Car(String name,double mileage,String type) {
		super(name,mileage);
		this.type = type;
	}
	void move() {
		System.out.println(type+" Car is moving smoothly");
	}
	
	

}
