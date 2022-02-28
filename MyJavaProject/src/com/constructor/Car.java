/*Assignment:
 WAP using has - a relationship.
Create Engine class and Car class. Use engine object inside Car.
*/
package com.constructor;

public class Car {
	String color;
	double mileage;
	Engine e;
	Car(String color,double mileage,Engine e){
		this.color=color;
		this.mileage=mileage;
		this.e=e;
	}
	public static void main(String[] args) {
			Car c=new Car("violet",35.5,new Engine(1500));
			System.out.println("Color of the car is "+c.color);
			System.out.println("Mileage of the car is "+c.mileage);
			System.out.println("CC of the car is "+c.e.cc);
	}

}
