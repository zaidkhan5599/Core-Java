package com.Interface;

public class Rectangle implements Shape{
	double length;
	double breadth;
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}
	

}
