package com.polymorphism;

public class Road {

	public static void main(String[] args) {
		Vehicle v[]=new Vehicle[4];
		v[0]=new City("BMW",15,"Violet","Luxury");
		v[1]=new Car("Honda",20,"Red");
		v[2]=new Vehicle("Car",25);
		v[3]=new City("Ambassador",5,"White","Luxury");
		
		for(int i=0;i<v.length;i++) {
			System.out.println("Vehicle name "+v[i].name);
			System.out.println("Vehicle name "+v[i].mileage);
			v[i].move("Pune");
			v[i].move();
			if(v[i] instanceof Car)
			System.out.println(((Car)v[i]).color);
			if(v[i] instanceof City)
				System.out.println(((City)v[i]).type);
			System.out.println("++++++++++++++++++++++++");
		}
		
	}

}
