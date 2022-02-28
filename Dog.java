package com.abstraction;

public class Dog extends Animal{
	Dog(){
		
	}
	Dog(double height){
		super(height);
	}
	@Override
	void talk() {
		System.out.println("Bow Bow.......");
	}

}
