package com.inheritance3;

public class Bike extends TwoW {
	double mil;
	Bike(){
		
	}
	Bike(String name,String color,double mil){
		super(name,color);
		this.mil=mil;
		
	}
	static void display(Vehicle c) {
		System.out.println("Vehicle no."+c.vno);
		System.out.println("Vehicle name "+c.name);
		
		if(c instanceof TwoW)
		{
			//Bike d=(Bike) c;
			System.out.println("Vehicle color "+((TwoW)c).color);
		}
		if (c instanceof Bike)
			System.out.println("Vehicle mileage "+c.vno+" "+((Bike)c).mil);
		
	}

}
