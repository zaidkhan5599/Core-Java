package com.polymorphism;

public class Vehicle {
String name;
double mileage;
 Vehicle() {
	
}
 Vehicle(String name,double mileage){
	 this.name=name;
	 this.mileage=mileage;
 }
 void move() {
	 System.out.println("Vehicle is moving ");
 }
 void move(String location) {
	 System.out.println("Vehicle is moving towards "+location);
 }
}
