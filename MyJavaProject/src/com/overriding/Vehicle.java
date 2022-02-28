package com.overriding;

public class Vehicle {
	void move() {
		System.out.println("Vehicle moves");
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.move();
		Bike b = new Bike();
		b.move();
		Vehicle v1 = new Bike();
		v1.move();

	}
}

class Bike extends Vehicle {
	void move() {
		System.out.println("Bike moves");
	}
}