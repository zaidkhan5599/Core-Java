package com.Interface;

public class Cylinder implements Shape{
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (2*PI*rad*height)+(2*PI*rad*rad);
	}
	double rad;
	double height;
	public Cylinder(double rad, double height) {
		super();
		this.rad = rad;
		this.height = height;
	}

}
