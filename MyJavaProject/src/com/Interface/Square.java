package com.Interface;

public class Square implements Shape{
double side;
Square(){
	
}
	Square(double side){
		this.side=side;
	}
	@Override
	public double area() {
		
		return side*side;
	}
	

}
