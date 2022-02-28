package com.ty.springcore.baseInfobean;

import com.ty.springcore.annotationInterface.Animal;

public class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("Tiger eats flesh");
	}

	@Override
	public void speaks() {
		System.out.println("Tiger roars");

	}

}
