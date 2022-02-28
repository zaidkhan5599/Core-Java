package com.Interface;

public class Circle implements Shape{
	int r;
	@Override
	public double area() {
		return PI*r*r;
	}
	public Circle(int r) {
		this.r=r;
	}
	
}
