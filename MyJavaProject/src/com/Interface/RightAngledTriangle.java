package com.Interface;

public class RightAngledTriangle implements Shape {
@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}
double base;
double height;
public RightAngledTriangle(double base, double height) {
	super();
	this.base = base;
	this.height = height;
}
}
