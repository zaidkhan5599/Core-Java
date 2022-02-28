package com.polymorphism;

public class BMW extends Car{
	BMW(){
		
	}
	BMW(String name,double mileage,String type){
		super(name,mileage,type);
	}
void move (String loc) {
	System.out.println("BMW of type "+type + " is moving to "+loc);
}
}
