package com.abstraction;

public class World {

	public static void main(String[] args) {
		Animal d=new Dog(30);
		d.talk();//Hiding the implementation and providing the 
		//functionality using an abstract class. 
	}

}
