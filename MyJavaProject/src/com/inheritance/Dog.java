package com.inheritance;

public class Dog extends Animal {
	
	Dog(){
		
	}
	Dog(double height,double weight,String breed){
		super(height,weight);
			}
	void sniffs() {
		System.out.println("Dog sniffs");
	}
}
