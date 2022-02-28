package com.inheritance;

public class Animal {
	double height;
	double weight;
	Animal(){
		
	}
	Animal(double height,double weight){
		this.height=height;
		this.weight=weight;
	}
	void talk() {
		System.out.println("Animal talk");
	}

}
