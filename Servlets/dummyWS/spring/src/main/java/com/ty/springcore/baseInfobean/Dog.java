package com.ty.springcore.baseInfobean;

import com.ty.springcore.annotationInterface.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog eats pedgree");
	}

	@Override
	public void speaks() {
		System.out.println("Dog barks");

	}

}










