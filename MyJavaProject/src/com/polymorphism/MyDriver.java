package com.polymorphism;

public class MyDriver {
	static void display(Vehicle v) {
		System.out.println("Vehicle Name is "+v.name);
		System.out.println("Vehicle mileage is "+v.mileage);
		if (v instanceof Car)
			System.out.println("Car is of type "+((Car)v).type);
		
	}
	public static void main(String[] args) {
		Vehicle v=new BMW("BMW",25.0,"Luxury");
		//display(v);
		v.move();
		v.move("Pune");
		
	}

}
