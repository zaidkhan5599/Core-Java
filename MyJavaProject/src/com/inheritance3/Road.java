package com.inheritance3;

public class Road {

	public static void main(String[] args) {
		Vehicle v=new Bike("BMW","Red",1500);
		//Bike b=new Bike();
		Bike.display(v);
	}

}
